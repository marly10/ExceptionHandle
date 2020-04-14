/* 
Ricky McKenizie
lab4 
CSC 154
*/
//imports requested library
import java.io.*;
import java.util.*;
import java.io.File;

public class entryClient2{


  public static void main( String [] args )throws IOException{

  
  Scanner keyboard = new Scanner(System.in);
  
  
  
 //Level p4 = new Level(); 
 
 //p4.arrayFile();
 
 int x , j, i;

   
 int [][] voyager = new int [5][6];
 

 
 Scanner readFile = new Scanner(new File("lab4rFile.txt"));   


 
            
        for (  i = 0; i < voyager.length; i++ ){
        
            for (  j = 0; j < voyager[i].length; j++ ){             
                 
                 voyager[i][j] = readFile.nextInt();

                                                        }
                                                        
                                                        
                                                        }
                                                        
                                                        
         for ( int e = 1; e <voyager.length; e++){
         
               for (  int q = 0; q < voyager[e].length; q++ ){   
                   
                //reads the strings found in array.txt using the number as corresponding size 
                
                   System.out.print( voyager[e][q]+ "");

                   
                   
                                                     }
                    System.out.println();
                                                     
                                                     }




    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    

    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);


    for ( int m : myNumbers) {
      System.out.println(m);
      }


Scanner s = new Scanner(new File("lab4rFile.txt"));

ArrayList<Integer> list = new ArrayList<Integer>();


while (s.hasNextInt()){

    list.add(s.nextInt());
}
s.close();

 for(int g = 0; g < list.size(); g++){
 

      System.out.print(list.get(g));
 }


     ArrayList<ArrayList<Integer>> txtValues = new ArrayList<ArrayList<Integer>>();  


         for (i = 0; i < voyager.length; i++) {

            for (j = 0; j < voyager[i].length; j++) {

               voyager[i][j] = readFile.nextInt();
            }
         } //end of first loot that fills the aray



}
}
