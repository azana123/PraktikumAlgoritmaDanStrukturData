package Pertemuan14.Jobsheet14.praktikum2;
import Pertemuan14.Jobsheet14.praktikum1.Mahasiswa09;

public class BinaryTreeArray09 {
    Mahasiswa09[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray09() {
        this.dataMahasiswa = new Mahasiswa09[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa09 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa09 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Gagal menambahkan data! Ukuran Array Tree sudah penuh.");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}