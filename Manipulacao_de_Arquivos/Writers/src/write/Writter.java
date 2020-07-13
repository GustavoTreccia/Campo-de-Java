package write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {
				"Três",
				"Dois",
				"Um"
		};
		
		String path = "/home/gustavo/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
