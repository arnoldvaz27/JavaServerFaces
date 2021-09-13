/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author saurabh.kataria
 */
@ManagedBean
@RequestScoped
public class CheckLogin {
  private String UserID, Password;
private String value;
    /** Creates a new instance of CheckLogin */
    public CheckLogin() {
    }
   
    public String Check()
    {
        if( (getUserID().compareTo("student")==0) && (getPassword().compareTo("password@123")==0))
        {           
            return "true";
        }
        else
        {            
            return "false";
        }
    }
   
    /**
     * @return the UserID
     */
    public String getUserID() {
        return UserID;
    }

    /**
     * @param UserID the UserID to set
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }



}
