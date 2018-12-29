/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medianfiltering1;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Amigo Paradise
 */
public class MedianFiltering1 {
    public static void main(String[] args) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        
         // Reading the Image from the file and storing it in to a Matrix object
        String file ="E:\\Data Afif\\KULIAH\\TUGAS KULIAH\\Semester 5\\PCD\\fruits-SaltPaperNoise.png";
        Mat src = Imgcodecs.imread(file);
        
        // Creating an empty matrix to store the result
         Mat dst = new Mat();

        // Applying MedianBlur on the Image
        Imgproc.medianBlur(src, dst, 5);

        // Writing the image
        Imgcodecs.imwrite("E:\\Data Afif\\KULIAH\\TUGAS KULIAH\\Semester 5\\PCD\\fruits-SaltPaperNoise-MedianFiltering.png", dst);

        System.out.println("Image Processed");
        // TODO code application logic here
    }
    
}

