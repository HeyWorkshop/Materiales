# Comandos SQL
![SQL](https://udemy-images.udemy.com/course/750x422/46674_1196_6.jpg)

## Establecer Conexión con DB
```java
Connection connection = null;
Class.forName("org.sqlite.JDBC");
connection = DriverManager.getConnection("jdbc:sqlite:user.db");
```	
Si _user.db_ no existe, se debe crear antes de poder realizar operaciones C.R.U.D.(Create, Read, Update, Delete).


## Crear Tabla
Para poder usar el _AUTOINCREMENT_ (que autoincrementa el id de cada usuario creado) tenemos que usar el tipo de dato _INTEGER_ en ves del _INT_.

Si no existe una tabla antes de hacer cualquier operación C.R.U.D., tendremos problemas.

```java
Statement stmt = connection.createStatement();
String sql = "CREATE TABLE USERS " +
	"(ID	INTEGER	PRIMARY KEY	AUTOINCREMENT," +
	" FNAME		VARCHAR(20)		NOT NULL, " + 
	" LNAME		VARCHAR(20), " + 
	" UNAME		VARCHAR(20)		NOT NULL, " + 
	" PSWD		VARCHAR(20)		NOT NULL, " + 
	" BDATE		CHAR(10), " + 
	" ADDRESS	TEXT)";

stmt.executeUpdate(sql);
stmt.close();
```

## Insertar Datos
Datos deben insertarse en el _mismo orden_ que estan las columnas de la tabla.

```java
boolean userAdded = false;
PreparedStatement ps;
String query = "INSERT INTO USERS " + 
	"(FNAME, LNAME, UNAME, PSWD, BDATE, ADDRESS)" + 
	" VALUES (?,?,?,?,?,?)";

try {
	ps = connection.prepareStatement(query);
	ps.setString(1, "Nombre");
	ps.setString(2, "Apellido");
	ps.setString(3, "Nombre de Usuario");
	ps.setString(4, "Contraseña");
	ps.setString(5, "Fecha de Nacimiento");
	ps.setString(6, "Dirección");
	
	ResultSet rs = ps.executeQuery();
	if(rs.next()) {
		userAdded = true;
	} 
}
catch (SQLException e) {
	Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, e);
}
```

## Leer Datos

_Revisar si existe el Nombre de Usuario_

```java
boolean checkUser = false;
PreparedStatement ps;
ResultSet rs;
    
String query = "SELECT * FROM USERS WHERE UNAME=?";
    
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
```

_Validar Usuario_

```java
boolean isUser = false;
PreparedStatement ps;
ResultSet rs;
    
String query = "SELECT * FROM USERS WHERE UNAME=? AND PSWD=?";
    
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
```

_Desplegar información del Usuario_

```java
String nombre, apellido, nUsuario, contra, fNaci, domicilio;
PreparedStatement ps;
ResultSet rs;
    
String query = "SELECT * FROM USERS WHERE UNAME=?";
    
try {
    ps = connection.prepareStatement(query);
    ps.setString(1, "Nombre de Usuario");
    
    rs = ps.executeQuery();
    
    while(rs.next()) {
    	nombre = rs.getString("FNAME");
    	apellido = rs.getString("LNAME");
    	nUsuario = rs.getString("UNAME");
    	contra = rs.getString("PSWD");
    	fNaci = rs.getString("BDATE");
    	domicilio = rs.getString("ADDRESS");
    }
    
    rs.close();
}  
catch (SQLException e) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
}

```

## Actualizar Datos
```java
boolean userUpdated = false;
PreparedStatement ps;
    
String query = "UPDATE USERS SET" +
	" FNAME=?, LNAME=?, UNAME=?, PSWD=?, BDATE=?, ADDRESS=?" +
	" WHERE UNAME=? AND PSWD=?";
    
try {
    ps = connection.prepareStatement(query);

	ps.setString(1, "Nombre");
	ps.setString(2, "Apellido");
	ps.setString(3, "Nuevo Nombre de Usuario");
	ps.setString(4, "Nueva Contraseña");
	ps.setString(5, "Fecha de Nacimiento");
	ps.setString(6, "Domicilio");
	ps.setString(7, "Antiguo Nombre de Usuario");
	ps.setString(8, "Antigua Contraseña");
    
    if(ps.executeUpdate() > 0) {
        userUpdated = true;
    }
}  
catch (SQLException e) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
} 
```

## Borrar Datos
```java
boolean userDeleted = false;
PreparedStatement ps;
    
String query = "DELETE FROM USERS WHERE UNAME=? AND PSWD=?";
    
try {
    ps = connection.prepareStatement(query);
    ps.setString(1, "Nombre de Usuario");
    ps.setString(2, "Contraseña");
    
    if(ps.executeUpdate() > 0) {
        userDeleted = true;
    }
}  
catch (SQLException e) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
}
```

## [Demo](/Talleres/JavaSQLite/Demo.md)