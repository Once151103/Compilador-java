import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%caseless

%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
Suma = "+"
Resta = "-"
Multiplicacion = "*"
Division = "/"
Igual = "="
Igualacion= "=="


ParentesisAbierto = "("
ParentesisCerrado = ")"
LlaveAbierta = "{"
LlaveCerrada = "}"
CorcheteAbierto = "["
CorcheteCerrado = "]"
PuntoyComa = ";"
Comillas = "\""
Punto = "."
MenorQue = "<"
MayorQue = ">"

/* Palabras reservadas */
PalabraReservada = "if"
| "main"
| "else"
| "while"
| "true"
| "false"
| "return"
| "break"
| "for"

ModificadorAcceso = 
  "public"
| "private"
| "protected"
| "package"

TipoDato = "void"
| "null"
| "boolean"
| "byte"
| "char"
| "double"
| "float"
| "int"
| "long"
| "short"

/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*


/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/* Regla para manejar los operadores aritméticos */
{Suma} { return token(yytext(), "SUMA", yyline, yycolumn); }
{Resta} { return token(yytext(), "RESTA", yyline, yycolumn); }
{Multiplicacion} { return token(yytext(), "MULTIPLICACION", yyline, yycolumn); }
{Division} { return token(yytext(), "DIVISION", yyline, yycolumn); }

/* Regla para otros símbolos especiales */
{Igual} { return token(yytext(), "ASIGNACION", yyline, yycolumn); }
{Igualacion} { return token(yytext(), "IGUALACION", yyline, yycolumn); }
{ParentesisAbierto} { return token(yytext(), "PARENTESIS_ABIERTO", yyline, yycolumn); }
{ParentesisCerrado} { return token(yytext(), "PARENTESIS_CERRADO", yyline, yycolumn); }
{LlaveAbierta} { return token(yytext(), "LLAVE_ABIERTA", yyline, yycolumn); }
{LlaveCerrada} { return token(yytext(), "LLAVE_CERRADA", yyline, yycolumn); }
{CorcheteAbierto} { return token(yytext(), "CORCHETE_ABIERTO", yyline, yycolumn); }
{CorcheteCerrado} { return token(yytext(), "CORCHETE_CERRADO", yyline, yycolumn); }
{PuntoyComa} { return token(yytext(), "PUNTO_Y_COMA", yyline, yycolumn); }
{Comillas} { return token(yytext(), "COMILLAS", yyline, yycolumn); }
{Punto} { return token(yytext(), "PUNTO", yyline, yycolumn); }
{MenorQue} { return token(yytext(), "MenorQue", yyline, yycolumn); }
{MayorQue} { return token(yytext(), "MayorQue", yyline, yycolumn); }

/* Palabras reservadas y otros tokens */
{PalabraReservada} { return token(yytext(), "Palabra Reservada", yyline, yycolumn); }

{ModificadorAcceso} { return token(yytext(), "Modificador de Acceso", yyline, yycolumn); }

{TipoDato} { return token(yytext(), "Tipo de dato", yyline, yycolumn); }


/* Identificador y número */
{Identificador} { return token(yytext(), "Identificador", yyline, yycolumn); }
{Numero} { return token(yytext(), "Numero", yyline, yycolumn); }

. { return token(yytext(), "ERROR", yyline, yycolumn); }
