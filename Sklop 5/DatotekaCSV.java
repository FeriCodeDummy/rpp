import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatotekaCSV {
	public static void main(String[] args){
		String name = "enterprise.csv"; // https://github.com/datasets/world-cities/blob/master/data/world-cities.csv
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(name));
			String row = csvReader.readLine();

			ArrayList<String[]> data = new ArrayList();
			while (row != null){
				data.add(row.split(","));
				row = csvReader.readLine();
			}

			String[][] newarray = new String[data.size()][];

			for(int i=0; i<data.size(); i++){
				newarray[i] = data.get(i);
			}

			EnterpriseClass[] countries = new EnterpriseClass[newarray.length];
			int i = 0;
			for (String[] array : newarray){
				countries[i] = new EnterpriseClass(array);
			}

			for (EnterpriseClass country : countries){
				country.izpisivse();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}


}
