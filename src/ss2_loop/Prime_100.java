package ss2_loop;

public class Prime_100 {
    public static void main(String[] args) {
        int num = 2;
        boolean isPrime;
        while (num < 100){
            isPrime  = true;
            for (int i=2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num);
            }
            num++;
        }
    }
}
