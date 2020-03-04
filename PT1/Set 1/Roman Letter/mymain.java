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
			int i = 1;
			int v = 5;
			int x = 10;
			int l = 50;
			int c = 100;
			int d = 500;
			int m = 1000;
			int sum = 0;
			while((token=lexer.nextToken()).getType()!=-1){
				String s =token.getText();
				for(int z=0;z<s.length();z++)
				switch(s.charAt(z))
				{
				case 'I':
					sum+=i;
					break;
				case 'V':
					sum+=v;
					break;
				case 'X':
					sum+=x;
					break;
				case 'L':
					sum+=l;
					break;
				case 'C':
					sum+=c;
					break;
				case 'D':
					sum+=d;
					break;
				case 'M':
					sum+=m;
					break;
				default:
					sum=sum;
				}
				System.out.println(sum);
			}
				}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
