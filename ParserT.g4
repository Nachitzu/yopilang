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
operacion:  multiplicacion | division| suma | resta;

multiplicacion: '('ENTERO 'Thryp' ENTERO')''Synt';
division: '(' ENTERO 'Xynth' ENTERO')' 'Synt';
suma: '(' ENTERO 'Kryst' ENTERO')' 'Synt';
resta: '(' ENTERO 'Skorn' ENTERO')' 'Synt';

mientras: 'Zyxblippryxplorskronglorkzirdrax(' logica ')' desarrollo 'Qwertzirvokpryxglork'; 
logica: operadores ((O|Y) operadores)*;
operadores: Mayoht| Menhok ;
Mayoht: VAR 'Mayoht' VAR;
Menhok: VAR 'Menhok' VAR;

leer : SCAN '(' ')';

escribir : PRINT;