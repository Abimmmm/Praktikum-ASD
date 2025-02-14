import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas : ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = sc.nextDouble();

        System.out.println("======================");
        System.out.println("======================");

        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100) {
            nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            if (nilaiAkhir > 80 ) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            }else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            }else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            }else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            }else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            }else  if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            }else {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("SELAMAT ANDA " + keterangan);
        }else{
            System.out.println("Nilai Tidak Valid");
        }

        


    }
}