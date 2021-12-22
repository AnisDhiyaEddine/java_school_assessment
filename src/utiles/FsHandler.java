package utiles;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class FsHandler {

    public static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));
            int i;
            while ((i = in.read()) != -1) {
                sb.append((char) i);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    static public boolean fileExists(String path) {
        return new java.io.File(path).exists();
    }

    static public void downloadFile(String URL, String outputPath) {
        System.out.println("téléchargement des dépendances, veuillez patienter");
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new URL(URL).openStream());
            FileOutputStream fileOS = new FileOutputStream(outputPath);
            byte data[] = new byte[1024];
            int byteContent;
            while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
                fileOS.write(data, 0, byteContent);
            }
            inputStream.close();
            fileOS.close();
            System.out.println("Téléchargement terminé");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.err.println("Erreur dans la fonction downloadFile");
        }
    }

    static public void deleteFile(String path) {
        new java.io.File(path).delete();
    }

    static public void updateFile(String URL ,String path) {
        deleteFile(path);
        downloadFile(URL, path);
    }
}
