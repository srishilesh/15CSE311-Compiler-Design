grammar equality;
@members{
	int countA = 0,countBC = 0;
	
}
start
	: s {if(countA==countBC)
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
	}
	;
s 
	: A {countA++;} s
	| x
	;
x
	:B x {countBC++;}
	|y
	; 
y
	:C y {countBC++;} 
	|C	{countBC++;}
	;
A
	:'a'
	;
B
	:'b'
	;
C
	:'c'
	; 

WS :[\r\t\n]+ -> skip;
