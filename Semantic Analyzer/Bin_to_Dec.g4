grammar parsing_grammar;
@members{
	int count=0,result=0;
}
start	
	:e	{System.out.println($e.val);
		
	}
	;
  
e returns [int val]
	: e0=e t0=t{
		$val=2*($e0.val)+$t0.val;
	}
	| t0=t { 
		$val=$t.val;
	}
	;
	
t returns [int val]

	: '0' {$val=0;}
	| '1' {$val=1;}
	;
	
WS
	: [\r\n\t]+ -> skip
	;
