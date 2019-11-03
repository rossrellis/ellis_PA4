package ellis_p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DuplicateCounter {
	
	String wordCounter;
	public void count(String dataFile) throws IOException {
		String wordList;
	      System.out.println("Opening file problem2.txt.");
	      
	      
	      System.out.println("Reading words.");
	      
	      	InputStream in = new FileInputStream(new File(dataFile));
	        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	        StringBuilder out = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            out.append(line);
	        }
	        wordList = out.toString();
	        System.out.println(out.toString());

	     
			reader.close();
		
	      System.out.println("Closing file problem2.txt");
	      
	      String[] strgs = wordList.split(" ");
	      HashMap<String, Integer> wordNum = new HashMap<String, Integer>();
	  		Integer wordCount;
	  	for(String str: strgs) {
	    	 wordCount = wordNum.get(str);
	    	 if(wordCount == null) {
		     wordNum.put(str,1 );
		     }
	    	 else {
	    		 wordNum.put(str, wordCount+1);
	    	 }
	     }
	     
    	 wordCounter = wordNum.toString();
    	 wordCounter = wordCounter.replace("{", "");
    	 wordCounter = wordCounter.replace("}", "");
    	 System.out.println("Words and their counts retreived.");

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
	      System.out.println("Opened/created unique_word_counts.txt");

	     
	      outFS.println(wordCounter);
	      outFS.flush();
	      System.out.println("Written to unique_word_counts.txt and flushed.");


	      try {
			fileByteStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	      System.out.println("Closed unique_word_counts.txt");

	}
	

}
