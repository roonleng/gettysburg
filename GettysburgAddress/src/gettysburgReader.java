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
		String longWord = words<0>;
		int longest = longWord.length();
		for (int i = 0; i<words.length; i++)
		{
			int length = words.length[i];
			if (length>longest)
			{
				length=longest;
				longestWord=words[i];
			}
		}
		for (int j = 0; j<words.length; j++)
		{
			String avgWord = words[j];
			int avgLength = avgWord.length();
			int avgRaw = avgRaw + avgLength;
			int count= count+1;
		}
		int average=avgLength/count;
		System.out.println("The longest word was " + longestWord + " and the average word length was " + average);
	}
}
