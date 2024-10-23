
namespace DemoApp1.Controller;

public class NamedCounter : ICounter
{
    private static Dictionary<string, int> store = new();

    public int count(string id)
    {
        lock (store)
        {
            store.GetValue(id, out int current)
            store[id] = ++current;
            return current;
        }
    }
}