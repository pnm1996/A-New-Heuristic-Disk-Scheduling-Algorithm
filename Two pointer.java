import java.util.Arrays;
import java.util.Scanner;

 public class DiskScheduling {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of disk accesses");
		 int n=sc.nextInt();
		 int a[]=new int[n];//array to store disk accesses
		 System.out.println("Enter the disk acceses");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		 int count=0;
		 for(int i=0,j=n-1;j-i>1;)
		 {
		 	if(a[i+1]-a[i] <= a[j]-a[j-1])
		 	{
		 		count+=a[i+1]-a[i];
		 		i++;
		 	}
		 	else
		 	{
		 		count+=a[j]-a[j-1];
		 		j--;
		 	}
		 }
		 System.out.println("total head movements are="+count);
	}
}
/*Output:Enter the number of disk accesses
9
Enter the disk acceses
36
180
120
10
15
40
188
150
168
Enter the current head position
130
total head movements are=98
*/