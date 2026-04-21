package jobsheet5.Praktikum05;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx;

    void tambah(Dosen dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        if (showEmptyData()) {
            System.out.println("Data Dosen");
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
                System.out.println("-----------------------");
            }
        }
    }
    
    boolean showEmptyData() {
        if (idx == 0) {
            System.out.println("Data dosen kosong");
            return false;
        }else {
            return true;
        }
    }

    void SortingASC() {
        if (showEmptyData()) {
            for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
            }
        }
    }

    void SortingDSC() {
        if (showEmptyData()) {
            for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
            }
        }
    }

    void InsertionSort() {
        if (showEmptyData()) {
            for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
            }
        }
    }
}
