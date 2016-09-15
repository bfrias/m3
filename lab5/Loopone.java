
/**
 * Write a description of class Loopone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loopone
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Loopone
     */
    public int[] loadRandom(int n)
    { 
        int[] nums = new int[n];
        for (int i = 0; i > n; i++){
            int rand = (int)(Math.random()*10) + 1; 
            nums[i] = rand;
            
            
        }
        return nums;
    }
    public int[] sortArray(){
        
    }
}
