
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private  NumberDisplay hours;
    private  NumberDisplay minutes;
    private String displayString;
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ClockDisplay( int hour, int minute)
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
     
    }
    
    public void timeTick(){
    minutes.increment();
    if( minutes.getValue() == 0){
    hours.hourIncrement();
    } 
    updateDisplay();
    }
    public void setTime(int hour, int minute)
    
  {
    
    hours.setValue(hour);
    minutes.setValue(minute);
    updateDisplay();
    }
    
    
    
    public String getTime(){
    return displayString;
    }
    
    
    
    public void updateDisplay(){
        displayString= hours.getNumberDisplay() + ":" +
        minutes.getNumberDisplay();
    }
}
