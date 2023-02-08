package algoritma_4;

public class Counter {
    public static void main(String[] args) {
        int i = 1;
        int counter = 1;
        while (i <= 100){
            System.out.println(i);

            boolean checkPrime = false;
            for (int j = 2; j <= i; j++) {
                if(j == i && i % j == 0){
                    checkPrime = true;
                } else if (i % j == 0) {
                    break;
                }
            }
            if(checkPrime){
                System.out.println("Bilangan Prima: "+i);
            }

            if(i % 9 == 0){
                System.out.println("Kelipatan 9 ke-"+counter);
                counter++;
            }
            i++;
        }
    }
}
