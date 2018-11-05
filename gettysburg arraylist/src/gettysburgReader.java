/**
 * Ryan Long
 * Period 6
 * Mr. Ellis AP Comp Sci
 */
//at some point click add throws
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class gettysburgReader 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<String> words = new ArrayList<String>();
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		while (file.hasNext())
		{
			String word = file.next();
			words.add(word);
			int length = word.length();
		}
	}
	
}
