grammar ParserT;
import LexerT;

program   : BEGIN constantes ONLIVE desarrollo END;
constantes: variables*;
desarrollo: pasos*;

variables: texto | entero | decimal;
texto: 'YttrPlor' VAR 'Draxzirjyxskronzir' TEXTO;
entero:  'PryxDrax' ENTERO 'asdf';
decimal: VAR DECIMAL;

pasos : escribir | operacion | leer;
operacion:  multiplicacion | division| suma | resta|si|mientras|para;


multiplicacion: '('ENTERO 'Thryp' ENTERO')''Synt';
division: '(' ENTERO 'Xynth' ENTERO')' 'Synt';
suma: '(' ENTERO 'Kryst' ENTERO')' 'Synt';
resta: '(' ENTERO 'Skorn' ENTERO')' 'Synt';

para:'('VAR 'Synt' ENTERO ';' VAR operadores ENTERO ';' VAR 'KrystKryst)';
si:'('VAR 'SyntSynt' VAR ')' 'Qwertzirvokpryxglork';
mientras: 'Zyxblippryxplorskronglorkzirdrax(' logica ')' desarrollo 'Qwertzirvokpryxglork'; 
logica: operadores ((O|Y) operadores)*;
operadores: Mayoht| Menhok ;
Mayoht: VAR 'Mayoht' VAR;
Menhok: VAR 'Menhok' VAR;

NULL: 'NULL';
PI: '3,1415';
PITUFINUMERO: '1,58';
EULER: '2,71828';

leer : SCAN '(' ')';

escribir : PRINT;