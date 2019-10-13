
public class A {
    //Create a Parent (A) class with:
	//1.Method that compares 2 strings.
	//strings are received in the parameters section 1points
	protected void Comparador (String Cad1, String Cad2) {
		if(Cad1!=null&&Cad2!=null) {
			//Use IF conditional to validate the strings 2points
			if (Cad1.equalsIgnoreCase(Cad2)) 
				System.out.println("Son Iguales");
			else 
				System.out.println("No Son Iguales");
		}
		else {
			System.out.println("Error al introducir las cadenas");
		}
	}
	
	
	//Method that checks if a string lenght is greater than 4 then print the string else print each character - char[]
	//string is received in the parameters section 1points
	protected void CompaLongitud (String Cad1) {
		//Use length() 2points
		//Use an IF conditional to make the comparison 3points
		if (Cad1.length()>4) {
			System.out.println(Cad1);
		}
		else {
			//Use toCharArray(); to convert the string into an array of chars and print the expected result 4points
			char[] Caracter = Cad1.toCharArray();
			for (int i=0;i<Caracter.length;i++) {
				System.out.println(Caracter[i]);
			}
		}
	}
	
	
}
