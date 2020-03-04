import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class mymain {

	public static void main(String[] args) {
  
  try{
			CharStream input = new ANTLRFileStream("E:\\Amrita University\\Academics\\3rd year 2019-20\\6th Semester\\Compiler Design\\Practice\\parser\\src\\input");
			parsing_grammarLexer lexer = new parsing_grammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parsing_grammarParser parser = new parsing_grammarParser(tokens);
			System.out.println(parser.phone());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
