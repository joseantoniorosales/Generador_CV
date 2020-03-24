package generadorcv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeneradorCV {

	public static void main(String[] args) {

		try {

			String linea = "";

			FileWriter fw = null;
			PrintWriter pw = null;

			BufferedReader br1 = new BufferedReader(new FileReader("curriculum.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("curriculum.txt"));

			fw = new FileWriter("mycurriculum.html");
			pw = new PrintWriter(fw);

			linea = br1.readLine();

			// HTML

			// Head

			pw.println("<html>");
			pw.println("<head><meta charset=\"UTF-8\"><title>" + (linea + "\n") + "</title></head>");

			// Fin Head

			// Body

			pw.println("<body>");

			linea = br2.readLine();

			pw.println("<center><h1><font color=\"cyan\">" + linea + "</font></h1></center>");
			pw.println("<center><p>");

			// Fin Body

			// Contacto

			br2.readLine();
			linea = br2.readLine();
			pw.println("Tlf contacto: " + linea + "<br>");
			br2.readLine();

			linea = br2.readLine();
			pw.println("E-mail contacto: " + linea + "<br><br>");
			br2.readLine();

			// Fin Contacto

			// Formacion

			pw.println("<h2> Formacion: </h2>");

			do {

				linea = br2.readLine();

				if (linea != null) {

					pw.println(linea + "<br>");

					if (linea.isEmpty()) {

						break;
					}

				}

			} while (linea != null);

			// Fin Formacion

			// Experiencia Laboral

			pw.println("<h2> Experiencia laboral: </h2>");

			do {

				linea = br2.readLine();

				if (linea != null) {

					pw.println(linea + "<br>");

					if (linea.isEmpty()) {

						break;
					}

				}

			} while (linea != null);

			// Fin Experiencia Laboral

			pw.println("</p></center>");
			pw.println("</body>");

			pw.println("</html>");

			br1.close();
			br2.close();
			pw.close();
			fw.close();

			System.out.println("Curriculum generado satisfactoriamente");

		} catch (FileNotFoundException fnf) {

			System.out.println("Archivos no encontrados");

		} catch (IOException ioe) {

			System.out.println("Error de lectura/escritura");

		}

	}

}
