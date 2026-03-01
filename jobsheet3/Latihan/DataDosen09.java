package PraktikumAlgoritmaDanStrukturData.jobsheet3.Latihan;

public class DataDosen09 {
    void dataSemuaDosen (Dosen09[] arrayOfDosen) {
        int counter = 1;
        System.out.println("===Data Semua Dosen===");
        for (Dosen09 dosen : arrayOfDosen) {
            System.out.println("Data dosen ke-" + counter);
            dosen.tampil();
            counter++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int jumlahDosenPria = 0;
        int jumlahDosenWanita = 0;

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahDosenPria++;
            } else {
                jumlahDosenWanita++;
            }
        }
        System.out.println("=========================================");
        System.out.println("Jumlah dosen berdasarkan jenis kelamin");
        System.out.println("Jumlah dosen pria: " + jumlahDosenPria);
        System.out.println("Jumlah dosen wanita: " + jumlahDosenWanita);
        System.out.println();
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int jumlahDosenPria = 0;
        int jumlahDosenWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahDosenPria++;
                totalUsiaPria += dosen.usia;
            } else {
                jumlahDosenWanita++;
                totalUsiaWanita += dosen.usia;
            }
        }
        double rataDosenPria = (double) totalUsiaPria / jumlahDosenPria;
        double rataDosenWanita = (double) totalUsiaWanita / jumlahDosenWanita;
        
        System.out.println("=========================================");
        System.out.printf("Rata-rata usia dosen pria: %.2f tahun%n", rataDosenPria);
        System.out.printf("Rata-rata usia dosen wanita: %.2f tahun %n", rataDosenWanita);
    }

    void infoDosenPalingTua(Dosen09[] arrayOfDosen){
        if (arrayOfDosen.length == 0) {
            System.out.println("=========================================");
            System.out.println("Data dosen kosong!");
            return;
        }

        Dosen09 dosenTertua = arrayOfDosen[0];
        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("=========================================");
        System.out.println("=== Data dosen tertua ===");
        dosenTertua.tampil();
    }

    void infoDosenPalingMuda(Dosen09[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("======================================");
            System.out.println("Data dosen kosong!");
            return;
        }

        Dosen09 dosenTerMuda = arrayOfDosen[0];
        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTerMuda.usia) {
                dosenTerMuda = dosen;
            }
        }
        System.out.println("=========================================");
        System.out.println("=== Data dosen termuda ===");
        dosenTerMuda.tampil();
    }
}
