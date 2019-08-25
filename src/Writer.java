import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

	File file = null;

	public Writer() {

	}

	public boolean setFilepath(String filepath) {
		try {
			file = new File(filepath);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void writeText(String text) throws IOException {
		try {
			Scanner sc = new Scanner(file);
			String old = "";
			while (sc.hasNextLine()) {
				old += sc.nextLine() + "\n";
				System.out.println(old);
			}
			System.out.println("Folgender Text wurde übernommen:");
			System.out.println(old);
			text = old+text;
			sc.close();
		} catch (Exception e) {
			System.out.println("Datei wurde nicht gefunden. Es wird eine Neue erstellt:" + file.getAbsolutePath());
		}
		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.flush();
		fw.close();

	}

}
