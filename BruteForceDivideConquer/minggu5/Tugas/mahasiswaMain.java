package BruteForceDivideConquer.minggu5.Tugas;

public class mahasiswaMain {

    public static void main(String[] args) {
        mahasiswa[] arrayOfMahasiswa = new mahasiswa[8];
        arrayOfMahasiswa[0] = new mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        arrayOfMahasiswa[1] = new mahasiswa("Budi", "220101002", 2022, 82, 88);
        arrayOfMahasiswa[2] = new mahasiswa("Cindy", "220101003", 2021, 90, 87);
        arrayOfMahasiswa[3] = new mahasiswa("Dian", "220101004", 2021, 76, 79);
        arrayOfMahasiswa[4] = new mahasiswa("Eko", "220101005", 2023, 92, 95);
        arrayOfMahasiswa[5] = new mahasiswa("Fajar", "220101006", 2020, 88, 85);
        arrayOfMahasiswa[6] = new mahasiswa("Gina", "220101007", 2023, 80, 83);
        arrayOfMahasiswa[7] = new mahasiswa("Hadi", "220101008", 2020, 82, 83);

        mahasiswa m = new mahasiswa();
        int highestUTSBF = m.BruteForceHighUTS(arrayOfMahasiswa);
        System.out.println("Nilai UTS tertinggi menggunakan Brute Force\t\t: " + highestUTSBF);

        int highestUTSDC = m.DivideAndConquerHighUTS(arrayOfMahasiswa, 0, arrayOfMahasiswa.length - 1);
        System.out.println("Nilai UTS tertinggi menggunakan Divide and Conquer\t: " + highestUTSDC);

        int highestUASBF = m.BruteForceHighUAS(arrayOfMahasiswa);
        System.out.println("Nilai UAS tertinggi menggunakan Brute Force\t\t: " + highestUASBF);

        int highestUASDC = m.DivideAndConquerHighUAS(arrayOfMahasiswa, 0, arrayOfMahasiswa.length - 1);
        System.out.println("Nilai UAS tertinggi menggunakan Divide and Conquer\t: " + highestUASDC);

        double rataRata = m.BruteForceRataRataUAS(arrayOfMahasiswa);
        System.out.printf("Rata rata nilai UAS menggunakan Brute Force\t\t: %.2f\n", rataRata);
    }
}