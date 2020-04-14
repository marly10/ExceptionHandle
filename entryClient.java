/* 
Ricky McKenizie
lab4 
CSC 154
*/
//imports requested library
import java.io.*;
import java.util.*;

public class entryClient {
  public static void main(String[] args) {

    //arrayList of entry type
    ArrayList < Entry > entryData = new ArrayList < Entry > ();

    try {

      //false means new file, true means append,  file output stream is an output stream for writing data
      FileOutputStream fos = new FileOutputStream("lab4File.txt", true);

      //Prints formatted representations of objects to a text-output stream.
      PrintWriter pw = new PrintWriter(fos);

      //add input to arrayList of entry
      Entry fileToEntryArray2 = new Entry(0, 1, "hello");
      Entry fileToEntryArray3 = new Entry(2, 3, "bye");

      //add input to arrayList of birds
      entryData.add(fileToEntryArray2);
      entryData.add(fileToEntryArray3);

      //Terminates the current line by writing the line separator string.       
      pw.println(fileToEntryArray2);
      pw.println(fileToEntryArray3);

      //Closes the stream and releases any system resources associated with it.
      pw.close();

    }

    //Signals that an attempt to open the file denoted by a specified pathname has failed
    catch (FileNotFoundException fnfe) {

      System.out.println("Sorry the file is not here");
      
    }

    //Thrown by a Scanner to indicate that the token retrieved does not match the pattern for the expected type,
    catch (InputMismatchException fnf) {

      System.out.println("Bad go ahead and try again");
    }
    
    //creating a new object using the level class
    Level fileTxt = new Level("lab4File.txt");

    //prints the reads in the data into the level class
    fileTxt.ySize();
    fileTxt.xSize();

    //prints the array method created to create a 2d array of map data 
    fileTxt.arrayFile();

    //prints the number of entries done to the array using a static instance variable
    System.out.println(Entry.getCountId());

    //forloop to get all data stored in entry arraylist
    for (int g = 0; g < entryData.size(); g++)
         System.out.println(entryData.get(g));
  } //last bracket for Main

}