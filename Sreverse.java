public class SReverse{

public static void main(String[] args)
{
 ArrayList<String> arayL = new ArrayList<>();
 Scanner sc = new Scanner(System.in);
 System.out.println("Array Size?");
 int s = sc.nextInt());
 for (int i = 0; i < s; i++)
 {
 arayL.add(sc.next());
 }
 System.out.println("Reversed Strings: ");
 for(int j = arayL.size() - 1; j >= 0; j--)
 {
  System.out.println(arayL.get(j));
  }
  }
  }