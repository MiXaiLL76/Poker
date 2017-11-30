import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Poker {    
    
    public static void main(String[] args){
        final Random random = new Random();
        int max = 10;
        
        System.out.println("Poker");
        System.out.println("Input: ");
        System.out.print("    ");
        /*Console input*/
        //Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        /*Console input*/
        List<Integer> pd = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            pd.add(random.nextInt(max));            
            System.out.print(pd.get(i)+" "); 
        }        
        System.out.println();
        
        for(int i=0;i<5;i++){
            int count = 1;
            for(int w=i+1;w<5;w++){
                if(pd.get(i) == pd.get(w)){
                    count++;pd.                 
                }
            }
           System.out.println();
        }
    }
}