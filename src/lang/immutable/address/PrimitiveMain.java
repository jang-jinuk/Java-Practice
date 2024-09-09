package lang.immutable.address;

public class PrimitiveMain {
  public static void main(String[] args) {

    int a = 10;
    int b = a;
    System.out.println("a = " + a);
    System.out.println("b = " + b); // a값을 복사해서 b에 대입한다.

    b = 20;
    System.out.println("20 -> b");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
