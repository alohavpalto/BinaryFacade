public class Main {

  public static void main(String[] args) {
    BinOps bins = new BinOps();
    String result1 = bins.sum("1010", "1100");
    String result2 = bins.mult("101", "11");
    System.out.println(result1);
    System.out.println(result2);
  }
}
