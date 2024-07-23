package Day1;

public class Loops {
	public static void main(String[] args) {
		 System.out.println("For Loop\n");
		for (int i = 0; i <= 10; i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}else {
				 System.out.println(i+" is odd");
			}
		}
		
		 System.out.println("While Loop\n");
		int a=10;
		while(a!=0) {
			 System.out.println("Hello world "+ a);
			 a--;
		}
		
		System.out.println("DoWhile Loop\n");
		do {
			System.out.println("Runnig");
		}while(false);
	}
}
