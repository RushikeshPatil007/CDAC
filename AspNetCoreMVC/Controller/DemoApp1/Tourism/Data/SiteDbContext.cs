using Microsoft.EntityFrameworkCore;
namespace Toursim.Data;

public class SiteDbContext : SiteDbContext
{
   
   public DbSet <Traveler> Travelers {get;set;}


   public SiteDbContext()
   {
    Database.EnsureCreated();
}

  protected override void OnConfiguring(DbContextOptionsBuilder optionBuilder)
  {
    optionBuilder.UseSqlite("Data Source = site.db");
  }
}