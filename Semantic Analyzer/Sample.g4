grammar parsing_grammar;
@members{
	int count=0,result=0;
}
start	
	:e	{System.out.println($e.val);
		
	}
	;
e returns [int val]
	:e0=e '+' t0=t {$val=$e0.val+$t0.val;}  
	| t0=t{$val=$t0.val;}
	;
t returns [int val]
	:t0=t '*' f0=f {$val=$t0.val *$f0.val;}
	|f0=f {$val=$f0.val;}
	;
f returns [int val]
:INT {$val=Integer.parseInt($INT.text);}
;

INT:('0'..'9')+;  
