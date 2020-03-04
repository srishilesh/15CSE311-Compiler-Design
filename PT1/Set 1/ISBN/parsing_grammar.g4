lexer grammar parsing_grammar;
ISBN: [0-9][0-9][0-9][0-9]'-'[0-9][0-9][0-9][0-9] {System.out.println("ISBN number");};
WS: [\r\n\t] + -> skip;
