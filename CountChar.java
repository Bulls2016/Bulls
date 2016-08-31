package Assignment2;
import java.util.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
public class CountChar {

	private static String line;
	
	public static void main(String [] args) throws IOException
	{
		char ch;
		int i,cnt;
		String str;
		line = "";
		String Capitals;
		String oneLine;
		try{
			
			Scanner s = new Scanner(new File("jtext.txt"));
			while (s.hasNext()) {
				oneLine = s.nextLine();
				System.out.println(oneLine);
				line += oneLine;
				
				
				
			}
			//Capitals = line.valueOf(line.matches("[A-Z]"));
			//System.out.println(Capitals);
			
			
			s.close();
		str=(String.valueOf(line));
		for(ch=(char)65;ch<=90;ch++)
		{
			cnt=0;
			
			for (i=0; i<str.length();i++)
			{
				if(ch==str.charAt(i)||(ch+32)== str.charAt(i))
				{
					
					cnt++;
				}
			}
			if (cnt>0)
			{
				System.out.println(ch+"="+cnt);
			}
	}	
		}
		catch(Exception e)
		{
			System.out.println("Error Nothing is scanning "+e);
		}
	}
}
