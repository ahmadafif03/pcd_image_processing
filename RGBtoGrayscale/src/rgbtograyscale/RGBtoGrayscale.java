/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgbtograyscale;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Amigo Paradise
 */

public class RGBtoGrayscale {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedImage img = null;
    File k = null;

    //membaca gambar
    try{
      k = new File("E:\\Data Afif\\KULIAH\\TUGAS KULIAH\\Semester 5\\PCD\\fruits.png");
      img = ImageIO.read(k);
    }catch(IOException e){
      System.out.println(e);
    }

    //mendapatkan panjang dan tinggi gambar
    int width = img.getWidth();
    int height = img.getHeight();

    //convert to grayscale
    for(int y = 0; y < height; y++){
      for(int x = 0; x < width; x++){
        int p = img.getRGB(x,y);

        int a = (p>>24)&0xff;
        int r = (p>>16)&0xff;
        int g = (p>>8)&0xff;
        int b = p&0xff;

        //calculate average
        int avg = (r+g+b)/3;

        //replace RGB value with avg
        p = (a<<24) | (avg<<16) | (avg<<8) | avg;

        img.setRGB(x, y, p);
      }
    }

    //membuat image baru
    try{
      k = new File("E:\\Data Afif\\KULIAH\\TUGAS KULIAH\\Semester 5\\PCD\\fruits-grayscale.png");
      ImageIO.write(img, "png", k);
    }catch(IOException e){
      System.out.println(e);
    }
        
    }
    
}