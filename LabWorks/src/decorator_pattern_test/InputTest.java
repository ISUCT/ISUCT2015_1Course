/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pattern_test;

/**
 *
 * @author stud_6
 */
import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

   

