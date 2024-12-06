import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=Sc.nextInt();
            int temp=n;
            int rev=0;
            while(n>0)
            {
                int dig=n%10;
                rev=rev+dig*dig*dig;
                n/=10;
            }
            System.out.println(rev);
            if(rev==temp)
            {
                System.out.println("armstrong number");
            }
            else
            {
                System.out.println("not armstrong nuber");

            }
            }
            }
        }
    