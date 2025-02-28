import java.util.Scanner;
public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml;
        System.out.print("Masukkan jumlah Matakuliah : ");
        jml = sc.nextInt();
        Matakuliah01[] arrayMatakuliah01 = new Matakuliah01[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data untuk Matakuliah ke-" + (i+1));
            arrayMatakuliah01[i] = new Matakuliah01();
            arrayMatakuliah01[i].tambahData();
        }

        for (Matakuliah01 matakuliah01 : arrayMatakuliah01) {
            matakuliah01.cetakInfo();
        }


    }
}
