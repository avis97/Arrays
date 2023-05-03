import java.util.*;
public class primenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean flag=false;
        for(int i=a;i<=b;i++)
        {
            flag=false;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                   flag=true;
                   break;
                }
            }
            if(flag==false)
            {
                System.out.println("This is a prime number"+i);
            }
        }
    }
}
