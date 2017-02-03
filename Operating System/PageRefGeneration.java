/*
 * Ji Pan
 * N11489385
 * CS6233-Operating System
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PageRefGeneration {
	private static int P = 10000;
	private static int e = 100;
	private static File f = new File("reference_integers.txt");
	
	PageRefGeneration(){}
	
	PageRefGeneration(int P, int e, File f){
		PageRefGeneration.P = P;
		PageRefGeneration.e = e;
		PageRefGeneration.f = f;
	}
	
	static void generate(){
		try {
			PrintWriter out = new PrintWriter(f);
			out.flush();
			int tmp = 0;
			out.println(100); //We set the whole number of pages the process occupies to 100
			for(int j = 1; j < P; j ++){				
				tmp = (int)(Math.random() * e); 
				out.println(tmp);		
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static File returnFile(){
		return f;
	}
}