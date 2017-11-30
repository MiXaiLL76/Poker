import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Poker {    
    
    public static void main(String[] args){
        final Random random = new Random();
        int max = 5;
        
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

        for(int i=0;i<pd.size();i++){
            int count = 1;
            for(int w=i;w<pd.size()-1;w++){
                if(pd.get(i) == pd.get(w+1)){
                    count++;  
                    pd.remove(w);w--;                                               
                }
            }        
           System.out.println(pd.get(i)+" - count = "+count);
        }

    }
}