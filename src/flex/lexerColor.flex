import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char
%caseless

%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor ((int) start, size, color);
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
{Comentario} { return textColor(yychar, yylength(), new Color(146,146,146)); }
{EspacioEnBlanco} { /*Ignorar*/ }

/* Palabras reservadas y otros tokens */
{PalabraReservada} { return textColor(yychar, yylength(), new Color(186, 134, 182)); }

{ModificadorAcceso} { return textColor(yychar, yylength(), new Color(53, 140, 214)); }

{TipoDato} { return textColor(yychar, yylength(), new Color(68, 201, 164)); }


/* Identificador y número */
{Identificador} { /*Ignorar*/ }
{Numero} { /*Ignorar*/ }

. { /* Ignorar */ }
