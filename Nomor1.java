import java.util.Scanner;

public class Nomor1 {
    // Prosedur untuk menampilkan deret FizzBuzz
    public static void tampilkanFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        tampilkanFizzBuzz(N);
        /* Pekerjaan anda berakhir sisi */
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
}