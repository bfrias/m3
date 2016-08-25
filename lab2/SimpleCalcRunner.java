
/**
 * Write a description of class SimpleCalcRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalcRunner
{
    public static void main(String[] argus){
        int n1 = 1123;
        int n2 = 567;
        SimpleCalc sc = new SimpleCalc(n1, n2);
        System.out.println("Numbers: " + n1 +", "+ n2);
        System.out.println("The Sum is: "+ sc.add());
        System.out.println("The Diff is: " + sc.subtract());
        
    }
       
    
}
