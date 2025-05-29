import java.util.Scanner;
public class SLLMain01 {
    public static void main(String[] args) {
        SingleLinkedList01 sll = new SingleLinkedList01();
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        double ipk;
        int pilihan;

        do {
            System.out.println("==== MENU ===");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Tambah Data Setelah Node Tertentu");
            System.out.println("4. Tambah Data Pada Index Tertentu");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Exit");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("-- Tambah Data di Awal --");
                    System.out.print("Nama : ");
                    nama = sc.nextLine();
                    System.out.print("NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("IPK : ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa01 mhsFirst = new Mahasiswa01(nim, nama, kelas, ipk);
                    sll.addFirst(mhsFirst);
                    System.out.println("Data Berhasil Ditambahkan di Awal!");
                    break;
                case 2:
                    System.out.println("-- Tambah Data di Akhir --");
                    System.out.print("Nama : ");
                    nama = sc.nextLine();
                    System.out.print("NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("IPK : ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa01 mhsLast = new Mahasiswa01(nim, nama, kelas, ipk);
                    sll.addLast(mhsLast);
                    System.out.println("Data Berhasil Ditambahkan di Akhir!");
                    break;
                case 3:
                    System.out.println("-- Tambah Data Setelah Node Tertentu --");
                    sll.print();

                    System.out.print("Masukakan Nama Mahasiswa setelahnya : ");
                    String key = sc.nextLine();

                    System.out.print("Nama : ");
                    nama = sc.nextLine();
                    System.out.print("NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("IPK : ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa01 mhsAfter = new Mahasiswa01(nim, nama, kelas, ipk);
                    sll.insertAfter(key, mhsAfter);
                    System.out.println("Data Berhasil Ditambahkan Setelah " + key );
                    break;
                case 4:
                    System.out.println("-- Tambah Data Setelah Node Tertentu --");
                    sll.print();

                    System.out.print("Masukakan Index (mulai dari 0) : ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nama : ");
                    nama = sc.nextLine();
                    System.out.print("NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("IPK : ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa01 mhsAtIndex = new Mahasiswa01(nim, nama, kelas, ipk);
                    sll.insertAt(index, mhsAtIndex);
                    System.out.println("Data Berhasil Ditambahkan di Index " + index );
                    break;
                case 5:
                    System.out.println("-- Data Mahasiswa --");
                    sll.print();
                    break;
                default:
                    if (pilihan == 6) {
                        System.out.println("Terima Kasih");
                    }else {
                        System.out.println("Pilihan Tidak Valid");
                    }
                    break;
            }
        } while (pilihan != 6);
    }
}
