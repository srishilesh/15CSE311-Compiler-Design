grammar parse;

@members{
	int lnesting=0,rnesting=0;
}
equation
	: exp {System.out.println("Syntactically correct");}
	;

exp
	: term {System.out.println("exp "+$term.text);} exp1 {System.out.println("exp "+$exp1.text);}
	;

exp1 
	: (PLUS|MINUS) term exp1	{System.out.println("exp1");}
	|	{System.out.println("exp1 Epsilon");}
	;
	
term
	: factor term1 {System.out.println("term");}
	;
	
term1
	: (TIMES|DIV) factor term1 {System.out.println("term1");}
	| {System.out.println("term1 epsilon");}
	;
	
factor
	: LPAREN exp RPAREN {System.out.println("factor");}
	| ID {System.out.println("id");}
	;	
	
LPAREN
	:'(' {this.lnesting++;}
	;
	
RPAREN
	:')'{this.rnesting++;}
	;
	
PLUS
	:'+'
	;
	
MINUS
	:'-'	
	;
	
TIMES
	:'*'
	;
	
DIV
	:'/'
	;
	
ID
	: ('a' .. 'z')+ | ('A' .. 'Z')+
	;
	
WS
	: [\r\n\t] + -> skip
	;