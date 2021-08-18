package uniqueChar;
import java.util.Scanner;
public class UniqueCharString {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 char c[]=s.toCharArray();
	 int a[]=new int[1000];
	 for(int i=0;i<c.length;i++)
	 {
		 if(a[c[i]]==0) {
			 System.out.print(c[i]);
			 a[c[i]]+=1;
		 }
	 }
 }
}
