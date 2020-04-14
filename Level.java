/*
Ricky McKenzie
Lab4
*/

import java.util.*;
import java.io.*;

public class Level {

   //instance variables
   private String fileName;

   //reads the strings name to parse into progrram for levels
   public Level(String fileName) {
      this.fileName = fileName;
   }

   public String getFileName() {
      return fileName;
   }

   //array used to be filled with data from txt file
   int[][] txtArray = new int[5][6];

   //returing the array using a method for client class
   public void arrayFile() {

      try (Scanner readFile = new Scanner(new File(fileName)))

      {
         //loop vars
         int j, i;
         //for loop to fill txtArray with data from txt file
         for (i = 0; i < txtArray.length; i++) {
            for (j = 0; j < txtArray[i].length; j++) {
               txtArray[i][j] = readFile.nextInt();
            }
         } //end of first loot that fills the array

         for (int e = 0; e < txtArray.length; e++) {
            for (int q = 0; q < txtArray[e].length; q++) {
               System.out.print(txtArray[e][q] + " ");
            }
            System.out.println(" ");

         } //end of the second loop that prints the data in array
      }
      //file not found Exception 
      catch (FileNotFoundException ioe) {
         System.out.println("Sorry file is not here");
      }
      //file is not around Exception 
      catch (NoSuchElementException iox) {
         System.out.println("Sorry file is not here");
      }
   } //end of try

   //size of arrays 
   public void ySize() {
      System.out.print(txtArray.length);
   }

   //size of arrays width
   public void xSize() {
      System.out.println(" " + txtArray[0].length);
   }
}