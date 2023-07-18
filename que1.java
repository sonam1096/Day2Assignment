package Day2Assignment;
import java.util.*;
public class que1 {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
		 
 
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter(r1, theta1 ): ");
		        double r1 = scanner.nextDouble();
		        double theta1 = scanner.nextDouble();

		        System.out.print("Enter (r2, theta2 ): ");
		        double r2 = scanner.nextDouble();
		        double theta2 = scanner.nextDouble();

		        // Convert degrees to radians
		         theta1 = Math.toRadians(theta1);
		         theta2 = Math.toRadians(theta2);

		        // Convert polar coordinates to Cartesian coordinates
		        double x1 = r1 * Math.cos(theta1);
		        double y1 = r1 * Math.sin(theta1);
		        double x2 = r2 * Math.cos(theta2);
		        double y2 = r2 * Math.sin(theta2);

		        // Add the Cartesian coordinates
		        double x3 = x1 + x2;
		        double y3 = y1 + y2;

		        // Convert the result back to polar coordinates
		        double r3 = Math.sqrt(x3 * x3 + y3 * y3);
		        double theta3 = Math.atan2(y3, x3);
		             theta3 = Math.toDegrees(theta3);

		         

		        System.out.println( "r3 = "+r3 + ", " +"th3 ="+theta3);
		    }
		}


