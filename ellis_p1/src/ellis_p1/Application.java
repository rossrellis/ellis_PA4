package ellis_p1;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		String inpath = "problem1.txt";
		duplicateRemover.remove(inpath);
		String outpath = "unique_words.txt";
		duplicateRemover.write(outpath);
	     
	}

}
