grammar ParserT;
import LexerT;

program   : INICIO statement+ FIN;
          
statement : print ;


print     : PRINT '('(ECUACIONES | NUMERO)')';

