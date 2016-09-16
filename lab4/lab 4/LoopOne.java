
/**
Bradley frias 
Lab 4
 */
public class LoopOne
{
    int[] Intarray = new int [10];
    public int[] loadArray()
    {

        
        for (int i=0; i < 10; i++){
            Intarray[i] = (i + 1) * 5; 
        }

        return Intarray;

    }

    public void printArray(){
         
        for (int i=0; i < 10; i++){
            System.out.print("  , " +Intarray[i]);
        }
    }

}
