/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@RequestScoped
public class RegistrationForm {
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String contactNumber;
    private String emailID;
    private String userID;
    private String password;
    private String confirmPassword;
    private Date dateofBirth;
    private String FinalPassword;
    /** Creates a new instance of RegistrationForm */
    public RegistrationForm() {
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the emailID
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * @param emailID the emailID to set
     */
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
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
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * @return the dateofBirth
     */
    public Date getDateofBirth() {
        return dateofBirth;
    }

    /**
     * @param dateofBirth the dateofBirth to set
     */
    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
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
   public void validateEmail(FacesContext fc, UIComponent c, Object value)throws ValidatorException
    {
        String email= (String)value;
        Pattern mask = null;
        mask = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher matcher = mask.matcher(email);
        if (!matcher.matches())
         {
           FacesMessage message = new FacesMessage();
           message.setDetail("Invalid e-mail ID");
           message.setSummary("Invalid e-mail ID");
           throw new ValidatorException(message);
        }
    }
    public void validateFinalPassword(FacesContext fc, UIComponent c, Object value)throws ValidatorException
    {
        setFinalPassword((String) value);
    }
    public void validateCPassword(FacesContext fc, UIComponent c, Object value)throws ValidatorException
    {
        String cPassword= (String)value;
        RegistrationForm rf=new RegistrationForm();
        System.out.println(getFinalPassword());
        if (cPassword.compareTo(getFinalPassword())!=0 )
         {
           FacesMessage message = new FacesMessage();
           message.setSummary("Password does not match");
           throw new ValidatorException(message);
        }
    }
    public void validateName(FacesContext fc, UIComponent c, Object value)
    {
      if ( ((String)value).contains("!")||((String)value).contains("@")||((String)value).contains("#")||((String)value).contains("$")||((String)value).contains("%")||((String)value).contains("&")||((String)value).contains("*"))throw new ValidatorException(
      new FacesMessage("Name cannot contain special characters"));
    }
}
