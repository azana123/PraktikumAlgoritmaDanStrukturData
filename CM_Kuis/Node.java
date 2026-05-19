package CM_Kuis;

public class Node {
    Pembeli pembeli;
    Pesanan pesanan;
    int noAntrian;
    Node next, prev;

    public Node(Pembeli p, int no) {
        this.pembeli = p;
        this.noAntrian = no;
        this.next = this.prev = null;
    }

    public Node(Pesanan ps) {
        this.pesanan = ps;
        this.next = this.prev = null;
    }
}