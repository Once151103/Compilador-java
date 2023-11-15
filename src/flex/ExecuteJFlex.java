package flex;

import jflex.exceptions.SilentExit;

/**
 *
 * 
 */
public class ExecuteJFlex {

    public static void main(String omega[]) {
        String lexerFile = System.getProperty("user.dir") + "/src/flex/Lexer.flex",
                lexerFileColor = System.getProperty("user.dir") + "/src/flex/LexerColor.flex";
        try {
            jflex.Main.generate(new String[] { lexerFile, lexerFileColor });
        } catch (SilentExit ex) {
            System.out.println("Error al compilar/generar el archivo flex: " + ex);
        }
    }
}
