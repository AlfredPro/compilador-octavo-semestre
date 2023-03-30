package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static String localDir;
    
    public static void main(String[] args) throws Exception {
        localDir = System.getProperty("user.dir");
        String ruta1 = localDir+"/src/codigo/Lexer.flex";
        String ruta2 = localDir+"/src/codigo/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", localDir+"/src/codigo/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get(localDir+"/src/codigo/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(Paths.get(localDir+"/sym.java"), 
                Paths.get(localDir+"/src/codigo/sym.java"));
        
        Path rutaSin = Paths.get(localDir+"/src/codigo/Sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        Files.move(Paths.get(localDir+"/Sintax.java"), 
                Paths.get(localDir+"/src/codigo/Sintax.java"));
    }
}