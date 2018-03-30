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
		 System.out.println("Enter the current head position");
		 int head=sc.nextInt();
		 Arrays.sort(a);
		 int temp=head;
		 int position=-1;
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]>=head)
			 {
				 position=i;
				 break;
			 }
		 }
		 int left_dist=head-a[0],right_dist=a[n-1]-head,count=0;
		 if(left_dist<right_dist)
		 {
			 for(int i=position-1;i>=0;i--)
			 {
				 count+=temp-a[i];
				 temp=a[i];//new head position
			 }
			 count+=a[position]-a[0];
			 for(int i=position+1;i<n;i++)
			 {
				 count+=a[i]-a[i-1];
			 }
		 }
		 else
		 {
			 for(int i=position;i<n;i++)
			 {
				 count+=a[i]-temp;
				 temp=a[i];
			 }
			 count+=a[n-1]-a[position-1];
			 for(int i=position-1;i>=1;i--)
			 {
				 count+=a[i]-a[i-1];
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
total head movements are=236
*/