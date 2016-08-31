
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFrame;

public class Admin
{
    private boolean firstTime;
    private String password;
    private String q;
    private String s;
   
    public Admin()
    {
        firstTime=true;
        s="";
        q="";
    }
    
    public void setCreds()
    {
        //remember to replace all /'s with double slashes
        if(firstTime==false)
        {
            
        }
        else
        {
            JFrame frame = new JFrame();
            s = JOptionPane.showInputDialog(frame,"Enter a new password:","Set Password",JOptionPane.PLAIN_MESSAGE);
            q = JOptionPane.showInputDialog(frame,"Re-enter password:","Set Password",JOptionPane.PLAIN_MESSAGE);
            if(s.equals(q)==false)
            {
                int n = JOptionPane.showConfirmDialog(frame, " Try new password or JOptionPane.YES_NO_OPTION","Passwords do not match" );
                if()
                while()
            }
        }
    }
    
    public int checkCreds(String in)
    {
        if(firstTime==true)
            return 0;
        else if(password.equals(in))
            return 1;
        else
            return -1;
        
    }
}
