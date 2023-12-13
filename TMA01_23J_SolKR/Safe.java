// (b) Import statement above the class in order to use ArrayList, I put this at the top of the source code
//     because i felt it interfered with the readability of the working code if placed lower.
import java.util.ArrayList;

/**
 * Question 2
 * (a) Below is a short description of the Safe class.
 * This class is slightly different from the SafeState class, this class simulates a safe with a capacity limit
 * to store items.
 
 * (a) Below i have added my name and the date i started Question 2 of TMA01.
 * @author (Kelvin Rankin)
 * @version (13/12/2023)
 */
// (a) Below is the Safe class.
public class Safe
{
    // (b) Below i added 3 fields, 2 of these are private and one is public.
    private SafeState state;
    private int maxItems;
    public ArrayList<String> contents;
    
    /**
    (c) Constructor for the class Safe.
     */
    public Safe(int aMaxItems) 
    {
        state = new SafeState();
        contents = new ArrayList<>();
        maxItems = aMaxItems;
    }
    
    public void addToContents(String item) 
    {
        if (contents.size() < maxItems) 
        {
            contents.add(item);
        }
    }
    
    public void removeFromContents(String item) 
    {
        if (contents.contains(item)) {
            contents.remove(item);
            System.out.println("item " + item + "not in safe.");
        }
    }
    
    public void display()
    {
        for (String item : contents)
        {
            System.out.println(item);
        }
    }
        
    public void empty() 
    {
        for (String item : contents) {
            System.out.println("Item Removed from safe." + item);
        }
        contents.clear();
    }
    
    public boolean open(String code)
    {
        return state.open(code);
    }
    
    public boolean lock(String code)
    {
        return state.lock(code);
    }
}
