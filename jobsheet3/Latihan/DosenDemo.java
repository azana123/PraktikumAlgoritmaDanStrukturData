package PraktikumAlgoritmaDanStrukturData.jobsheet3.Latihan;
import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahDosen;

        System.out.println("=========================================");
        System.out.print("Masukan jumlah dosen: ");
        jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen09[] listDosen = new Dosen09[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            listDosen[i] = new Dosen09("", "", false, 0);
        }

        int counter = 1;
        for (Dosen09 dosen : listDosen) {
            System.out.println("Input data dosen ke-" + counter);
            dosen.inputData(sc);
            counter++;
            System.out.println();
        }

        DataDosen09 dataDosen = new DataDosen09();
        dataDosen.dataSemuaDosen(listDosen);
        dataDosen.jumlahDosenPerJenisKelamin(listDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(listDosen);
        dataDosen.infoDosenPalingTua(listDosen);
        dataDosen.infoDosenPalingMuda(listDosen);

    }
}