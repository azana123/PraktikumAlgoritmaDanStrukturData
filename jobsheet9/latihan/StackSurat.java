package jobsheet9.latihan;

public class StackSurat {
    Surat[] data;
    int top;

    public StackSurat(int kapasitas) {
        data = new Surat[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(Surat s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat s = data[top--];
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Belum ada surat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;

        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                data[i].tampilData();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}
