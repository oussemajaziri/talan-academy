import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {
   
    public boolean accept(File dir, String nomFichier) {
        String fichier = nomFichier.toLowerCase();
        if (fichier.endsWith(".java")) {
            return true;
        } else {
            return false;
        }
    }
}