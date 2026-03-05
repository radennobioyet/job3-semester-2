# JOBSHEET 3

# Percobaan 2

Pertanyaan
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3. 
2. . Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error? 
```
Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3]; 
myArrayOfMahasiswa[0].nim = "244107060033"; 
myArrayOfMahasiswa[0].nama = "AGNES TITANIA 
KINANTI"; 
myArrayOfMahasiswa[0].kelas = "SIB-1E"; 
myArrayOfMahasiswa[0].ipk = (float) 3.75;
``` 




Jawaban
1. 
```
public class Mahasiswa01 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo( int i ) {
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.println("NIM   : " + this.nim);
        System.out.println("Nama  : " + this.nama);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("IPK   : " + this.ipk);
        System.out.println("________________________________");
    }
}
```

2. 
```
import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa19[] arrayOfMahasiswa = new Mahasiswa19[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa19();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM  : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();

            System.out.print("Nama : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK  : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

            System.out.println("________________________________");
        }

        for (int i = 0; i < 3; i++) {
            // System.out.println("Data Mahasiswa ke-" + (i + 1));
            // System.out.println("NIM   : " + arrayOfMahasiswa[i].nim);
            // System.out.println("Nama  : " + arrayOfMahasiswa[i].nama);
            // System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            // System.out.println("IPK   : " + arrayOfMahasiswa[i].ipk);
            // System.out.println("________________________________");
            arrayOfMahasiswa[i].cetakInfo(i);
        }
    }
}
```