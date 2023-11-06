import java.util.Scanner;
class input
{
    public static void main(String st[])
    {
       Scanner enter=new Scanner(System.in);

       int i,j;
       System.out.print("Please enter the no. of rows:");
       int a=enter.nextInt();
       System.out.print("Please enter the no. of column:");
       int b=enter.nextInt();
       for(i=1;i<=a;i++)
       {
        for(j=1;j<=b;j++)
        {
            System.out.print(" *");
        }
        System.out.print("\n");
       }
      

       
    }
}