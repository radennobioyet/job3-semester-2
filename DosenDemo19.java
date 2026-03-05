import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menentukan jumlah dosen (misal: 3 dosen)
        Dosen19[] arrayOfDosen = new Dosen19[3];
        String kode, nama, dummy, jkInput;
        Boolean jenisKelamin;
        int usia;

        // Looping FOR untuk input data ke Array of Object
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W) : ");
            jkInput = sc.nextLine();

            // Logika sederhana untuk menentukan Boolean jenis kelamin
            jenisKelamin = jkInput.equalsIgnoreCase("P");

            System.out.print("Usia           : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------------------------------");

            // Memasukkan objek ke dalam array
            arrayOfDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        // Looping FOREACH untuk menampilkan data ke layar
        System.out.println("\n---------------- DAFTAR INFORMASI DOSEN ----------------");
        int no = 1;
        for (Dosen19 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode           : " + dsn.kode);
            System.out.println("Nama           : " + dsn.nama);

            // Konversi Boolean ke teks agar mudah dibaca
            String jkText = (dsn.jenisKelamin) ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin  : " + jkText);

            System.out.println("Usia           : " + dsn.usia);
            System.out.println("---------------------------------------------------------");
            no++;
        }
    }
}