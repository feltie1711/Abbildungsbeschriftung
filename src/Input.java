import java.io.IOException;
import java.util.Scanner;

public class Input {

	private static Writer writer = new Writer();
	private static String output = "";

	public static void main(String[] args) {
		try {
			inputData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Input() {
	}

	public static void inputData() throws IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Dateipfad zur Ausgabe angeben:");

			if (writer.setFilepath(sc.nextLine()))
				break;
			else
				System.out.println("Fehlerhafter Dateipfad angegeben! Soll eine neue Datei erstellt werden? [ja|nein]");
			String yesNo = sc.nextLine();
			if(yesNo.toLowerCase().equals("ja"))
				break;

		}
		System.out.println("Fach:");
		String topic = sc.nextLine();
		while (true) {
			String add = topic + "\n";
			String tmp;
			System.out.println("Seite:");
			tmp = sc.nextLine();
			if (tmp.equals("exit"))
				break;
			add += "Seite: " + tmp + "\n";
			System.out.println("Abbildungs-Nummer:");
			tmp = sc.nextLine();
			String[] values = tmp.split(" ");
			if (tmp.equals("exit"))
				break;
			add += "Abbildung: " + values[0];
			if (values.length > 1)
				add += " (Nicht notwendig, da bereits ausreichend beschrieben)";
			add += "\n";
			System.out.println("Titel:");
			tmp = sc.nextLine();
			if (tmp.equals("exit"))
				break;
			add += "Titel: " + tmp + "\n";
			System.out.println("Hoch-/Querformat:");
			tmp = sc.nextLine();
			if (tmp.equals("exit"))
				break;
			else if (tmp.isEmpty())
				tmp = "Hoch-/Querformat";
			add += tmp + "\n\n\n\n\n";
			output += add;
		}
		sc.close();
		writer.writeText(output);
		System.out.println("gespeichert");

	}

}
