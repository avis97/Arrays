import java.util.*;
public class secondmax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
        }
        System.out.println(first+" "+second);
    }
}
