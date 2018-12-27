import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;
public class ReadTxT {
	 static ArrayList<Dic> D = new ArrayList<Dic>();
	 

	public static void FileReader(){
	
	
		try {
			BufferedReader read = new BufferedReader(new FileReader("DIC.txt"));
				String Line = read.readLine();
			while((Line = read.readLine())!=null)	{
				String [] split = Line.split(" ");
				D.add(new Dic(split[0], split[1]));
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	public static void Search(String Con) {
		for(int i = 0 ; i<D.size();i++) {
			if(D.get(i).getConver().equalsIgnoreCase(Con)){
				System.out.print("Mean = "+D.get(i).getMean());
				
				}
		
		else
			System.out.println("Error");
		break;
		}
	}

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		ReadTxT.FileReader();
		System.out.println("Enter Conversation = ");
		String Con = in.nextLine();
		ReadTxT.Search(Con);
		
			
		
	}

	
}
	




	
	

