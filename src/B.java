import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


//Create a new class (B) that inherits from Parent (A) class.
//Create Class B 1points
//Apply inheritance from Class A 2points
public class B extends A implements MiInterfaz {
	      //Implement the interface in Class (B).
          public void Mensaje() {
        	  System.out.println("Hello Interface");
          }
          
          //Create a method that orders by desc and asc order based on a parameter.
          //Method receives the list in a parameter 1points
          public void Ordenar (List<String> Cadenas) {
        	  while (Cadenas.remove(null)) {}
        	  //Use Sort and Reverse 2points
        	  Collections.sort(Cadenas);
        	  System.out.println("Orden Ascendente - ");
        	  //Print the sorted values using a For 3points
        	  for (int i=0;i<Cadenas.size();i++) {
            	  System.out.println("Cadena" + i + ": " + Cadenas.get(i));	  
        	  }
        	  System.out.println("Orden Descendente - ");
        	  Collections.reverse(Cadenas);
        	  for (int i=0;i<Cadenas.size();i++) {
            	  System.out.println("Cadena" + i + ": " + Cadenas.get(i));
        	  }  
        	  
        	  
          }
          
          //Create a method that removes null values
          //List is passed on the parameters section 1points
          public void removernulls(List<String> Cadenas) {
        	  //Use Lambda and .filter 2points
        	  //Use a foreach to print the filtered values 3points
        	  Cadenas.stream().filter(value -> value != null).forEach(System.out::println);
          }
          
          
          //Create a list of integers with the following values:
          List<Integer> Numeros = new ArrayList<>(Arrays.asList(2,2,3,4,4,5,6,7,8,10));
          //0-2,1-3,2-4,3-5,4-6,5-7,6-8,7-10
          public void MissingNumbers () {
        	  //Use Distinct() to avoid duplicates 1points
        	  Numeros = Numeros.stream().distinct().collect(Collectors.toList());
        	  //Use a For to iterate and check the missing number from 1 to 10 2points
        	  for (int i=1;i<11;i++) {

        		  if (Numeros.contains(i)) {}
        		  else {
        			  //Print the missing number or numbers 3points
        			  System.out.println("El numero que falta es: " + i);

        		  }

        	  }
          }
}