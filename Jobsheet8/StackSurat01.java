public class StackSurat01 {
    Surat01[] stack;
    int top, size;

    public StackSurat01(int size){
        this.size = size;
        stack = new Surat01[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat01 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat01 pop() {
        if (!isEmpty()) {
            Surat01 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang tersimpan.");
            return null;
        }
    }
    public int cariBerdasarkanNama(String nama) {
    for (int i = top; i >= 0; i--) {
        if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            tampilSuratDitemukan(nama, i);
            return i;
        }
    }
    tampilSuratTidakDitemukan(nama);
    return -1;
}

public void tampilSuratDitemukan(String nama, int pos) {
    System.out.println("Surat ditemukan:");
    System.out.println("ID: " + stack[pos].idSurat + " | Nama: " + stack[pos].namaMahasiswa + " | Kelas: " + stack[pos].kelas +" | Izin: " + (stack[pos].jenisIzin == 'S' ? "Sakit" : "Lain") + " | Durasi: " + stack[pos].durasi + " hari");
}

public void tampilSuratTidakDitemukan(String nama) {
    System.out.println("Surat atas nama " + nama + " tidak ditemukan");
}
}
