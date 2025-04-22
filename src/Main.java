import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayTemp = new ArrayList();

        File src = new File("C:/Games/src");
        if (src.mkdir()) {
            arrayTemp.add("Directory \"" + src.getAbsolutePath() + "\" created");
            System.out.println("Directory \"" + src.getAbsolutePath() + "\" created");

            File main = new File("C:/Games/src/main");
            if (main.mkdir()) {
                arrayTemp.add("Directory \"" + main.getAbsolutePath() + "\" created");
                System.out.println("Directory \"" + main.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + main.getAbsolutePath() + "\"  not created");
            }

            File test = new File("C:/Games/src/test");
            if (test.mkdir()) {
                arrayTemp.add("Directory \"" + test.getAbsolutePath() + "\" created");
                System.out.println("Directory \"" + test.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + test.getAbsolutePath() + "\" created");
            }
        } else {
            System.out.println("Directory \"" + src.getAbsolutePath() + "\" not created");
        }

        File res = new File("C:/Games/res");
        if (res.mkdir()) {
            arrayTemp.add("Directory \"" + res.getAbsolutePath() + "\" created");
            System.out.println("Directory \"" + res.getAbsolutePath() + "\" created");

            File drawables = new File("C:/Games/res/drawables");
            if (drawables.mkdir()) {
                arrayTemp.add("Directory \"" + drawables.getAbsolutePath() + "\" created");
                System.out.println("Directory \"" + drawables.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + drawables.getAbsolutePath() + "\" not created");
            }

            File vectors = new File("C:/Games/res/vectors");
            if (vectors.mkdir()) {
                arrayTemp.add("Directory \"" + vectors.getAbsolutePath() + "\" created");
                System.out.println("Directory \"" + vectors.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + vectors.getAbsolutePath() + "\" not created");
            }

            File icons = new File("C:/Games/res/icons");
            if (icons.mkdir()) {
                arrayTemp.add("Directory \"" + icons.getAbsolutePath() + "\" created");
                System.out.println("Directory \"" + icons.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + icons.getAbsolutePath() + "\" not created");
            }

        } else {
            System.out.println("Directory \"" + res.getAbsolutePath() + "\" not created");
        }

        File savegames = new File("C:/Games/savegames");
        if (savegames.mkdir()) {
            arrayTemp.add("Directory \"" + savegames.getAbsolutePath() + "\" created");
            System.out.println("Directory \"" + savegames.getAbsolutePath() + "\" created");
        } else {
            System.out.println("Directory \"" + savegames.getAbsolutePath() + "\" not created");
        }

        File temp = new File("C:/Games/temp");
        if (temp.mkdir()) {
            arrayTemp.add("Directory \"" + temp.getAbsolutePath() + "\" created");
            System.out.println("Directory \"" + temp.getAbsolutePath() + "\" created");
        } else {
            System.out.println("Directory \"" + temp.getAbsolutePath() + "\" not created");
        }

        File mainJava = new File("C:/Games/src/main", "Main.java");
        File utilsJava = new File("C:/Games/src/main", "Utils.java");
        File tempTxt = new File("C:/Games/temp", "temp.txt");

        try {
            if (mainJava.createNewFile()) {
                arrayTemp.add("File \"" + mainJava.getName() + "\" created in Directory \"" + mainJava.getAbsolutePath() + "\"");
                System.out.println("File \"" + mainJava.getName() + "\" created in Directory \"" + mainJava.getAbsolutePath() + "\"");
            } else {
                System.out.println("File \"" + mainJava.getName() + "\" not created");
            }

            if (utilsJava.createNewFile()) {
                arrayTemp.add("File \"" + utilsJava.getName() + "\" created in Directory \"" + utilsJava.getAbsolutePath() + "\"");
                System.out.println("File \"" + utilsJava.getName() + "\" created in Directory \"" + utilsJava.getAbsolutePath() + "\"");
            } else {
                System.out.println("File \"" + utilsJava.getName() + "\" not created");
            }

            if (tempTxt.createNewFile()) {
                arrayTemp.add("File \"" + tempTxt.getName() + "\" created in Directory \"" + tempTxt.getAbsolutePath() + "\"");
                System.out.println("File \"" + tempTxt.getName() + "\" created in Directory \"" + tempTxt.getAbsolutePath() + "\"");
            } else {
                System.out.println("File \"" + tempTxt.getName() + "\" not created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter writer = new FileWriter(tempTxt.getAbsolutePath())) {
            for (String text : arrayTemp) {
                writer.write(text);
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}