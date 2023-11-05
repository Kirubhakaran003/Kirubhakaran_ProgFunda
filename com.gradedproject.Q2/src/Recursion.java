
public class Recursion {
		public static int ValueOfPowerN(int a, int b) {
			//base condition
			if(b==0) {
				return 1;
				}
			else {
				return a*ValueOfPowerN(a,b-1);
			}
		}

	public static void main(String[] args) {
//		to find the value of x power n
//		here a is base number that is x
//		b is power that is x
		System.out.println("X power N is : "+ValueOfPowerN(2,10));
	}

}
