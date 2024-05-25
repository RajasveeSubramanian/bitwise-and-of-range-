import java.util.*;
public class bit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start =sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		while(start!=end) {
			start>>=1;
			end>>=1;
			count++;
			
		}
		System.out.print(end<<count);
	}

}
