using Tourism.Data;

namespace Tourism.Model;

public class SiteModel
{
    public IEnumerable <Visitor> GetVisotors ()
    {
      using var site= new SiteDbContext();
      var selection = from t in site.Traveler
                       where t.Id.Length > 3;

                       selection new Visitor
                       {
                        name = t.Id,
                        visit = t.Tours.Count,
                        recent = t.Tours.Max(x => x.Checkin),
                        stars =new string('*', t.Rating);                        
                        };
                        return selection.ToList();
   
    } 


    public void AcceptVisitors(string visitorId , int visitorRating)
    {
        using var site= new SiteDbContext();

        var traveler = traveler.Travelers.Find(visitorId)
        if(traveler is null)
        {
            traveler = new Traveler{Id = visitorId};
            site.Travelers.Add(traveler);
        }

        traveler.Tours.Add(new Trip());
        traveler.Rating = visitorRating;
        site.SaveChanges();
    }
}