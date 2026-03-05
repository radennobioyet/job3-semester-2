# JOBSHEET 3

# Percobaan 3

Pertanyaan
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya 
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah 
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar 
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner 





Jawaban
1. Ya, bisa. Hal ini disebut dengan Constructor Overloading. Sebuah class bisa memiliki beberapa constructor asalkan jumlah parameter atau tipe data parameternya berbeda.

contoh : 
```
public class MataKuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Constructor 1: Dengan semua parameter (seperti di gambar)
    public MataKuliah19(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Constructor 2: Constructor kosong (default)
    public MataKuliah19() {

    }
}
```


2.  
```
// Nomor 2: Method tambahData()
public void tambahData(Scanner sc) {
    System.out.print("Kode       : ");
    this.kode = sc.nextLine();

    System.out.print("Nama       : ");
    this.nama = sc.nextLine();

    System.out.print("Sks        : ");
    this.sks = Integer.parseInt(sc.nextLine());

    System.out.print("Jumlah Jam : ");
    this.jumlahJam = Integer.parseInt(sc.nextLine());

    System.out.println("________________________________________");
}
```

3. 
```
// Nomor 3: Method cetakInfo()
public void cetakInfo() {
    System.out.println("Kode       : " + this.kode);
    System.out.println("Nama       : " + this.nama);
    System.out.println("Sks        : " + this.sks);
    System.out.println("Jumlah Jam : " + this.jumlahJam);
    System.out.println("________________________________________");
}
```

4. 
```
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // nomor 4: panjang array ditentukan oleh input user
    System.out.print("Masukkan jumlah matakuliah yang akan diinput: ");
    int jumlahMatakuliah = sc.nextInt();
    MataKuliah01[] arrayOfMatakuliah = new MataKuliah01[jumlahMatakuliah];

    String kode, nama, dummy;
    int sks, jumlahJam;
    }
```