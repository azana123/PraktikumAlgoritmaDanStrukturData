package BruteForceDivideConquer.minggu5.Tugas;

public class mahasiswa {
    String nama, NIM;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    mahasiswa() {}

    mahasiswa(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int BruteForceHighUTS (mahasiswa[] arrayOfMahasiswa) {
        int highest = arrayOfMahasiswa[0].nilaiUTS;
        for (int i = 1; i < arrayOfMahasiswa.length; i++) {
            if (arrayOfMahasiswa[i].nilaiUTS > highest) {
                highest = arrayOfMahasiswa[i].nilaiUTS;
            }
        }
        return highest;
    }

    int DivideAndConquerHighUTS (mahasiswa[] arrayOfMahasiswa, int left, int right) {
        if (left == right) {
            return arrayOfMahasiswa[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int leftMax = DivideAndConquerHighUTS(arrayOfMahasiswa, left, mid);
        int rightMax = DivideAndConquerHighUTS(arrayOfMahasiswa, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    int BruteForceHighUAS (mahasiswa[] arrayOfMahasiswa) {
        int highest = arrayOfMahasiswa[0].nilaiUAS;
        for (int i = 1; i < arrayOfMahasiswa.length; i++) {
            if (arrayOfMahasiswa[i].nilaiUAS > highest) {
                highest = arrayOfMahasiswa[i].nilaiUAS;
            }
        }
        return highest;
    }

    int DivideAndConquerHighUAS (mahasiswa[] arrayOfMahasiswa, int left, int right) {
        if (left == right) {
            return arrayOfMahasiswa[left].nilaiUAS;
        }
        int mid = (left + right) / 2;
        int leftMax = DivideAndConquerHighUAS(arrayOfMahasiswa, left, mid);
        int rightMax = DivideAndConquerHighUAS(arrayOfMahasiswa, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    double BruteForceRataRataUAS(mahasiswa[] arrayOfMahasiwa) {
        int totalUAS = 0;
        for (int i = 0; i < arrayOfMahasiwa.length; i++) {
            totalUAS += arrayOfMahasiwa[i].nilaiUAS;
        }
        return (double) totalUAS / arrayOfMahasiwa.length;
        
    }
}       