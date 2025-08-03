import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class average_of_doubles_using_lambdas {
	public static void main(String[] args) {

		List<Double> lst=Arrays.asList(23.45, 34.45, 45.56, 56.67, 67.78);
		
		double res=lst.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		
		System.out.print(res);
	}
}

// To calculate the average of the list, we use the stream() method on the nums list to convert it into a stream. 
//Then, we use the mapToDouble() method to convert each Double object to its corresponding primitive double value. 
//This step is necessary because the average() method operates on primitive double values.

// Next, we call the average() method to calculate the average of the stream. 
//If the stream is empty, we use orElse(0.0) to provide a default value of 0.0.