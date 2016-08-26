import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MovieList
{
    private ArrayList<DVD> myDvds;
    
    public MovieList()
    {
        myDvds = new ArrayList<DVD>();
    }
    
    public String readFile(String location)
    {
        try
        {
            Scanner inF = new Scanner(new File(location));
            inF.nextLine();
            while(inF.hasNextLine())
            {
                Scanner line = new Scanner(inF.nextLine());
                int ident = line.nextInt();
                int quant = line.nextInt();
                String rate = line.next();
                String name = line.next();
                while(line.hasNext())
                    name += " "+line.next();
                DVD aDvd = new DVD(ident, name, rate, quant);
                myDvds.add(aDvd);
            }
            return printDvds();
        }
        catch (IOException ex)
        {
            return "File Not Found";
        }
        catch (java.util.NoSuchElementException ex)
        {
            return "File Not Found";
        }
    }
    
    public String printDvds()
    {
        String outfo="";
        outfo+="ID\tQ\tRating\tName";
        for(int x=0; x<myDvds.size();x++)
        {
             outfo+="\n"+myDvds.get(x).toString();
        }
        return outfo;
    }
    
    public String findDvd(String title)
    {
        String info="";
        for(int x=0; x<myDvds.size();x++)
        {
            String nam = myDvds.get(x).getTitle();
            int temp = nam.indexOf(title);
            if(temp>=0)
                info+="\n"+ myDvds.get(x).toString();
        }
        if(info.equals(""))
            return "Movie not found.";
        return info;
    }
    
    public String findDvd(int num)
    {
        String info="";
        for(int x=0; x<myDvds.size();x++)
        {
            if(myDvds.get(x).getId()==num)
                info+="\n"+ myDvds.get(x).toString();
        }
        return info;
    }
    
    public void checkout(int info)
    {
        for(int x=0;x<myDvds.size();x++)
        {
            if(myDvds.get(x).getId()==info)
                myDvds.get(x).rent();
        }
    }
    
    public void returnMov(int info)
    {
        for(int x=0;x<myDvds.size();x++)
        {
            if(myDvds.get(x).getId()==info)
                myDvds.get(x).returnDvd();
        }
    }
    
    public void saveFile(String location)
    {
        try
        {
            File file = new File(location);
            PrintWriter newFile = new PrintWriter(new FileOutputStream(file, false));
            
            newFile.println("ID\tQ\tRating\tName");
            for(int x=0;x<myDvds.size();x++)
            {
                newFile.println(myDvds.get(x).toString());
            }
        }
        catch (IOException x)
        {
            JOptionPane.showMessageDialog(null,"ERROR!");
        }
    }
}

