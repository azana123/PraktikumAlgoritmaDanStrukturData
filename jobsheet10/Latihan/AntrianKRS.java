package jobsheet10.Latihan;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;
    int maxDilayani = 30;
    public AntrianKRS(){}
    public AntrianKRS(int max){
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear(){
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa m){
        if (IsFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (jumlahDilayani + size >= maxDilayani) {
            System.out.println("Kuota DPA penuh (30 mahasiswa)");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
    }

    public void layani2Mahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int jumlah;
        if (size >= 2) {
            jumlah = 2;
        } else {
            jumlah = size;
        }
        System.out.println("Melayani mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    public void tampilSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilDepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        int jumlah;
        if (size >= 2) {
            jumlah = 2;
        } else {
            jumlah = size;
        }

        for (int i = 0; i < jumlah; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilBelakang(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getJumlahDilayani(){
        return jumlahDilayani;
    }

    public int sisaBelumDilayani(){
        return maxDilayani - jumlahDilayani;
    }
}
