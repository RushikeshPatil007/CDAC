namespace Toursim.Data;

public class Traveler
{
    public string Id{get ; set;}

    public int Rating {get;set;}

    public List<Trip> Tours {get;set;}=[]
}