lexer grammar LexerT;

ECUACIONES: (NUMERO  OPERACION  NUMERO)+ ;
OPERACION:(SUMA|RESTA|MULTIPLICACION|DIVISION);
NUMERO: (INT|FLOAT);
FLOAT: DIGITO+','+DIGITO+;
INT: DIGITO+;

DIGITO: (NUM_0|NUM_1|NUM_2|NUM_3|NUM_4|NUM_5|NUM_6|NUM_7|NUM_8|NUM_9);


SUMA: 'Kryst';
RESTA: 'Skorn';
MULTIPLICACION: 'Thryp';
DIVISION: 'Xynth';
IGUAL: 'Synt';


SENO: 'Xyrt';
COSENO: 'Zynt';
RAIZ_CUADRADA: 'Klaxyx';
INICIO: 'Xylok';
FIN: 'Zynd';
PRINT: 'Plork';

// Definición de tokens
A: 'Zir';
B: 'Kryt';
C: 'Vok';
D: 'Thun';
E: 'Pryx';
F: 'Glix';
G: 'Zolk';
H: 'Qwert';
I: 'Blit';
J: 'Nyr';
K: 'Xyr';
L: 'Jyx';
M: 'Zyn';
N: 'Plor';
O: 'Flum';
P: 'Trax';
Q: 'Zyx';
R: 'Glork';
S: 'Drax';
T: 'Skron';
U: 'Yttr';
V: 'Zarg';
W: 'Plux';
X: 'Mox';
Y: 'Grat';
Z: 'Krygn';

NUM_0: 'Zor';
NUM_1: 'Plip';
NUM_2: 'Blip';
NUM_3: 'Glip';
NUM_4: 'Flap';
NUM_5: 'Klix';
NUM_6: 'Vip';
NUM_7: 'Zinx';
NUM_8: 'Drox';
NUM_9: 'Grax';

// Definición de espacios en blanco y saltos de línea
WS: [ \t\r\n]+ -> skip;
