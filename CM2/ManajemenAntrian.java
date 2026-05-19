package CM2;

public class ManajemenAntrian {
    public Node headAntrian, tailAntrian;
    public Node headLaporan, tailLaporan;
    public int counter = 1;

    public void tambahAntrian(String nama, String noHp) {
        Node newNode = new Node(new Pembeli(nama, noHp), counter);
        
        if (headAntrian == null) {
            headAntrian = tailAntrian = newNode;
        } else {
            tailAntrian.next = newNode;
            newNode.prev = tailAntrian;
            tailAntrian = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counter);
        counter++;
    }

    public void cetakAntrian() {
        System.out.println("\n----------------------------");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("----------------------------");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        Node temp = headAntrian;
        if (temp == null) {
            System.out.println("Antrian Kosong");
            return;
        }
        while (temp != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
                temp.noAntrian, temp.pembeli.namaPembeli, temp.pembeli.noHp);
            temp = temp.next;
        }
    }

    public void prosesAntrian(int kode, String menu, int harga) {
        if (headAntrian == null) {
            System.out.println("Tidak ada antrian!");
            return;
        }

        Pembeli p = headAntrian.pembeli;
        System.out.println(p.namaPembeli + " telah memesan " + menu);

        headAntrian = headAntrian.next;
        if (headAntrian != null) {
            headAntrian.prev = null;
        } else {
            tailAntrian = null;
        }

        Pesanan ps = new Pesanan(kode, menu, harga);
        Node nodePesanan = new Node(ps);
        
        if (headLaporan == null) {
            headLaporan = tailLaporan = nodePesanan;
        } else {
            tailLaporan.next = nodePesanan;
            nodePesanan.prev = tailLaporan;
            tailLaporan = nodePesanan;
        }
    }

    public void cetakLaporanPesanan() {
        if (headLaporan == null) {
            System.out.println("Belum ada laporan pesanan.");
            return;
        }

        sortByMenu();

        System.out.println("\nLAPORAN PESANAN");
        System.out.println("------------------------------------------");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        Node temp = headLaporan;
        while (temp != null) {
            System.out.printf("%-15d %-20s %-10d\n", temp.pesanan.kodePesanan, temp.pesanan.namaPesanan, temp.pesanan.harga);
            temp = temp.next;
        }
    }

    public void sortByMenu() {
        if (headLaporan == null || headLaporan.next == null) return;

        Node current, index;
        for (current = headLaporan; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(index.pesanan.namaPesanan) > 0) {
                    Pesanan temp = current.pesanan;
                    current.pesanan = index.pesanan;
                    index.pesanan = temp;
                }
            }
        }
    }
}