import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatotekaCSV {
	public static void main(String[] args){
		String name = "enterprise.csv";
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(name));
			String row = csvReader.readLine();

			ArrayList<String[]> data = new ArrayList<>();
			while (row != null){
				data.add(row.split(","));
				row = csvReader.readLine();
			}

			String[][] newarray = new String[data.size()][]; // Kopija arraylista ker je toArray povzorčal težave

			for(int i=0; i<data.size(); i++){
				newarray[i] = data.get(i);
			}

			EnterpriseClass[] countries = new EnterpriseClass[newarray.length];
			int i = 0;
			for (String[] array : newarray){
				countries[i] = new EnterpriseClass(array);
				i++;
			}

			izpisiVse(countries);


		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public static void izpisiVse(EnterpriseClass [] cvsData){
		for (EnterpriseClass element : cvsData){
			System.out.printf("City %s is located in subcounty %s in %s\n", element.name, element.subcountry, element.country);
			// String.format("%s + %s = %s, 1,2,3) -> 1 + " " + 2 + " = " + 3

		}
	}


}
