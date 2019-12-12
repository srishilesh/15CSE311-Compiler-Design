lexer grammar sample;
//IF:'if'{System.out.println("IF Keyword");};
//ID:[a-z][a-z 0-9]* {System.out.println("Identifier");};
//DIGIT:[0-9]+ {System.out.println("Number");};
ROLL:[C A][B M]'.''EN''.'[U P][0-5][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][0-9]{System.out.println("Valid Roll number");};
WS:[\t\r\n]+ ->skip;