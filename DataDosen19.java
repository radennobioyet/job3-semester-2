public class DataDosen19 {

    // a. Menampilkan data semua dosen menggunakan foreach
    public void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("\n========= DATA SEMUA DOSEN =========");
        for (Dosen19 dsn : arrayOfDosen) {
            String jk = dsn.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("------------------------------------");
        }
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n========= JUMLAH DOSEN PER JENIS KELAMIN =========");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    // c. Menampilkan rata-rata usia per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }

        System.out.println("\n========= RATA-RATA USIA PER JENIS KELAMIN =========");
        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0));
    }

    // d. Menampilkan dosen paling tua
    public void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 palingTua = arrayOfDosen[0];
        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.usia > palingTua.usia) {
                palingTua = dsn;
            }
        }
        System.out.println("\n========= DOSEN PALING TUA =========");
        System.out.println("Nama : " + palingTua.nama + " (Usia: " + palingTua.usia + ")");
    }

    // e. Menampilkan dosen paling muda
    public void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 palingMuda = arrayOfDosen[0];
        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.usia < palingMuda.usia) {
                palingMuda = dsn;
            }
        }
        System.out.println("\n========= DOSEN PALING MUDA =========");
        System.out.println("Nama : " + palingMuda.nama + " (Usia: " + palingMuda.usia + ")");
    }
}