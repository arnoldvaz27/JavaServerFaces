/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class Bean {
private String ID;
private String PASS;

    /** Creates a new instance of Bean */
    public Bean() {
    }
public String Action() {

if (    getID().equals("student") && getPASS().equals("password@123")) {
return "student";
}
   else {
return "error";
}
}
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getPASS() {
        return PASS;
    }
    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
}
