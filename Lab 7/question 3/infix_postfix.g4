grammar infix_postfix;
@members{
	String fin="";
}
start
	:expr {
		System.out.println(fin);
	}
	;
expr returns [String val]
	:expr (addsub) t0=term {if($t0.val!=null)fin+= $t0.val+$addsub.val;}
	| t1=term {if($t1.val!=null)fin+=$t1.val;}
	;
term returns [String val]
	: term (muldiv) f0=factor {if($f0.val!=null)
		fin+= $f0.val+$muldiv.val;
	}
	| f1=factor {if($f1.val!=null)fin+=$f1.val;}
	;
factor returns [String val]
	: DIGIT {$val = ($DIGIT.text);}
	;
addsub returns [String val]
	:'+' {$val="+";}
	| '-' {$val="-";}
	;
muldiv returns [String val]
	:'*' {$val="*";}
	|'/' {$val="/";}
	;
DIGIT 
	: '0'..'9'
	;
	
WS :[\t\r\n]+ -> skip;
