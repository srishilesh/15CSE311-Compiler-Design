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
 
/*
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
		
		String questions[] = {"[deposit,quit]","[select,refund]","[deposit,quit]","[select,refund]","[select,refund]","[remove]","[deposit,quit]"};
		
		Map<String,String> hashone = new HashMap();
		hashone.put("WAITING",questions[1]);
		hashone.put("EXIT","END");
		hashone.put("DISPENSE",questions[5]);
		hashone.put("REFUNDING",questions[0]);
		hashone.put("READY",questions[0]);
		String answers[] = new String[questions.length-1];
		
		System.out.println("READY");
		System.out.println(hashone.get("READY"));
		while()
		{
			String answer = sc.next();
			System.out.println(hash.get(answer));
			System.out.println(hashone.get(hash.get(answer)));
		}
		
		
		
	}
 
}
 
*/
