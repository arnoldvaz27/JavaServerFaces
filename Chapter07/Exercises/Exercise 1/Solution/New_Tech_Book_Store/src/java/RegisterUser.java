/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Aashish.Harneja
 */
@ManagedBean
@RequestScoped
public class RegisterUser {
     private String FirstName;
    private String LastName;
    private String Gender;
    private String Address;
    private String EmailID;
    private String DateofBirth;
    private String UserID;
    private String password;
    private String cPassword;
    private String ContactNumber;
    private String FinalPassword;



    /** Creates a new instance of RegisterUser */
    public RegisterUser() {
    }
  

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the EmailID
     */
    public String getEmailID() {
        return EmailID;
    }

    /**
     * @param EmailID the EmailID to set
     */
    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    /**
     * @return the DateofBirth
     */
    public String getDateofBirth() {
        return DateofBirth;
    }

    /**
     * @param DateofBirth the DateofBirth to set
     */
    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the cPassword
     */
    public String getcPassword() {
        return cPassword;
    }

    /**
     * @param cPassword the cPassword to set
     */
    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    /**
     * @return the ContactNumber
     */
    public String getContactNumber() {
        return ContactNumber;
    }

    /**
     * @param ContactNumber the ContactNumber to set
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

  public void validateEmail(FacesContext fc, UIComponent c, Object value)throws ValidatorException
    {
        String email= (String)value;

        Pattern mask = null;
        mask = Pattern.compile(".+@.+\\.[a-z]+");
       Matcher matcher = mask.matcher(email);
        if (!matcher.matches())
         {
           FacesMessage message = new FacesMessage();
           message.setDetail("You must enter an e-mail address in the format, abc@domain.com");
           message.setSummary("You must enter an e-mail address in the format, abc@domain.com");
           throw new ValidatorException(message);
        }
    }
  public void validateFinalPassword(FacesContext fc, UIComponent c, Object value)throws ValidatorException
    {
        FinalPassword= (String)value;
    }
      public void validateCPassword(FacesContext fc, UIComponent c, Object value)throws ValidatorException
    {
        String cPassword= (String)value;

        RegisterUser rf=new RegisterUser();
        System.out.println(getFinalPassword());
        if (cPassword.compareTo(getFinalPassword())!=0 )
         {
           FacesMessage message = new FacesMessage();
           message.setSummary("Password does not match");
           throw new ValidatorException(message);
        }
    }

    /**
     * @return the FinalPassword
     */
    public String getFinalPassword() {
        return FinalPassword;
    }

    /**
     * @param FinalPassword the FinalPassword to set
     */
    public void setFinalPassword(String FinalPassword) {
        this.FinalPassword = FinalPassword;
    }


}
