import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class mymain {

	public static void main(String[] args) {
  try
		{
			CharStream input = new ANTLRFileStream("E:\\Amrita University\\Academics\\3rd year 2019-20\\6th Semester\\Compiler Design\\Practice\\parser\\src\\input");
			parsing_grammar lexer = new parsing_grammar(input);
			Token token;
			while((token=lexer.nextToken()).getType()!=-1){
				String t = token.getText();
				int k=8;
				int sum=0;
				for(int i=0;i<8;i++)
				{
					if(i!=4)
					{
						sum+=(Character.getNumericValue(t.charAt(i))*k);
						k--;
					}
				}
				System.out.println(sum);
				int rem = sum%11;
				int f=0;
				if(rem==0)
				{
					if(t.charAt(8)=='0')
						f = 1;	
				}
				else
				{
					rem = 11 - rem;
					if(Character.getNumericValue(t.charAt(8))==rem)
						f= 1;
				}
				System.out.println(rem);
				if(f==1)
					System.out.println("Correct ISBN");
				else
					System.out.println("Incorrect ISBN");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
