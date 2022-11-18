
public class DrivingLicense
{
    private String name;
    private String surname, address,  postalCode, city, category ;
    private int number, year;
    
    public String getName()
    {
    return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name  + " " + surname;
    }
        
}
    
