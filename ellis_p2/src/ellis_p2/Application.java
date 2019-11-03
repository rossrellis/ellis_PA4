package ellis_p2;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		String inpath = "problem2.txt";
		duplicateCounter.count(inpath);
		String outpath = "unique_word_counts.txt";
		duplicateCounter.write(outpath);

	}

}
