package o28o29SkrivLæsFil;


import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	private FileWriter fw;
	private BufferedWriter bw;
	private PrintWriter pw;

	public void openFile(String file){
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeInts(int[] arr){
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
		for(int i=0; i<arr.length; i++){
			pw.print(arr[i] + " ");
		}	
			pw.println();
		
	}

	public void closeFile(){
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
