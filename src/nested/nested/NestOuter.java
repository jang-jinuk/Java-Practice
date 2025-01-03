package nested.nested;

public class NestOuter {
  private static int outClassValue = 3;
  private int outInstanceValue = 2;

  static class Nested {
    private int nestedInstanceValue = 1;

    public void print() {

      // 자신의 맴버에 접근
      System.out.println(nestedInstanceValue);

      // 바깥 클래스의 인스턴스 맴버에는 접근할 수 없다.
      // System.out.println(outInstanceValue);

      // 바깥 클래스의 클래스 맴버에는 접근할 수 있다. private 접근 가능
      System.out.println(NestOuter.outClassValue);
    }
  }
}
