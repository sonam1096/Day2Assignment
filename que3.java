package Day2Assignment;



public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		double x = 2.5;  
        int numTerms = 10;   

        double result = 1.0; 
        double term = 1.0; 
        for (int n = 1; n <= numTerms; n++) {
            term *= x / n; 
            result += term;  
        }

        // Output the result
        System.out.println( result);
    	

	}
}


