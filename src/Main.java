import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.nio.file.Paths;
import java.nio.file.Path;


public class Main {

    private static String basePath = "C:/Games/";
    private static StringBuilder sb = new StringBuilder();
    private static ArrayList<String> arrayTemp = new ArrayList<>(Arrays.asList(
            "src", "res", "savegames", "temp",
            "src/main", "src/test",
            "res/drawables", "res/vectors", "res/icons"
    ));
    private static ArrayList<String> arrFile = new ArrayList<>(Arrays.asList(
            "src/main/Main.java", "src/main/Utils.java", "temp/temp.txt"
    ));

    public static void main(String[] args) {
        createDir();
        createFile(arrFile);
        writeLog();
    }

    public static void createDir() {
        for (String temp : arrayTemp) {
            File file = new File(basePath + temp);
            if (file.mkdir()) {
                sb.append("Directory \"" + file.getAbsolutePath() + "\" created \n");
            } else {
                sb.append("Directory \"" + file.getAbsolutePath() + "\" not created \n");
            }
        }
    }

    public static void createFile(ArrayList<String> arrayFile) {
        for (String newFile : arrayFile) {
            File file = Paths.get(basePath, newFile).toFile();
            try {

                if (file.createNewFile()) {
                    sb.append("File \"" + file.getName() + "\" created in Directory \"" + file.getAbsolutePath() + "\" \n");
                } else {
                    sb.append("File \"" + file.getName() + "\" not created \n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void writeLog() {
        try (FileWriter writer = new FileWriter(basePath + "temp/temp.txt")) {
            writer.write(sb.toString());
            writer.append("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}