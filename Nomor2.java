import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    // Array harga buku
    static int[] hargaBuku = {350000, 450000, 500000, 95000};
    
    // Array nama buku
    static String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
    
    // Prosedur untuk menghitung total harga buku
    public static int hitungTotalHarga(ArrayList<Integer> daftarBuku) {
        int totalHarga = 0;
        for (int indexBuku : daftarBuku) {
            totalHarga += hargaBuku[indexBuku - 1];
        }
        return totalHarga;
    }
    
    // Prosedur untuk menghitung voucher
    public static int hitungVoucher(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga >= 200000 && totalHarga < 500000) {
            return 50000;
        } else if (totalHarga >= 500000 && totalHarga < 750000) {
            return 100000;
        } else if (totalHarga >= 750000 && totalHarga < 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Tampilkan daftar buku
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println((i+1) + " " + namaBuku[i] + " " + hargaBuku[i]);
        }
        
        // ArrayList untuk menyimpan buku yang dipilih
        ArrayList<Integer> daftarBuku = new ArrayList<>();
        
        // Proses pembelian buku
        while (true) {
            System.out.println("Masukan pilihan buku [1/2/3/4]: ");
            int pilihanBuku = input.nextInt();
            daftarBuku.add(pilihanBuku);
            
            System.out.print("Input lagi (Y/N)?: ");
            String konfirmasi = input.next();
            
            if (konfirmasi.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        // Hitung total harga
        int totalHarga = hitungTotalHarga(daftarBuku);
        
        // Hitung voucher
        int voucher = hitungVoucher(totalHarga);
        
        // Tampilkan total voucher dan total harga
        System.out.println("Total voucher belanja : " + voucher);
        System.out.println("Total yang harus dibayar : " + (totalHarga - voucher));
        
        input.close();
        
        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }
}