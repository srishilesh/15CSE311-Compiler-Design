import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

public class abc_main {

	public static void main(String args[])
	{
		try{
			CharStream input = new ANTLRInputStream("aabc");
			equalityLexer lexer = new equalityLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			equalityParser parser = new equalityParser(tokens);
			System.out.println("Input: "+input);
			System.out.println(parser.start());
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
