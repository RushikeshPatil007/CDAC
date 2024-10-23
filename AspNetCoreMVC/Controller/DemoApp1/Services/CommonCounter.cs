namespace DemoApp1.Services;

public class CommonCounter : ICounter
{
    private int counter = 0;

    public int Count(string id)
    {
        return Interlocked.Increament(ref counter);

    }

}
