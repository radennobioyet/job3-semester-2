import java.util.Scanner;

public class DosenDemo019 {
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
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W) : ");
            jkInput = sc.nextLine();

            // Logika sederhana untuk menentukan Boolean jenis kelamin
            jenisKelamin = jkInput.equalsIgnoreCase("P");

            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            // Memasukkan objek ke dalam array
            arrayOfDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        // Memanggil Class DataDosen untuk memproses data
        DataDosen19 dataDosenObj = new DataDosen19();
        dataDosenObj.dataSemuaDosen(arrayOfDosen);
        dataDosenObj.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosenObj.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosenObj.infoDosenPalingTua(arrayOfDosen);
        dataDosenObj.infoDosenPalingMuda(arrayOfDosen);
    }
}