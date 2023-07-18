package Day2Assignment;
import java.util.*;
public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		        Scanner sc = new Scanner(System.in);

		         
		        System.out.print("Enter the x: ");
		        double x = sc.nextDouble();
		        System.out.print("Enter the y: ");
		        double y = sc.nextDouble();

		        // Determine the quadrant based on the coordinates
		        if (x == 0 && y == 0) {
		            System.out.println("x&y lies at(0, 0).");
		        } else if (x == 0) {
		            System.out.println("x is lies on the Y axis.");
		        } else if (y == 0) {
		            System.out.println("y is lies on the X axis.");
		        } else if (x > 0 && y > 0) {
		            System.out.println("x&y is lies in the I Quadrant.");
		        } else if (x < 0 && y > 0) {
		            System.out.println("x&y is lies in the II Quadrant.");
		        } else if (x < 0 && y < 0) {
		            System.out.println("x&y is lies in the III Quadrant.");
		        } else if (x > 0 && y < 0) {
		            System.out.println("x&y is lies in the IV Quadrant.");
		        }

		        
		    }
		}

