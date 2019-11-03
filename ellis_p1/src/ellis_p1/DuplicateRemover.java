package ellis_p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class DuplicateRemover {
	String uniqueWords;
	public void remove(String dataFile) throws IOException {
	      String wordList;
	      System.out.println("Opening file problem1.txt.");
	      
	      
	      System.out.println("Reading words.");
	      
	      	InputStream in = new FileInputStream(new File(dataFile));
	        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	        StringBuilder out = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            out.append(line);
	        }
	        wordList = out.toString();
	     
			reader.close();
		
	      System.out.println("Closing file problem1.txt");
		
		
	      String[] strgs = wordList.split(" ");
	     HashSet<String> words = new HashSet<String>();
	     for(int i=0;i<strgs.length;i++) {
	     words.add(strgs[i]);
	     }
	     uniqueWords = words.toString();
	     uniqueWords = uniqueWords.replace("[", "");
	     uniqueWords = uniqueWords.replace("]", "");
	     uniqueWords = uniqueWords.replace(",", "");

	     System.out.println("All unique words retreived.");
	 }
	public void write(String outputFile) {
		 FileOutputStream fileByteStream = null; 
	      PrintWriter outFS = null;               

	      try {
			fileByteStream = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	      outFS = new PrintWriter(fileByteStream);
	      System.out.println("Opened/created unique_words.txt");

	      
	      outFS.println(uniqueWords);
	      outFS.flush();
	      System.out.println("Written to unique_words.txt and flushed.");


	      try {
			fileByteStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	      System.out.println("Closed unique_words.txt");
	
	}
	
	
	
}
	
