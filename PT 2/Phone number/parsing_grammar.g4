grammar parsing_grammar;
phone
	: ph {System.out.println("Correct number");}
	;
ph
	: start ' ' code ' ' area ' ' exc ' ' sub 
	;
start
	: '+1'
	| '+'
	;
code
	: '001'
	| '010'
	;
area
	: num num num
	;
exc
	: num num num
	;
sub
	: num num num num
	;	
num
	: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
	;
WS
	: [\r\n\t] + -> skip
	;
