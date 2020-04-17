import java.util.*;
class Meeting2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,total=0;
		
		for (int i = 0; i < 10; i++){
			System.out.print("Input marks "+(i+1)+" : ");
			int marks=input.nextInt();
			total+=marks; //total=total+marks;
			if(marks>max){
				max=marks;
			}
			if(marks<min){
				min=marks;
			}
			
		}
		System.out.println("Total   : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}