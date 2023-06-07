grammar ParserT;
import LexerT;

program: INT MAIN BRACE_OPEN codigo* BRACE_CLOSE ((INT | CHAR | REAL | VOID | BOOLEAN) NAME_VAR BRACE_OPEN codigo* BRACE_CLOSE)* ;

codigo: declaracion | escribir | leer | si | hacer_mientras | mientras | para ;

declaracion: CONSTANT? CHAR NAME_VAR (ASSIGN (NAME_VAR | NUMBER))? SEMICOLON |
		     CONSTANT? INT NAME_VAR (ASSIGN NUMBER)? SEMICOLON |
		     CONSTANT? REAL NAME_VAR (ASSIGN NAME_VAR)? SEMICOLON |
		     CONSTANT? BOOLEAN NAME_VAR (ASSIGN VAL_BOOLEAN)? SEMICOLON ;

escribir: PRINT PAR_OPEN WORDS PAR_CLOSE SEMICOLON ;

leer: READ PAR_OPEN NAME_VAR PAR_CLOSE SEMICOLON ;

si: IF PAR_OPEN condicion PAR_CLOSE BRACE_OPEN bloque BRACE_CLOSE (ELSE BRACE_OPEN bloque BRACE_CLOSE)? ;

hacer_mientras: DO BRACE_OPEN bloque BRACE_CLOSE WHILE PAR_OPEN condicion PAR_CLOSE SEMICOLON ;

mientras: WHILE PAR_OPEN condicion PAR_CLOSE BRACE_OPEN bloque BRACE_CLOSE ;

para: FOR PAR_OPEN (declaracion | NAME_VAR)? COMMA condicion COMMA calculo PAR_CLOSE BRACE_OPEN bloque BRACE_CLOSE ;


calculo: NAME_VAR | NUMBER | calculo (PLUS | MINUS | MULT | DIV | MOD | POW) calculo ;
condicion: NAME_VAR | NUMBER | condicion (GREATER | LESSER | GREATER_OR_EQUAL | LESSER_OR_EQUAL | EQUAL | NOT_EQUAL) condicion ;
bloque: codigo+ ;