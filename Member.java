
class Member
{
    private int memNum;
    private String name;
    private int rented;
    
    public Member()
    {
        memNum = 0;
        name = "";
        rented = 0;
    }
    
    public Member(String nam, int num)
    {
        memNum = num;
        name = nam;
        rented = 0;
    }
    
    public Member(String nam, int num, int rents)
    {
        memNum = num;
        name = nam;
        rented = rents;
    }
    
    public String toString()
    {
        return memNum+"\t"+name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return memNum;
    }
}
