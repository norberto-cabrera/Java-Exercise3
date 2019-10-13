import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		B h = new B();
		//From Main call a method that was inherited 3points
		h.CompaLongitud("Casas");
		//Call a method that was implemented in Class B from interface 
		h.Mensaje();
		
		//Create a list of strings with the following values:
		//List<String> Cadenas = Arrays.asList("Text", "Baseball", "Automation", "Java", "Laptop", null);
		List<String> Cadenas = new ArrayList<>(Arrays.asList("Text", "Baseball", "Automation", "Java", "Laptop", null));
		B o = new B();
		o.Ordenar(Cadenas);
		o.removernulls(Cadenas);
		o.MissingNumbers();
		
	}
}
