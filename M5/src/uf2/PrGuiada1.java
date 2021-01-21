package uf2;

/**** @author alumne
 * */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrGuiada1 {
	public static void main(String[] args) throws IOException {
		File f = new File("fitxer.html");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write("<html>");
			bw.newLine();
			bw.write("	<head>");
			bw.newLine();
			bw.write("		<title>");
			bw.newLine();
			bw.write("			Codi de la nova branca");
			bw.newLine();
			bw.write("		</title>");
			bw.newLine();
			bw.write("	</head>");
			bw.newLine();
			bw.write("	<body>");
			bw.newLine();
			bw.write("		Projecte inicial");
			bw.newLine();
			bw.write("	</body>");
			bw.newLine();
			bw.write("</html>");
			bw.newLine();
			bw.close();
		}
	}
}