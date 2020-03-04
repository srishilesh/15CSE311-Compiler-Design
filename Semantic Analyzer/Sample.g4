grammar binary;

exp returns [int value]
: e1	=	e				{System.err.println("Hello CSE" + $e1.value);}
;

e returns [int value]
: e1 = e '+' t1 =t		{$value =$e1.value + $t1.value ;}	
| t1 = t 				{$value = $t1.value;}
;

t returns [int value]
: t1 = t '*' f1 = f 	{$value =$t1.value * $f1.value; }	
| f1 = f 				{$value = $f1.value;}
;

f returns [int value]
:
INT  					{$value = Integer.parseInt($INT.text);}
;

ID
: ('a' .. 'z')+ | ('A' .. 'Z')+
;

INT :   '0'..'9'+ ;

WhiteSpace
  :  (' ' | '\t' | '\r' | '\n') {skip();}
  ;

