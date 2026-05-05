package Pertemuan12.Latihan;

public class LinkedList {
    Node front, rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void enqueue(Mahasiswa mhs) {
        Node newNode = new Node(mhs, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Memanggil mahasiswa:");
            front.data.tampilData();
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node temp = front;
            System.out.println("Isi Antrian:");
            while (temp != null) {
                temp.data.tampilData();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantri: " + size);
    }
}