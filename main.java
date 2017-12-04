import java.util.Random;
import java.util.List;
import java.util.ArrayList;
class Poker {    
    
    public static void main(String[] args){
        final Random random = new Random();
        int max = 10;//maximum random number - 1
        
        System.out.println("Poker");
        System.out.println("Input: ");
        System.out.print("    ");

        List<Integer> pd = new ArrayList<Integer>();//array of random numbers
        for(int i=0;i<5;i++){
            pd.add(random.nextInt(max));  
            System.out.print(pd.get(i)+" "); 
        }        
        System.out.println();

        int one_count = 0;
        List<Integer> weight = new ArrayList<Integer>();//array of numbers weight
        for(int i=0;i<pd.size();i++){
            int count = 1;//number of identical numbers
            for(int w=i;w<pd.size()-1;w++){
                if(pd.get(i) == pd.get(w+1)){//if the number and the next number are equal
                    count++;  
                    pd.remove(w+1);w--;//deleting duplicate numbers                                              
                }
            }        
           weight.add(count);
           if(weight.get(weight.size()-1) == 1)one_count++;
        }

        System.out.println("Output: ");
        
        String return_value = "";
        switch(one_count)
        {
            case 0:
                if(weight.size() == 2)return_value="full house";
                else return_value="poker";
                break;
            case 1:
                if(weight.size() == 3)return_value="two pairs";
                else return_value="four of a kind";
                break;
            case 2:
                return_value="three of a kind";
                break;
            case 3:
                return_value="one pair";
                break;
            case 5:
                return_value="all different";
                break;
            default :
                System.out.println("Кол-во едениц = "+one_count);
        }
        System.out.println("    "+return_value);
     
    }
}