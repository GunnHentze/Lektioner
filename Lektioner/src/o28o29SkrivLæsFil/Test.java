package o28o29SkrivLæsFil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Test {
 
    public static void main(String[] args) {
         
        WriteFile wf = new WriteFile();
        wf.openFile("data.txt");
        wf.writeInts(new int[]{1,2,3,4,5});
        wf.writeInts(new int[]{1,1,2,3,5});
        
        //Java 7 - try with resources
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"));){          
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e){
             
        }
        wf.closeFile();
 
    }
 
}