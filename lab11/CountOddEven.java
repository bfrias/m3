
/**
 * Write a description of class CountOddEven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountOddEven
{
    int[][] dot = new int[10][10];
    int geteven = 0;
    
    public int[][] loadArray(){
       for(int i = 0; i < dot.length; i++){
           for( int j= 0;j < dot[i].length; j ++){
               int rand = (int)(Math.random() *10) +1;
               dot[i][j] = rand;

               System.out.print(dot[i][j]);
               }
            System.out.println();
            }
       return dot;
     
    }
    
    public boolean countEven(){
        for(int i = 0; i < dot.length; i++){
           for( int j= 0;j < dot[i].length; j ++){
               if (dot[i][j]% 2 == 0){
                   even++;
                }
                   

               //System.out.print(dot[i][j]);
               }
            
            }
           System.out.println("there are " + even +" even numbers");
            return true;
            
    }
    public int countOdd(){
        int getodd = dot.length* dot[0].length - even;
        System.out.println("ther are " + odd + " odd numbers");
        return odd;
        
    }
}
