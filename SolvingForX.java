package math.sections;
import java.util.*;

public class SolvingForX {
	
	
	public static void main(String[] args) {
		int a ;
		int b ;
		int c ;
		Scanner keyboard = new Scanner(System.in);
		SolvingForX x = new SolvingForX();
		//Input
		
		System.out.print("Enter the value of a :");
		a = keyboard.nextInt();
		System.out.print("Enter the value of b :");
		b = keyboard.nextInt();
		System.out.print("Enter the value of c :");
		c = keyboard.nextInt();
		
		if (a > 1 || a < -1)
		{
			b /= a;
			c/=a;
		}
		double x_value = x.solvingALinearEquation(a, b,c);	
		ArrayList<Double>  quadX = new ArrayList<>();
		
		
			
		 if(b < 0 && c> 0 )
			quadX = x.solveQuadWithNegBEq(a, b, c);
		else if(b > 0 && c < 0 )
			quadX = x.solveQuadWithNegCEq(a, b, c);
		else if(b < 0 && c < 0)
			quadX = x.solveQuadWithNegBAndCEq(a, b, c);
		else
			quadX = x.solvingAQuadrEquation(a, b, c);
		 
		
		
	
		 	if(c == 0)
				System.out.println( "x =" +x_value);
		 	else if(c != 0){
		 		for (Double value : quadX) {
		 			System.out.println("x = " + value);
		 		}
			}
		 	
		 	if (quadX.isEmpty())
		 		System.out.println("Wrong values entered , Retry");
			
	}
	
	public double solvingALinearEquation(int a, int b,int c){
		return (a == 0 ) ? null : ((double)b/(double)a) ;
	}
	
	public ArrayList<Double> solvingAQuadrEquation(int a , int b , int c){
		
		ArrayList<Double> x_cordinates = new ArrayList<>();
		
		for (int i = - c; i <= c; i++) {
			if(x_cordinates.isEmpty()){
				for (int j = -b; j <= b; j++) {
					if ((i * j) == c &&  (i + j) == b || (((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0) && ((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0))) {
						x_cordinates.add((double)i);
						x_cordinates.add((double)j);
						break;
					}
				}
			}
			else
				break;
		}
		return x_cordinates;
	}
	
	public ArrayList<Double> solveQuadWithNegCEq(int a, int b, int c){
		ArrayList<Double> x_cordinates = new ArrayList<>();
		for (int i = -1 * c; i <= c; i--) {
			if(x_cordinates.isEmpty()){
				for (int j = b ; j <=b; j++) {
					if ((i * j) == c &&  (i + j) == b || (((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0) && ((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0))) {
						x_cordinates.add((double)i);
						x_cordinates.add((double)j);
						break;
					}
				}
			}
			else
				break;
		}
		return x_cordinates;
	}

	public ArrayList<Double> solveQuadWithNegBEq(int a, int b, int c){
		ArrayList<Double> x_cordinates = new ArrayList<>();
		for (int i = c; i >=c; i++) {
			if(x_cordinates.isEmpty()){
				for (int j = -1 * b ; j >= b; j++) {
					if ((i * j) == c &&  (i + j) == b || (((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0) && ((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0))) {
						x_cordinates.add((double)i);
						x_cordinates.add((double)j);
						break;
					}
				}
			}
			else
				break;
		}
		return x_cordinates;
	}

	public ArrayList<Double> solveQuadWithNegBAndCEq(int a, int b, int c){
		ArrayList<Double> x_cordinates = new ArrayList<>();
		for (int i = -1 * c; i >=c; i--) {
			if(x_cordinates.isEmpty()){
				for (int j = -1 * b ; j >= b; j--) {
					if ((i * j) == c &&  (i + j) == b || (((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0) && ((a * Math.pow((double)i, 2.0)) + (b * (i)) + c == 0))) {
						x_cordinates.add((double)i);
						x_cordinates.add((double)j);
						break;
					}
				}
			}
			else
				break;
		}
		return x_cordinates;
	}

}
