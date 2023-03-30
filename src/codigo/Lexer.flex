package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\r]+
tab=[\t]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | char | long  | double ) {lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexeme=yytext(); return Cadena;}

/* Tipo de dato Int */
( int ) {lexeme=yytext(); return Int;}

/* Tipo de dato Float */
( float ) {lexeme=yytext(); return Float;}

/* Palabra reservada nya */
( nya ) {lexeme=yytext(); return Nya;}

/* Palabra reservada and_word */
( and ) {lexeme=yytext(); return and_word;}

/* Palabra reservada assert_word */
( assert ) {lexeme=yytext(); return assert_word;}

/* Palabra reservada break_word */
( break ) {lexeme=yytext(); return break_word;}

/* Palabra reservada class_word */
( class ) {lexeme=yytext(); return class_word;}

/* Palabra reservada continue_word */
( continue ) {lexeme=yytext(); return continue_word;}

/* Palabra reservada def_word */
( def ) {lexeme=yytext(); return def_word;}

/* Palabra reservada del_word */
( del ) {lexeme=yytext(); return del_word;}

/* Palabra reservada elif_word */
( elif ) {lexeme=yytext(); return elif_word;}

/* Palabra reservada except_word */
( except ) {lexeme=yytext(); return except_word;}

/* Palabra reservada exec_word */
( exec ) {lexeme=yytext(); return exec_word;}

/* Palabra reservada finally_word */
( finally ) {lexeme=yytext(); return finally_word;}

/* Palabra reservada from_word */
( from ) {lexeme=yytext(); return from_word;}

/* Palabra reservada global_word */
( global ) {lexeme=yytext(); return global_word;}

/* Palabra reservada import_word */
( import ) {lexeme=yytext(); return import_word;}

/* Palabra reservada in_word */
( in ) {lexeme=yytext(); return in_word;}

/* Palabra reservada is_word */
( is ) {lexeme=yytext(); return is_word;}

/* Palabra reservada lambda_word */
( lambda ) {lexeme=yytext(); return lambda_word;}

/* Palabra reservada not_word */
( not ) {lexeme=yytext(); return not_word;}

/* Palabra reservada or_word */
( or ) {lexeme=yytext(); return or_word;}

/* Palabra reservada pass_word */
( pass ) {lexeme=yytext(); return pass_word;}

/* Palabra reservada print_word */
( print ) {lexeme=yytext(); return print_word;}

/* Palabra reservada raise_word */
( raise ) {lexeme=yytext(); return raise_word;}

/* Palabra reservada try_word */
( try ) {lexeme=yytext(); return try_word;}

/* Palabra reservada return_word */
( return ) {lexeme=yytext(); return return_word;}

/* Palabra reservada with_word */
( with ) {lexeme=yytext(); return with_word;}

/* Palabra reservada yield_word */
( yield ) {lexeme=yytext(); return yield_word;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexeme=yytext(); return Main_w;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("-"?[0-9]+) {lexeme=yytext(); return Numero;}

/*decimale*/
("-"?[0-9]?"."[0-9]+) {lexeme=yytext(); return NumeroDecimal;}
/* Error de analisis */
 . {return ERROR;}


