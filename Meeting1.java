import java.util.*;
class Meeting1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		System.out.print("Input no of emps : ");
		final int N=input.nextInt();
		
		int r5000=0, r2000=0, r1000=0;
		
		for (int i = 0; i < N; i++){
			System.out.print("Input emp salary "+(i+1)+" : ");
			int salary=input.nextInt();
			r5000+=salary/5000;
			salary%=5000;
			
			r2000+=salary/2000;
			salary%=2000;
			
			r1000+=salary/1000;
		}
		System.out.println("R5000 : "+r5000);
		System.out.println("R2000 : "+r2000);
		System.out.println("R1000 : "+r1000);
	}
}