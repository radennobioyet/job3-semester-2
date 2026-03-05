# JOBSHEET 3

# Percobaan 1

Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan! 
2. Apa yang dilakukan oleh kode program berikut? 
```
Mahasiswa01[] arrayOfMahasiswa = new Mahasiswa01[3] 
```

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
```
arrayMahasiswa[0] = new Mahasiswa() 
```

4. Apa yang dilakukan oleh kode program berikut? 
``` 
arrayOfMahasiswa[0] = new Mahasiswa01(); 
arrayOfMahasiswa[0].nim = "244107060033"; 
arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI"; 
arrayOfMahasiswa[0].kelas = "SIB-1E"; 
arrayOfMahasiswa[0].ipk = (float) 3.75; 
```

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2? 



Jawaban
1. Tidak harus. Sebuah class bisa saja hanya berisi atribut (sebagai penampung data/POJO) atau hanya berisi method. Namun, dalam konteks array of objects, biasanya class memiliki atribut untuk menyimpan status data unik dari setiap objek yang ada di dalam array tersebut.
2. Baris ini melakukan deklarasi dan instansiasi array. Program menyiapkan sebuah variabel array bernama arrayOfMahasiswa yang dapat menampung 3 buah referensi (alamat memori) objek dari class Mahasiswa. 
3. Ya, tetap memiliki. Meskipun tidak dituliskan konstruktor secara eksplisit di dalam kode, Java secara otomatis akan menyediakan Default Constructor (konstruktor tanpa parameter) saat proses kompilasi. Itulah sebabnya new Mahasiswa() Masih bisa dipanggil. 
4. Berfungsi untuk membuat satu objek mahasiswa baru di indeks ke-0 dan langsung mengisi datanya (NIM, Nama, dsb). 
5. Agar rapi dan terorganisir. Memisahkan antara cetakan data (Mahasiswa01) dan program utama (MahasiswaDemo01) yang menjalankan logika. 