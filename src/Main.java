import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        File src = new File("C:/Games/src");
        if (src.mkdir()) {
            System.out.println("Directory \"" + src.getAbsolutePath() + "\" created");

            File main = new File("C:/Games/src/main");
            if (main.mkdir()) {
                System.out.println("Directory \"" + main.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + main.getAbsolutePath() + "\"  not created");
            }

            File test = new File("C:/Games/src/test");
            if (test.mkdir()) {
                System.out.println("Directory \"" + test.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + test.getAbsolutePath() + "\" created");
            }
        } else {
            System.out.println("Directory \"" + src.getAbsolutePath() + "\" not created");
        }

        File res = new File("C:/Games/res");
        if (res.mkdir()) {
            System.out.println("Directory \"" + res.getAbsolutePath() + "\" created");

            File drawables = new File("C:/Games/res/drawables");
            if (drawables.mkdir()) {
                System.out.println("Directory \"" + drawables.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + drawables.getAbsolutePath() + "\" not created");
            }

            File vectors = new File("C:/Games/res/vectors");
            if (vectors.mkdir()) {
                System.out.println("Directory \"" + vectors.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + vectors.getAbsolutePath() + "\" not created");
            }

            File icons = new File("C:/Games/res/icons");
            if (icons.mkdir()) {
                System.out.println("Directory \"" + icons.getAbsolutePath() + "\" created");
            } else {
                System.out.println("Directory \"" + icons.getAbsolutePath() + "\" not created");
            }

        } else {
            System.out.println("Directory \"" + res.getAbsolutePath() + "\" not created");
        }

        File savegames = new File("C:/Games/savegames");
        if (savegames.mkdir()) {
            System.out.println("Directory \"" + savegames.getAbsolutePath() + "\" created");
        } else {
            System.out.println("Directory \"" + savegames.getAbsolutePath() + "\" not created");
        }

        File temp = new File("C:/Games/temp");
        if (temp.mkdir()) {
            System.out.println("Directory \"" + temp.getAbsolutePath() + "\" created");
        } else {
            System.out.println("Directory \"" + temp.getAbsolutePath() + "\" not created");
        }

        File mainJava = new File("C:/Games/src/main", "Main.java");
        File utilsJava = new File("C:/Games/src/main", "Utils.java");
        File tempTxt = new File("C:/Games/temp", "temp.txt");

        try {
            if (mainJava.createNewFile()) {
                System.out.println("File \"" + mainJava.getName() + "\" created in Directory \"" + mainJava.getAbsolutePath() + "\"");
            } else {
                System.out.println("File \"" + mainJava.getName() + "\" not created");
            }

            if (utilsJava.createNewFile()) {
                System.out.println("File \"" + utilsJava.getName() + "\" created in Directory \"" + utilsJava.getAbsolutePath() + "\"");
            } else {
                System.out.println("File \"" + utilsJava.getName() + "\" not created");
            }

            if (tempTxt.createNewFile()) {
                System.out.println("File \"" + tempTxt.getName() + "\" created in Directory \"" + tempTxt.getAbsolutePath() + "\"");
            } else {
                System.out.println("File \"" + tempTxt.getName() + "\" not created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}