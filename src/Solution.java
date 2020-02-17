import java.util.Scanner;

public class Solution {
    public static void solution() {
    	//Scanner scan=new Scanner(System.in);
		int x=new Scanner(System.in).nextInt();
		for(int i=2;i<=x/2;i++) {
			if(x%i!=0) {
				continue;
			}else {
				break;
			}
		}
		if(x<2) {
			System.out.println("Not Prime");
		}
    }
}