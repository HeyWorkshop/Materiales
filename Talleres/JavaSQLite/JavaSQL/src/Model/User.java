package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Reynaldo
 */
public class User {
    String fName, lName, uName, pswd, bDate, address;
    
    public User(String nombre, String apellido, String usuario, String contra, Date fNaci, String domicilio) {
        fName = nombre;
        lName = apellido;
        uName = usuario;
        pswd = contra;
        setbDate(fNaci);
        address = domicilio;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getbDate() {
        return bDate;
    }

    private void setbDate(Date date) {
        String bDate= "0";
        
        if(date != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            bDate = dateformat.format(date);

            if(bDate == null) { 
                bDate = "0"; 
            }
        }
        
        this.bDate = bDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String[] getData(){
        return(
            new String[] { 
                getfName(), getlName(), getuName(), getPswd(), getbDate(), getAddress()
            }
        );
    }
}