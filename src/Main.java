import java.util.*;
public class Main
{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		String str2="";
		String s1,s2;
		int x=0;
		int y=0;
		if(str.charAt(0)=='f') {
			s1="ftp";
			x=3;
		}
		else {
			s1="http";
			x=4;
		}
		for(int i=x;i<str.length();i++) {
			if(i>2) {
				if(y==0) {
					if(str.charAt(i)=='r' && str.charAt(i+1)=='u') {
						y=i;
					}
				}
			}
		}
		s2=str.substring(y+2);
		str2=s1+"://"+str.substring(x,y)+".ru"+"/"+s2;
		System.out.println(str2);
		scan.close();
	}
}