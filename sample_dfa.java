
import java.util.*;
class Key<K1,K2>{
    public K1 key1;
    public K2 key2;
    public Key(K1 key1,K2 key2){
        this.key1 = key1;
        this.key2 = key2;
    }
}

public class maximum_munch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // MAPPING FOR INPUTS WITH OUTPUT STATES
        HashMap<String,String> map1 = new HashMap<String,String>();
        HashMap<String,String> map2 = new HashMap<String,String>();
        HashMap<String,String> map3 = new HashMap<String,String>();
        // MAPPING INPUT STATES WITH THE TRANSISTION OF INPUT
        HashMap<String, HashMap<String,String>> transistion = new HashMap<String,HashMap<String,String>>();

        map1.put("a","q1");
        transistion.put("q0",map1);
        map1.put("b","q2");
        transistion.put("q0",map1);
        map2.put("a","q3");
        transistion.put("q1",map2);
        map2.put("b","q2");
        transistion.put("q1",map2);
        map3.put("a","q3");
        transistion.put("q3",map3);
        map3.put("b","q2");
        transistion.put("q3",map3);

        // INITIALIZING INITIAL STATES AND FINAL STATES
        String state = "q0";
        String finalstate1 = "q1";
        String finalstate2 = "q2";
        System.out.println("State: "+state);
        String input = sc.next();
        int i=0;
        while(i<input.length())
        {
            System.out.println("Enter your input: ");
            String in = input.charAt(i)+"";
            if(state==finalstate2)
            {
                System.out.println("Reached Final state "+state);
                break;
            }
            else if(state==finalstate1 && input.charAt(0)=='a' && input.length()==1)
            {
                System.out.println("Reached Final state "+state);
                break;
            }
            else {
                HashMap<String, String> temp = transistion.get(state);
//            if(transistion.(state).equals(state))
                state = temp.get(in);

                System.out.println(state);
            }
            i++;
        }
        // CHECK IF STRING IS ACCEPTED
        if(state!=finalstate1 || state!=finalstate2)
            System.out.println("String not accepted");
        else
            System.out.println("String accepted");
//        System.out.println(transistion);




    }
}
