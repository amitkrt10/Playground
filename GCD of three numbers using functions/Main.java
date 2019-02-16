import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  int n1 = in.nextInt();
  int n2 = in.nextInt();
  int n3 = in.nextInt();
  int g1 = comp(n1,n2);
  int g = comp(g1, n3);
  System.out.println(g);
}
  public static int comp(int a, int b)
  {
    int temp;
   if(a < b)
    temp = gcd(a, b);
  else
    temp = gcd(b, a); 
    return temp;
  }
  public static int gcd(int x, int y)
  {
    int i = x;
    while(i > 0)
    {
     if(x % i == 0 && y % i == 0)
       break;
      i--;
    }
    return i;
  }
}
