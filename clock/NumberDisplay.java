
/**
 * Write a description of class NumberDisplay here.
 *
 * @author (Daniel)
 * @version (19/10/2022)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int value;
    private int limit;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int RollOverLimit)
    {
        // initialise instance variables
        value = 0;
        limit = RollOverLimit;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getValue()
    {
        // put your code here
        return value;
    }
    
   
    public String getNumberDisplay()
    {
        if (value < 10 )
        { 
            return "0" + value;
        }else
        {
        return "" + value;
        }
    }
    
    public void setValue(int replacementValue)
    {
        if((replacementValue >=1) && (replacementValue < limit))
        value = replacementValue;
    }
    
    public void increment()
    {
        value = value + 1;
        if (value < limit){
             value = value; 
        }else{
            value = 0;
        }
    }
    
    public void hourIncrement(){
        value = value + 1;
        if (value < limit){
        value = value;
    }else{
        value = 1;
    }
    }
    
    
}
