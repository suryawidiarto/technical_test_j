package algoritma_1;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 50;
        int b = 63;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }
}
