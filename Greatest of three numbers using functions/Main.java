import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int temp = comp(n1,n2);
      int grt = comp(temp,n3);   
      System.out.println(grt);
	}
  public static int comp(int x, int y)
  {
   if(x > y)
     return x;
    else
      return y;
  }
}