package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Search {
	private static final String FILENAME = "E:\\test\\filename.txt";//file to be read
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(FILENAME));			//file reader
		BufferedReader sr= new BufferedReader(new InputStreamReader(System.in));//word reader

		String word=sr.readLine();//scans the word that is to be searched
		ArrayList<Integer> locations=new ArrayList<Integer>();//list to store the first index at where the word is found
		String content=br.readLine();//reads the text from the file
		
		for(int i=0;i<content.length();i++)
		{
			if(content.charAt(i)==word.charAt(0))
			{
				for(int j=1;j<word.length();j++)
				{
					if(j==i+word.length()-1&&content.charAt(j+i)==word.charAt(j))
					{
						locations.add(i);
						i+=j;
					}
						
					else if(content.charAt(j)!=word.charAt(j))
					{
						i+=j;
						break;
					}
						
				}
			}
		}
		
		
	}

}
