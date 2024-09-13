package lang.string.test;

public class TestString9 {
  public static void main(String[] args) {
    String mail = "hello@example.com";
    String[] parts = mail.split("@");
    String idPart = parts[0];
    String domainPart = parts[1];
    System.out.println("ID: " + idPart);
    System.out.println("Domain: " + domainPart);

  }
}
