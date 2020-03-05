import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

public class infix_postfix_main {
	public static void main(String args[])
	{
		//1+2/3-4*5
		try{
			CharStream input = new ANTLRInputStream("1+2/3-4*5");
			infix_postfixLexer lexer = new infix_postfixLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			infix_postfixParser parser = new infix_postfixParser(tokens);
			System.out.println("Input: "+input);
			System.out.println(parser.start());
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
