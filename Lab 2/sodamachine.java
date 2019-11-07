package srishilesh1;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class sodamachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int D = 10;
		int Q = 25;
		int state = 0;
		String question = "Choose [ ,N,Q,D]";
		System.out.println("State 0$");
		while(state>=0)
		{
			System.out.println(question);
			char ch = sc.next().charAt(0);
			if(ch=='Q')
				state = state + Q;
			else if(ch=='N')
				state = state + N;
			else if (ch=='D')
				state = state + D;
			else
				state = 0;
				
			
			System.out.println("State "+state+"$");
			if(state>=25)
				{
				state=0;
				System.out.println("State 0$");
				}
		}
		
		

	}

}
