package lang.object;

//명시적으로 Parent를 상속 받았다.
//상속 흐름 : Child -> Parent -> Object
public class Child extends Parent{

  public void childMethod() {
    System.out.println("Child.childMethod");
  }
}