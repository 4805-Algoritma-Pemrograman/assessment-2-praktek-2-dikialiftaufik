import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        System.out.print("Masukan nilai N : " + N + "\n");
        cetakFizzBuzz(N);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
    public static void cetakFizzBuzz(int N) {
        System.out.print("0 ");
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}