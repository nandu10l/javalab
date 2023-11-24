package ExceptionProblems;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String write_data;
		String write_data_2 = "";
		
		try {
			FileWriter fwriter = new FileWriter("Input.txt");
			
			System.out.print("Enter the data : ");
			write_data = sc.nextLine();
			fwriter.write(write_data);	
			fwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader freader = new FileReader("Input.txt");
			int read_data = freader.read();
			while(read_data != -1) {
				write_data_2 += (char)read_data;
				read_data = freader.read();
			}
			freader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fwrite = new FileWriter("Output.txt");
			System.out.println("The data in Input.txt is copied to Output.txt succesfully");
			fwrite.write(write_data_2);	
			fwrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}
}
