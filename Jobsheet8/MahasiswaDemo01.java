import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat daftar Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nama : ");
                    String nama = sc.nextLine();
                    System.out.println("NIM : ");
                    String nim = sc.nextLine();
                    System.out.println("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas %s berhasil dikumpulkan\n" + mhs.nama);
                    break;
                case 2:
                    Mahasiswa01 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.println("Nilai Tugas %s adalh %d\n");
                    }                    
                    break;
                case 3:
                    Mahasiswa01 lihat = stack.pop();
                    if (lihat != null) {
                        System.out.println("Tugas terkhir dikumpulkan oleh " + lihat.nama);
                    }                   
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();                 
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
