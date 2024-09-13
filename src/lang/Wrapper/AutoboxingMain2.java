package lang.Wrapper;

public class AutoboxingMain2 {
  public static void main(String[] args) {
    // Primitive -> Wrapper
    int value = 7;
    Integer boxedValue = value; // 오토 박싱(Auto-boxing)

    // Wrapper -> Primitive
    int unboxedValue = boxedValue;

    System.out.println("boxedValue : " + boxedValue);
    System.out.println("unboxedValue : " + unboxedValue);
  }
}