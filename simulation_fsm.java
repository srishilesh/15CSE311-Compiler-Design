package compiler;
import java.util.*;
public class fsm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> hash = new HashMap();
		
		hash.put("deposit", "WAITING");
		hash.put("quit", "EXIT");
		hash.put("select","DISPENSE");
		hash.put("refund","REFUNDING");
		hash.put("remove", "READY");
		System.out.println("READY");
		String questions[] = {"[deposit,quit]","[select,refund]","[deposit,quit]","[select,refund]","[select,refund]","[remove]","[deposit,quit]"};
		String answers[] = new String[questions.length-1];
		for(int i=0;i<questions.length-1;i++)
		{
			System.out.println(questions[i]);
			answers[i] = sc.next();
			//if(answers[i].equals("refund") || answers[i].equals("remove"))
			System.out.println(hash.get(answers[i]));
		}
		
		
		
	}
 
}
 
