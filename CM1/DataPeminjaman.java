package CM1;

public class DataPeminjaman {

    public static Mahasiswa[] getMahasiswa() {
        return new Mahasiswa[] {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };
    }

    public static Buku[] getBuku() {
        return new Buku[] {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };
    }

    public static Peminjaman[] getPeminjaman(Mahasiswa[] mhs, Buku[] buku) {
        return new Peminjaman[] {
            new Peminjaman(mhs[0], buku[0], 7),
            new Peminjaman(mhs[1], buku[1], 3),
            new Peminjaman(mhs[2], buku[2], 10),
            new Peminjaman(mhs[2], buku[3], 6),
            new Peminjaman(mhs[0], buku[1], 4)
        };
    }

    public static void sortByDenda(Peminjaman[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i].hitungDenda();
        }

        for (int i = 1; i < data.length; i++) {
            Peminjaman key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].denda < key.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    public static void cariByNIM(Peminjaman[] data, String nim) {
        boolean ketemu = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i].mhs.nim.equals(nim)) {
                data[i].tampilPeminjaman();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan!");
        }
    }
}