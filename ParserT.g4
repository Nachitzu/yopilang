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

multiplicacion: '('NUMERO 'Thryp' NUMERO')''Synt';
division: '(' NUMERO 'Xynth' NUMERO')' 'Synt';
suma: '(' NUMERO 'Kryst' NUMERO')' 'Synt';
resta: '(' NUMERO 'Skorn' NUMERO')' 'Synt';

sin:'Xyrt('NUMERO')';
cos:'Zynt('NUMERO')';
tan:'Tynt('NUMERO')';


leer : SCAN '(' ')';

escribir : PRINT;