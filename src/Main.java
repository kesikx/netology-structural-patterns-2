public class Main {
    public static void main(String[] args) {
        String e1 = "100101";
        String e2 = "10101";
        BinOps bins = new BinOps();
        System.out.println(bins.sum(e1, e2));
        System.out.println(bins.mult(e1, e2));
    }
}
