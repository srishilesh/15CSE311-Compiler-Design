lexer grammar parsing_grammar;
ROM: [I V X L C D M]+ {System.out.println("Roman letters");};
WS
	: [\r\n\t] + -> skip
	;
