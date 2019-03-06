# Crear un Pequeño Proyecto

En Netbeans vamos a crear un nuevo proyecto.

**File** -> **New Project** -> **Java** -> **Java Application** -> **Next**
![New Project](https://netbeans.org/images_www/articles/72/java/quickstart/proj-wizard.png)


Podemos crear un nuevo JFrame Form.

**Clic Derecho** en paquete -> **New** -> **JFrame Form...**
![JFrame](http://2.bp.blogspot.com/-OJ9sCJsXUJk/T6Y6qPzFQqI/AAAAAAAAAEc/A0cN2vcs3ys/s1600/1.jpg)

De la misma manera podemos crear un nuevo Java Class o Package.


## Como Cambiar tu Pantalla Inicial

Podemos cambiar la pantalla donde empieza nuestra Aplicación cuando lo ejecutamos haciendo clic en:

**Run** -> **Set Project Configuration** -> **Customize**

En la sección de **Main Class** hacer clic en **Browse** y selecciona tu _Main Class_.


## Codigo Basico para el Demo

### Conectar a Base de Datos

```java
public static DAO dao = new DAO(); 

public static Connection getConnection() {
    Connection connection = null;
  
    try {
       Class.forName("org.sqlite.JDBC");
       connection = DriverManager.getConnection("jdbc:sqlite:user.db");
    } 
    catch (Exception e) {
       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
       System.exit(0);
    }
    
    return connection;
}
```

### Revisión de Datos
    
_Revisar datos para crear nuevo Usuario_

```java
public static String newUser(String uName, String pswd, String rePswd) {
    String msg;
    
    msg = checkData(uName, pswd, rePswd);
    
    if(dao.createUser(uName, pswd)) {
        msg = "Nuevo Usuario Añadido";
    }
    else {
        msg = "No se pudo crear el Usuario";
    }
    
    return msg;
}
```
   
_Revisar datos antes de iniciar sesion_

```java
public static String tryLogin(String uName, String pswd) {
    String msg;
    
    if(uName.equals("") || pswd.equals("")) {
        msg = "Introduzca los datos del Usuario";
    }
    else if(dao.validateUser(uName, pswd)) {
        msg = "Bienvenido!";
    }
    else {
        msg = "Datos Erróneos";
    }
    
    return msg;
}
```

_Enseñar datos del Usuario_

```java
public static void loginUser(String uName, WelcomeForm welcomeForm) {
    welcomeForm.showUserInfo(dao.readDbUserInfo(uName));
}
```

_Revisar datos para actualizar Usuario_

```java
public static String updateUser(String oldUName, String newUName, String oldPswd, String newPswd, String newRePswd) { 
    if(oldUName.equals("") || oldPswd.equals("")) {
        return("Introduzca antiguo Nombre de Usuario y Contraseña para cambiar datos");
    }
    
    String msg;
    
    msg = checkData(newUName, newPswd, newRePswd);
    
    if(dao.updateUser(newUName, newPswd, oldUName, oldPswd)) {
        msg = "Usuario Actualizado";
    }
    else {
        msg = "No se pudo actualizar el Usuario";
    }
    
    return msg;
}
```

_Revision similar para Nuevo Usuario y Actualización_

```java
private static String checkData(String uName, String pswd, String rePswd) {
    String msg = "";
    
    if(uName.equals("")) {
        msg = "Introduzca un Nombre de Usuario";
    }
    else if(pswd.equals("")) {
        msg = "Introduzca Contraseña";
    }
    else if(!pswd.equals(rePswd)) {
        msg = "Introduzca misma Contraseña de nuevo";
    }
    else if(dao.checkIfUsernameExists(uName)) {
        msg = "Nombre de Usuario ya existe";
    }
    
    return msg;
}
```
 
_Revisar datos para borrar un Usuario_

```java
public static String deleteUser(String uName, String pswd) {
    String msg;
    
    if(uName.equals("") || pswd.equals("")) {
        msg = "Introduzca los datos del Usuario";
    }
    else if(dao.deleteUser(uName, pswd)) {
        msg = "Usuario Borrado";
    }
    else {
        msg = "No se pudo borrar el Usuario";
    }
    
    return msg;
}
```


### Database Access Object (DAO) 
_Para realizar operaciones con la Base de Datos_

EN TU PAQUETE NO OLVIDES AÑADIR EL **SQLITE JDBC .jar**

```java
private final Connection connection = JDBC.getConnection();

public DAO() {	
	checkIfTableExists();
}

private void checkIfTableExists() {
    try {
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet tables = dbmd.getTables(null, null, "USERS", null);
        
        if (tables.next()) { //Revisar si hay informacion en la tabla USERS
          System.out.println("Conexion Exitosa!");
        }
        else {
            Statement stmt = connection.createStatement();
            String sql = "CREATE TABLE USERS " +
                "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " UNAME     VARCHAR(20)     NOT NULL, " + 
                " PSWD      VARCHAR(20)     NOT NULL)"; 
            stmt.executeUpdate(sql);
            
            stmt.close();            
            tables.close();
        } 
    }
    catch(Exception e) {
       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
       System.exit(0);
    }
}
```
    
_Crear Nuevo Usuario_

```java
public boolean createUser(String uName, String pswd) {
    boolean userAdded = false;
	PreparedStatement ps;
	String query = "?"
	
	try {
		ps = connection.prepareStatement(query);
		ps.setString(1, "Nombre de Usuario");
		ps.setString(2, "Contraseña");
		
		if(ps.executeUpdate() > 0) {
            userAdded = true;
        }
	catch (SQLException e) {
		Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, e);
	}
    
    return userAdded;
}
```
    
_Revisar si Nombre de Usuario existe_

```java
public boolean checkIfUsernameExists(String uName) {
    boolean checkUser = false;
	PreparedStatement ps;
	ResultSet rs;
	    
	String query = "?";
	    
	try {
	    ps = connection.prepareStatement(query);
	    ps.setString(1, "Nombre de Usuario");
	    
	    rs = ps.executeQuery();
	    
	    if(rs.next()) {
	        checkUser = true;
	    }
	    rs.close();
	} 
	catch (SQLException e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    }
    
    return checkUser;
}
```

  
_Validar Usuario_

```java 
public boolean validateUser(String uName, String pswd) {
    boolean isUser = false;
	PreparedStatement ps;
	ResultSet rs;
	    
	String query = "?";
	    
	try {
	    ps = connection.prepareStatement(query);
	
	    ps.setString(1, "Nombre de Usuario");
	    ps.setString(2, "Contraseña");
	    rs = ps.executeQuery();
	    
	    if(rs.next()) {
	        rs.close();
	        isUser = true;
	    }
	}  
	catch (SQLException e) {
		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	}

    return isUser;
}
```
    
_Obtener los datos del Usuario para desplegar_

```java
public String[] readDbUserInfo(String userName) {
	String uName="", pswd="";
	PreparedStatement ps;
	ResultSet rs;
	    
	String query = "?";
	    
	try {
	    ps = connection.prepareStatement(query);
	    ps.setString(1, "Nombre de Usuario");
	    
	    rs = ps.executeQuery();
	    
	    while(rs.next()) {
	    	uName = rs.getString("UNAME");
	    	pswd = rs.getString("PSWD");
	    }
	    
	    rs.close();
	}  
	catch (SQLException e) {
	    Logger.getLogger(WelcomeForm.class.getName()).log(Level.SEVERE, null, e);
	}
    
    return (new String[] {uName, pswd} );
}
```
    
_Actualizar Usuario_

```java
public boolean updateUser(String newUName, String newPswd, String oldUName, String oldPswd) {
    boolean userUpdated = false;
    PreparedStatement ps;
    
    String query = "?";
    
    try {
        ps = connection.prepareStatement(query);

        ps.setString(1, "Nuevo Nombre de Usuario");
        ps.setString(2, "Nueva Contraseña");
        ps.setString(3, "Antiguo Nombre de Usuario");
        ps.setString(4, "Antigua Contraseña");
        
        if(ps.executeUpdate() > 0) {
            userUpdated = true;
        }
    }  
    catch (SQLException e) {
        Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, e);
    }
    
    return userUpdated;
}
```
   
_Borrar Usuario_

```java
public boolean deleteUser(String userName, String password) {
    boolean userDeleted = false;
    PreparedStatement ps;
    
    String query = "?";
    
    try {
        ps = connection.prepareStatement(query);
        ps.setString(1, "Nombre de Usuario");
        ps.setString(2, "Contraseña");
        
        if(ps.executeUpdate() > 0) {
            userDeleted = true;
        }
    }  
    catch (SQLException e) {
        Logger.getLogger(DeleteForm.class.getName()).log(Level.SEVERE, null, e);
    }
    
    return userDeleted;
}
```

### WelcomeForm
```java
public void showUserInfo(String[] userInfo) {
    this.jLabelUN.setText(userInfo[0]);    //Nombre de Usuario
    this.jLabelPswd.setText(userInfo[1]);  //Contraseña
}
```

### Config Basico del Formulario (Form)

```java
public static void setupForm(JFrame form) {
    form.setVisible(true);       
    form.pack();                        
    form.setLocationRelativeTo(null);  
    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
public static void initForm(JFrame form) {
    form.setResizable(false);        
    form.setLocationRelativeTo(null); 
}
```

### Acciones de Formularios

_Mensaje de Dialogo_

```java
JOptionPane.showMessageDialog(null, msg);

JOptionPane.showMessageDialog(null, msg, "--- Failed", WARNING_MESSAGE);
```
_Minimizar_

```java
this.setState(JFrame.ICONIFIED);
```

_Cerrar_

```java
System.exit(0);

this.dispose();
```

## Texto

_Tahoma_ **Bold** (24) 

_Lucida Grande_ Plain (13)

## Colores
|**Azul**| **Verde**|**Naranja**|**Gris Oscuro**|**Gris Claro**|
|--------|:---------|:----------|:--------------|:-------------|
|0089CB  |3BB98B    |F89406     |    2C3E50     |    6C7A89    |


[Otros Colores](https://colorhunt.co/palettes/popular)

## Simbolos

|**Flecha**|**Cruz**|**Guion**|
|----------|:-------|:--------|
|⬅        |⤫       |▬        |
|←         |☓       | -       |


[Otros Simbolos](http://xahlee.info/comp/unicode_index.html)