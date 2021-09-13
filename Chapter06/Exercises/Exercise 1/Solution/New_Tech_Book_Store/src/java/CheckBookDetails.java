import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class CheckBookDetails
{
    private String BookName;
    private HtmlOutputText BookId, BookAuthor, BookPrice, Category;
    public CheckBookDetails() {    }
    public void BookDetailsAction(ValueChangeEvent vce)
    {
        String id = vce.getNewValue().toString();
        String cId=" ", cAuthor="", cCategory="", cPrice="";
        if(id.compareTo("A Noted Traveller")==0)
        {
            cId="A-101";
            cAuthor="James-Whitcomb-Riley";
            cCategory="Novel";
            cPrice="$100";
        }
        else if(id.compareTo("Silverlight 4") == 0)
        {
           cId="A-201";
            cAuthor="Matthew MacDonald ";
            cCategory="Technology";
            cPrice="$200";
        }
        else if(id.compareTo("HTML 5") == 0)
        {
            cId="A-301";
            cAuthor="Peter Lubbers";
            cCategory="Web Technology";
            cPrice="$200";
        }
        else if(id.compareTo("America For Me") == 0)
        {
            cId="A-401";
            cAuthor="Henry-Van Dyke ";
            cCategory="Novel";
            cPrice="$150";
        }
        getBookId().setValue(cId);
        getBookAuthor().setValue(cAuthor);
        getCategory().setValue(cCategory);
        getBookPrice().setValue(cPrice);
    }

    /**
     * @return the BookName
     */
    public String getBookName() {
        return BookName;
    }

    /**
     * @param BookName the BookName to set
     */
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    /**
     * @return the BookId
     */
    public HtmlOutputText getBookId() {
        return BookId;
    }

    /**
     * @param BookId the BookId to set
     */
    public void setBookId(HtmlOutputText BookId) {
        this.BookId = BookId;
    }

    /**
     * @return the BookAuthor
     */
    public HtmlOutputText getBookAuthor() {
        return BookAuthor;
    }

    /**
     * @param BookAuthor the BookAuthor to set
     */
    public void setBookAuthor(HtmlOutputText BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    /**
     * @return the BookPrice
     */
    public HtmlOutputText getBookPrice() {
        return BookPrice;
    }

    /**
     * @param BookPrice the BookPrice to set
     */
    public void setBookPrice(HtmlOutputText BookPrice) {
        this.BookPrice = BookPrice;
    }

    /**
     * @return the Category
     */
    public HtmlOutputText getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(HtmlOutputText Category) {
        this.Category = Category;
    }
 
}
