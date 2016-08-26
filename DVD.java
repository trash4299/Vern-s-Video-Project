
import javax.swing.JOptionPane;
public class DVD
{
    private int id;
    private String title;
    private String rating;
    private int quantity;
    private int stock;
    
    public DVD()
    {
        id = 0;
        title = "";
        rating = "";
        quantity = 0;
        stock = 0;
    }
    
    public DVD(int ident, String name, String rate, int quant)
    {
        id = ident;
        title = name;
        rating = rate;
        quantity = quant;
        stock = quant;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void rent()
    {
        if(stock>0)
        {
            stock--;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Not enough in stock.");
        }
    }
    
    public void returnDvd()
    {
        stock++;
    }
    
    public String toString()
    {
        return id+"\t"+stock+"\t"+rating+"\t"+title;
    }
}
