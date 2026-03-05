public class Mahasiswa19 {
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