package Pertemuan14.Jobsheet14.praktikum2;
import Pertemuan14.Jobsheet14.praktikum1.Mahasiswa09;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray09 bta = new BinaryTreeArray09();
        
        Mahasiswa09 mhs1 = new Mahasiswa09("244160121", "Ali", "A", 3.57);
        Mahasiswa09 mhs2 = new Mahasiswa09("244160185", "Candra", "C", 3.41);
        Mahasiswa09 mhs3 = new Mahasiswa09("244160221", "Badar", "B", 3.75);
        Mahasiswa09 mhs4 = new Mahasiswa09("244160220", "Dewi", "B", 3.35);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);

        System.out.println("\n--- InOrder Traversal ---");
        bta.traverseInOrder(0);

        System.out.println("\n--- PreOrder Traversal ---");
        bta.traversePreOrder(0);
    }
}