grammar ParserT;
import LexerT;

program   : BEGIN constantes ONLIVE desarrollo END;
constantes: variables*;
desarrollo: pasos*;

variables: texto | entero | decimal;
texto: 'YttrPlor' VAR 'Draxzirjyxskronzir' TEXTO;
entero: VAR 'Ser' ENTERO 'Bananas';
decimal: VAR DECIMAL;

pasos : escribir | operacion | leer;
operacion:  multiplicacion | division| suma | resta;

multiplicacion: '(' VAR 'Thryp' VAR')' 'Synt';
division: '(' VAR 'Xynth' VAR')' 'Synt';
suma: '(' VAR 'Kryst' VAR')' 'Synt';
resta: '(' VAR 'Skorn' VAR')' 'Synt';


leer : SCAN '(' ')';

escribir : PRINT VAR ;