package srishilesh1;
import java.util.*;
public class combinedfsm {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int state = 1;char ch;
		System.out.println("State 1");
		switch(state)
		{
		case 1:
			System.out.println("Enter anything: ");
			ch = sc.next().charAt(0);
			if(ch=='i')
				state = 2;
			else if(ch=='.')
				state = 5;
			else if(ch=='-')
				state = 9;
			else if(Character.isDigit(ch))
				state = 7;
			else if(Character.isLetter(ch))
				state = 4;
			else if(Character.isWhitespace(ch))
				state = 12;
			else 
				state = 13;
			System.out.println("State "+state);
			break;
		case 2:
			ch = sc.next().charAt(0);
			if(ch=='f')
				state = 3;
			else 
				state = 4;
			System.out.println("State "+state);
			break;
		case 3:
			ch = sc.next().charAt(0);
			if(Character.isLetterOrDigit(ch))
				state = 4;
			System.out.println("State "+state);
			break;
		case 4:
			ch = sc.next().charAt(0);
			if(Character.isLetterOrDigit(ch))
				state = 4;
			System.out.println("State "+state);
			break;
		case 5:
			ch = sc.next().charAt(0);
			if(Character.isDigit(ch))
				state = 6;
			System.out.println("State "+state);
			break;
		case 6:
			ch = sc.next().charAt(0);
			if(Character.isDigit(ch))
				state = 6;
			System.out.println("State "+state);
			break;
		case 7:
			ch = sc.next().charAt(0);
			if(Character.isDigit(ch))
				state = 7;
			else if(ch == '.')
				state = 8;
			else 
				state = state;
			System.out.println("State "+state);
			break;
		case 8:
			ch = sc.next().charAt(0);
			if(Character.isDigit(ch))
				state = 8;
			System.out.println("State "+state);
			break;
		case 9:
			ch = sc.next().charAt(0);
			if(Character.isDigit(ch))
				state = 8;
			System.out.println("State "+state);
			break;
			
		}
	}

}
