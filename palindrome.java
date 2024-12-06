import java.util.*;
class palindrome
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
                rev=rev*10+dig;
                n/=10;
            }
            System.out.println(rev);
            if(rev==temp)
            {
                System.out.println("palindrome");
            }
            else
            {
                System.out.println("not palindrome");

            }
            }
            }
        }
    
