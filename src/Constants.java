/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
public class Constants {
    public static String IMGDIR = calculateImageDirectory();
    
    /**
     * Calculates the image directory.
     * Netbeans sees the directory as src\images, however
     * other programs which use the command line 'javac' will
     * see it as simply 'images'
     * @return A String path to the images folder
     */
    private static String calculateImageDirectory() {
        java.io.File file = new java.io.File("src");
        if (file.isDirectory()) {
            return "src\\images";
        } else {
            return "images";
        }
    }
}
