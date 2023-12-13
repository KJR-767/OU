
/**
 * Question 1
 * (a) Below is a short description of the SafeState Class.
 * The SafeState class represents the state of a safe.
 
 * (a) Below I added my name and the date i started TMA01.
 * @author (Kelvin Rankin)
 * @version (06/12/2023)
 */
// (a) Below is the SafeState class.
 public class SafeState
{
    // (b) Below i added 4 fields (3 Strings and 1 boolean).
    private String userCode;
    private String masterCode;
    private String display;
    private boolean open;
    
    /**
    (c) Constructor for the class SafeState.
    */
    public SafeState()
    {
       // (c) 4 fields with default values taken from TMA01 (4 Strings)
       this.userCode = null;
       this.masterCode = "999999";
       this.display = "WELCOME";
       this.open = true;
    }    
    // (d) Added 2 methods to the SafeState class.
    // (d) Below is adding a getter method for the display field called getDisplay
    public String getDisplay() 
    {
        return display;
    }
    // (d) Below is adding a getter method for the open field called isOpen
    public boolean isOpen() 
    {
        return open;
    }
    // (e) Added a method with header public boolean open 
    //     this method takes a string and check if it is
    public boolean open(String aCode) 
    {
        if (open) 
        {
            display = "ALREADY OPEN";
            return open;
         } 
          else 
         {
            if (aCode.equals(userCode) || aCode.equals(masterCode)) 
            {
                open = true;
                display = "OPEN";
                userCode = null;
        
            } 
             else 
            {
                display = "INVALID CODE";
            }
        }
        return open;
    }
    // (f) Added a method with header public boolean public boolean.
    public boolean isValidUserCode(String aCode) 
    {
        if (aCode.length() == 4) 
        {
            for(char c : aCode.toCharArray()) 
            {
                if (c < '0' || c > '9') 
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    // (g) Added a public method lock that recieves a string as an argument.
    public boolean lock(String aCode) 
    {
        if (!open) 
        {
            display = "ALREADY LOCKED";
            return !open;
        } else 
        {
            if (isValidUserCode(aCode)) 
            {
                open = false;
                display = "LOCKED";
                userCode = aCode;
            } else 
            {
                display = "INVALID CODE";
            }
        }
        return !open;
    }
    // (h) Added a method - about, This method takes no parameters it returns
    //     a string stating if the safe is already locked, already open or will
    //     give invalid code.
    public String about() 
    {
        return  "Safe " + display;
    }   
}

