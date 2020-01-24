
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class parsing {
	public static void main(String args[])
	{
		try
		{
		ANTLRInputStream input = new ANTLRInputStream("a+(b-c)");
		parseLexer lexer1 = new parseLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer1);
		parseParser parser1 = new parseParser(tokens);
		System.out.println(parser1.equation());
		System.out.println(parser1.lnesting+" "+parser1.rnesting);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
