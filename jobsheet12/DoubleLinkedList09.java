package jobsheet12;

public class DoubleLinkedList09 {
    Node09 head;
    Node09 tail;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa09 data) {
        Node09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node09 newNode = new Node09(data);

        newNode.prev = current;
        newNode.next = current.next;

        if (current != tail) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;

        System.out.println("Data berhasil disisipkan setelah NIM: " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node09 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Mahasiswa09 dataTerhapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        } 
        System.out.println("Data berhasil dihapus.");
        dataTerhapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Mahasiswa09 dataTerhapus = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus.");
        dataTerhapus.tampil();
    }
}
