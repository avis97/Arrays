import java.util.*;
public class deleteduplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            flag=false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
        //Hash set
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     set.add(arr[i]);
        // }
    }
}
