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


Igual = "="

ParentesisAbierto = "("
ParentesisCerrado = ")"
LlaveAbierta = "{"
LlaveCerrada = "}"
CorcheteAbierto = "["
CorcheteCerrado = "]"
PuntoyComa = ";"
Coma = ","
Comillas = "\""
Punto = "."

OP_Aritmetico = "+"
| "-"
| "*"
| "/"

OP_Logico= "<"
| ">"
| "&"
| "|"
| "=="

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
| "null"

ModificadorAcceso = 
  "public"
| "private"
| "protected"
| "package"

TipoDato = "void"
| "boolean"
| "byte"
| "char"
| "double"
| "float"
| "int"
| "long"
| "short"

PalabraReservadaEspecial = "static"
| "class"

ModificadorMetodo = "static"  // 'static' como modificador de método
| "public"
| "private"
| "protected"
| "package"


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


/* Regla para otros símbolos especiales */
{Igual} { return token(yytext(), "ASIGNACION", yyline, yycolumn); }
{ParentesisAbierto} { return token(yytext(), "PARENTESIS_ABIERTO", yyline, yycolumn); }
{ParentesisCerrado} { return token(yytext(), "PARENTESIS_CERRADO", yyline, yycolumn); }
{LlaveAbierta} { return token(yytext(), "LLAVE_ABIERTA", yyline, yycolumn); }
{LlaveCerrada} { return token(yytext(), "LLAVE_CERRADA", yyline, yycolumn); }
{CorcheteAbierto} { return token(yytext(), "CORCHETE_ABIERTO", yyline, yycolumn); }
{CorcheteCerrado} { return token(yytext(), "CORCHETE_CERRADO", yyline, yycolumn); }
{PuntoyComa} { return token(yytext(), "PUNTO_Y_COMA", yyline, yycolumn); }
{Coma} { return token(yytext(), "COMA", yyline, yycolumn); }
{Comillas} { return token(yytext(), "COMILLAS", yyline, yycolumn); }
{Punto} { return token(yytext(), "PUNTO", yyline, yycolumn); }

/* Palabras reservadas y otros tokens */
{PalabraReservada} { return token(yytext(), "Palabra_Reservada", yyline, yycolumn); }

{ModificadorAcceso} { return token(yytext(), "Modificador_de_Acceso", yyline, yycolumn); }

{TipoDato} { return token(yytext(), "Tipo_de_dato", yyline, yycolumn); }

/* Regla para manejar los operadores */
{OP_Aritmetico} {return token(yytext(), "OP_Aritmetico", yyline, yycolumn);}
{OP_Logico} {return token(yytext(), "OP_Logico", yyline, yycolumn);}

/* Identificador y número */
{Identificador} { return token(yytext(), "Identificador", yyline, yycolumn); }
{Numero} { return token(yytext(), "Numero", yyline, yycolumn); }

. { return token(yytext(), "ERROR", yyline, yycolumn); }
