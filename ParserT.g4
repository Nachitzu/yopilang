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

sin:'Xyrt('NUMERO')';
cos:'Zynt('NUMERO')';
tan:'Tynt('NUMERO')';


leer : SCAN '(' ')';

escribir : PRINT;