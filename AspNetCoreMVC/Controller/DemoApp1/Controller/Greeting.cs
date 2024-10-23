using DemoApp.Services;
using Microsoft.AspNetCore.Mvc;
unamespace.DemoApp1.Controller;

public class Greeting : Controller
{

    public IActionResult Clock()
    {
        return Content(DateTime.Now.ToString());
    }


    public IActionResult Meet(string Id, [FromServices] ICounter counter)
    {
        var info = new
        {
            VisitorName = Id,
            GreetCount = counter.count(Id)
        };
        string browser = Request.Headers.UserAgent;
        if (browser.Contains("Mobile"))
            return View("~/Views/Hello.cshtml", info);
        return View("~/Views/Welcome.cshtml", info);
    }
}