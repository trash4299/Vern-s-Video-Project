
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFrame;

public class Admin
{
    private boolean firstTime;
    private String password;
    private String q;
    private String s;
    public JFrame frame;
   
    public Admin()
    {
        firstTime=true;
        s="";
        q="";
        frame = new JFrame();
    }
    
    public void trySetCreds()
    {
        if(firstTime==true)
        {
            do
            {
                s = JOptionPane.showInputDialog(frame,"Enter a new password:","Set Password",JOptionPane.PLAIN_MESSAGE);
                q = JOptionPane.showInputDialog(frame,"Re-enter password:","Set Password",JOptionPane.PLAIN_MESSAGE);
                s.replaceAll("//","////");
                q.replaceAll("//","////");
            }while(s.equals(q)==false);
        }
        else
        {
            setCreds();
        }
    }
    
    private void setCreds()
    {
        do
        {
            s = JOptionPane.showInputDialog(frame,"Enter a new password:","Set Password",JOptionPane.PLAIN_MESSAGE);
            q = JOptionPane.showInputDialog(frame,"Re-enter password:","Set Password",JOptionPane.PLAIN_MESSAGE);
            s.replaceAll("//","////");
            q.replaceAll("//","////");
        }while(contCheck()==true);
    }
    
    private boolean contCheck()
    {
        if(s.equals(q))
            return false;
        int n = JOptionPane.showConfirmDialog(frame,"Passwords do not match. Try again or cancel.","Error",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        if(n==0)
            return true;
        else 
            return false;
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
