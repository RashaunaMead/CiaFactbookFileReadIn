import java.util.*;
import java.io.*;
public class ciaFactbook {

	public static void main (String [] args)throws  FileNotFoundException{
		Scanner in = new Scanner(new File("gold.txt"));
		PrintWriter out = new PrintWriter("output.txt");

		//PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		out.println("ID, COUNTRY, RESERVES OF FOREIGN EXCHANGE AND GOLD");

		while(in.hasNextLine()){
			String input = in.nextLine();
			for(int i=0; i<input.length();i++){
				if(i>0&&i<input.length()-1){
					if( input.charAt(i)==','){
						out.print("");
					}
					else if(input.charAt(i)=='$'){
						out.print(',');
					}
					else if(Character.isDigit(input.charAt(i-1)) && !Character.isDigit(input.charAt(i))){
						out.print(","+input.charAt(i));
					}

					else{
						out.print(input.charAt(i));
					}
				}
				else{
					out.print(input.charAt(i));
				}

			}
			out.println(",");
			

			
		}
		in.close();
		out.close();
		
	}
}