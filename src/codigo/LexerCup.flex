
package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\r,\n]+
tab=[\t]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | char | long  | double ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Tipo de dato Float */
( float ) {return new Symbol(sym.Float, yychar, yyline, yytext());}

/* Tipo de dato Int (Para el main) */
( "int" ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}



/* Palabra reservada nya */
( nya ) {return new Symbol(sym.nya, yychar, yyline, yytext());}

/* Palabra reservada and_word */
( and ) {return new Symbol(sym.and_word, yychar, yyline, yytext());}

/* Palabra reservada assert_word */
( assert ) {return new Symbol(sym.assert_word, yychar, yyline, yytext());}

/* Palabra reservada break_word */
( break ) {return new Symbol(sym.break_word, yychar, yyline, yytext());}

/* Palabra reservada class_word */
( class ) {return new Symbol(sym.class_word, yychar, yyline, yytext());}

/* Palabra reservada continue_word */
( continue ) {return new Symbol(sym.continue_word, yychar, yyline, yytext());}

/* Palabra reservada def_word */
( def ) {return new Symbol(sym.def_word, yychar, yyline, yytext());}

/* Palabra reservada del_word */
( del ) {return new Symbol(sym.del_word, yychar, yyline, yytext());}

/* Palabra reservada elif_word */
( elif ) {return new Symbol(sym.elif_word, yychar, yyline, yytext());}

/* Palabra reservada except_word */
( except ) {return new Symbol(sym.except_word, yychar, yyline, yytext());}

/* Palabra reservada exec_word */
( exec ) {return new Symbol(sym.exec_word, yychar, yyline, yytext());}

/* Palabra reservada finally_word */
( finally ) {return new Symbol(sym.finally_word, yychar, yyline, yytext());}

/* Palabra reservada from_word */
( from ) {return new Symbol(sym.from_word, yychar, yyline, yytext());}

/* Palabra reservada global_word */
( global ) {return new Symbol(sym.global_word, yychar, yyline, yytext());}

/* Palabra reservada import_word */
( import ) {return new Symbol(sym.import_word, yychar, yyline, yytext());}

/* Palabra reservada in_word */
( in ) {return new Symbol(sym.in_word, yychar, yyline, yytext());}

/* Palabra reservada is_word */
( is ) {return new Symbol(sym.is_word, yychar, yyline, yytext());}

/* Palabra reservada lambda_word */
( lambda ) {return new Symbol(sym.lambda_word, yychar, yyline, yytext());}

/* Palabra reservada not_word */
( not ) {return new Symbol(sym.not_word, yychar, yyline, yytext());}

/* Palabra reservada or_word */
( or ) {return new Symbol(sym.or_word, yychar, yyline, yytext());}

/* Palabra reservada pass_word */
( pass ) {return new Symbol(sym.pass_word, yychar, yyline, yytext());}

/* Palabra reservada print_word */
( print ) {return new Symbol(sym.print_word, yychar, yyline, yytext());}

/* Palabra reservada raise_word */
( raise ) {return new Symbol(sym.raise_word, yychar, yyline, yytext());}

/* Palabra reservada try_word */
( try ) {return new Symbol(sym.try_word, yychar, yyline, yytext());}

/* Palabra reservada return_word */
( return ) {return new Symbol(sym.return_word, yychar, yyline, yytext());}

/* Palabra reservada with_word */
( with ) {return new Symbol(sym.with_word, yychar, yyline, yytext());}

/* Palabra reservada yield_word */
( yield ) {return new Symbol(sym.yield_word, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/*decimales*/
("-"?[0-9]?"."[0-9]+) {return new Symbol(sym.NumeroDecimal, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}