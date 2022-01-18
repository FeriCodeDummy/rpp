public class EnterpriseClass {

	String name;
	String country;
	String subcountry;
	String geonameid;

	public EnterpriseClass(String[] data) {
		this.name= data[0];
		this.country = data[1];
		this.subcountry = data[2];
		this.geonameid = data[3];
	}

	public static void izpis(String[] data){
		System.out.println("Country name: " + data[1] + "\nCity: " + data[0]+ "\n\n");

	}

	public String getName(){
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getGeonameid() {
		return geonameid;
	}

	public String getSubcountry(){
		return subcountry;
	}



	@Override
	public String toString() {
		return "EnterpriseClass{" +
				"name='" + name + '\'' +
				", country='" + country + '\'' +
				", subcountry='" + subcountry + '\'' +
				", geonameid='" + geonameid + '\'' +
				'}';
	}
}
