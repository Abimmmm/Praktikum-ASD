import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai[][] = new double[8][2];
        String matkul[] = new String[8];
        String[] nilaiHuruf = new String[8];
        double ip, totalBobotNilai = 0;

        for(int i = 0; i < matkul.length; i++){

            System.out.print("Masukkan nama Mata kuliah ke-" + (i+1) + ": ");
            matkul[i] = sc.nextLine();
        }

        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukan nilai Angka untuk MK " + matkul[i] + ": ");
            nilai[i][0] = sc.nextDouble();
            if (nilai[i][0] > 80 ) {
                nilaiHuruf[i] = "A";
                nilai[i][1] = 4.00;
            }else if (nilai[i][0] > 73) {
                nilaiHuruf[i] = "B+";
                nilai[i][1] = 3.50;
            }else if (nilai[i][0] > 65) {
                nilaiHuruf[i] = "B";
                nilai[i][1] = 3.00;
            }else if (nilai[i][0] > 60) {
                nilaiHuruf[i] = "C+";
                nilai[i][1] = 2.50;
            }else if (nilai[i][0] > 50) {
                nilaiHuruf[i] = "C";
                nilai[i][1] = 2.00;
            }else  if (nilai[i][0] > 39) {
                nilaiHuruf[i] = "D";
                nilai[i][1] = 1.00;
            }else {
                nilaiHuruf[i] = "E";
                nilai[i][1] = 0.00;
            }
        }
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK | Nilai Angka | Nilai Huruf | Bobot Nilai");

        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + " | " + nilai[i][0] + " | " + nilaiHuruf[i] + " | " + nilai[i][1] + " | ");
            totalBobotNilai += nilai[i][1];
        }

        ip = totalBobotNilai / matkul.length;
        System.out.println("======================");
        System.out.println("IP : " + ip);
    }
}
