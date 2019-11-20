//import org.javatuples.Pair;
import java.util.*;
import java.util.Stack;
class Key<K1,K2>{
    public K1 key1;
    public K2 key2;
    public Key(K1 key1,K2 key2){
        this.key1 = key1;
        this.key2 = key2;
    }
}

public class maximum_munch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // MAPPING FOR INPUTS WITH OUTPUT STATES
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        HashMap<String, String> map3 = new HashMap<String, String>();
        // MAPPING INPUT STATES WITH THE TRANSISTION OF INPUT
        HashMap<String, HashMap<String, String>> transistion = new HashMap<String, HashMap<String, String>>();

        map1.put("a", "q1");
        transistion.put("q0", map1);
        map1.put("b", "q2");
        transistion.put("q0", map1);
        map2.put("a", "q3");
        transistion.put("q1", map2);
        map2.put("b", "q2");
        transistion.put("q1", map2);
        map3.put("a", "q3");
        transistion.put("q3", map3);
        map3.put("b", "q2");
        transistion.put("q3", map3);

        // INITIALIZING INITIAL STATES AND FINAL STATES
        String state = "q0";
        String finalstate1 = "q1";
        String finalstate2 = "q2";
        System.out.println("State: " + state);
        String input = sc.next();
        int i = 0;
        while (i < input.length()) {
            System.out.println("In State");
            String in = input.charAt(i) + "";
            if (state == finalstate2) {
                System.out.println("Reached Final state " + state);
                break;
            } else if (state == finalstate1 && input.charAt(0) == 'a' && input.length() == 1) {
                System.out.println("Reached Final state " + state);
                break;
            } else {
                HashMap<String, String> temp = transistion.get(state);
//            if(transistion.(state).equals(state))
                state = temp.get(in);

                System.out.println(state);
            }
            i++;
        }
        //System.out.println(state);
        // CHECK IF STRING IS ACCEPTED
        if (state == finalstate1 || state == finalstate2)
            System.out.println("String accepted");
        else
            System.out.println("String not accepted");



       System.out.println("Tokenisation at "+Max_Munch(transistion, input));

    }

    public static String Max_Munch(HashMap<String, HashMap<String, String>> transistion, String input) {
        Stack<Key<String, Integer>> stack = new Stack<Key<String, Integer>>();
        int i = 0;
        String q, b = "bottom";
        List<String> finalstate = new ArrayList<String>();
        finalstate.add("q1");
        finalstate.add("q2");
        Key<String, Integer> t = new Key<>(b, i);
        //System.out.println(t.key1+" "+t.key2);
        while (true) {
            q = "q0";
            stack.push(t);
            //System.out.println(q+" "+finalstate);

            while (i < input.length()) {
                if (finalstate.contains(q))
                    stack.clear();
                Key<String, Integer> t1 = new Key<>(q, i);
                stack.push(t1);
                HashMap<String, String> temp = transistion.get(q);
                q = temp.get(input.charAt(i)+"");
                i += 1;
            }
            while (!finalstate.contains(q)) {
                Key<String, Integer> popped = stack.pop();
                q = popped.key1;
                i = popped.key2;
                if (q.equals(b)) {
                    //if(stack.isEmpty()){
                    return ("Failure: Tokenisation not possible");
                }
            }
                System.out.println(i);
                if (i > input.length())
                    return "Success";
        }

        }

}

