package Csv2Yaml;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class csv2yaml {

	public static void main(String[] args) throws IOException {
		BufferedReader f1 = new BufferedReader(new FileReader("alumnes.csv"));
		PrintWriter f2 = new PrintWriter("alumnes.yaml");
		//Primera línia de noms de camps
		String[] caps = f1.readLine().split(",");
		f2.println("---");
		f2.println(":global:");
		f2.println(":cases:");
		String linia=f1.readLine();
		while (linia != null){
			String[] vals = linia.split(",");
			f2.println("- tt_members: " + vals[0]);
			for (int j=1;j<vals.length;j++)
				f2.println("  :host_"+caps[j]+": "+vals[j]);
			linia=f1.readLine();
		}
		f2.close();
		f1.close();

	}

}
