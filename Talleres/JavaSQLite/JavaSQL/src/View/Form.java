package View;

import javax.swing.JFrame;

/**
 * @author Reynaldo
 */

//Sin modificador solo las clases en el paquete "View" tienen acceso
class Form {
    //Config basico de formulario
    public static void setupForm(JFrame form) {
        form.setVisible(true);                                //Hacer visible el formulario
        form.pack();                                          //Establece dimensiones preferidas del formulario
        form.setLocationRelativeTo(null);                     //Centrar formulario en medio de la pantalla
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Operacion cuando pantalla se cierra
    }
    
    //Config cuando se inicializa el formulario
    public static void initForm(JFrame form) {
        form.setResizable(false);         //Mantener Pantalla de tamaño determinado (No permitir cambiar tamaño de pantalla)
        form.setLocationRelativeTo(null); //Centrar el Formulario
    }
}