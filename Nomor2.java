import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] hargaBuku = {350000, 450000, 500000, 95000};
        String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game Of Throne", "Psychology Of Money"};

        ArrayList<Integer> hargaBelanja = new ArrayList<>();

        while (true) {
            int pilihan = input.nextInt();
            hargaBelanja.add(hargaBuku[pilihan-1]);
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }

        int totalHarga = hitungTotalHarga(hargaBelanja);
        int voucherBelanja = hitungVoucherBelanja(totalHarga);

        System.out.println("Total voucher belanja : " + voucherBelanja);
        System.out.println("Total yang harus dibayar : " + (totalHarga + 50000 - voucherBelanja));

        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }

    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int totalHarga = 0;
        for (int harga : hargaBelanja) {
            totalHarga += harga;
        }
        return totalHarga;
    }

    public static int hitungVoucherBelanja(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga >= 200000 && totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga > 500000 && totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga > 750000 && totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }
}