package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String agrs[]){
        System.out.println(" File reading start !!");
        File f=new File("/Users/MyWork/bill/readme.txt"); // file path
        Scanner sc=null;
        try{
         sc=new Scanner(f);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found "+e);
        }
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        
    }
}
