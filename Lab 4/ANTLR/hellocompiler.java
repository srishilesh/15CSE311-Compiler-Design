import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class hellocompiler {
	public static void main(String args[])
	{
		try
		{
			CharStream input = new ANTLRFileStream("C:\\Users\\cb.en.u4cse17458\\workspace\\compiler\\src\\input");
			
			sample lexer = new sample(input);
			 Token token;
			 
			 while ((token = lexer.nextToken()).getType()!=-1) {
				 int i = 0;
				 String s = (token.getText());
			 String loc = s.substring(i+0,i+2);
			 String school = s.substring(i+3,i+5);
			 String dept = (s.substring(i+8,i+11));
			 String batch = s.substring(i+11,i+13);
			 String sec = s.charAt(i+13)+"";
			 String roll = s.substring(i+14,i+16);
			 
			 if(loc.equals("CB"))
				 loc = "Coimbatore";
			 else
				 loc = "Amritapuri";
			 System.out.println("Location: "+loc);
			 
			 if(school.equals("EN"))
				 school = "Engineering";
			 else
				 school = "MBA";
			 System.out.println("School: "+school);
			 
			 switch(dept){
			 case "CSE":
			 {
				 dept = "Computer Science Engineering";
				 break;
			 }
			 case "ECE":
			 {
				 dept = "Electronics and Communication Engineering";
				 break;
			 }
			 default:
				 dept = "Invalid dept";
			 }
			 System.out.println("Department: "+dept);
			 System.out.println("Batch: "+batch+" - "+(Integer.parseInt(batch)+4));
			 char section[] = {'A','B','C','D','E','F'};
			 System.out.println("Section: "+section[Integer.parseInt(sec)]);
			 System.out.println("Roll number: "+roll);
			 System.out.println();
			
			 }
		}
		 catch(Exception e){

			 System.out.println(e);
			 }
	}

}

