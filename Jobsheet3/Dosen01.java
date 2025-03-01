import java.util.Scanner;
public class Dosen01 {
    Scanner sc = new Scanner(System.in);
    public String kode, nama, dummy;
    public Boolean jenisKelamin;
    int usia;

    public Dosen01(){

    }

    public void tambahData(){
        System.out.print("Kode          : ");
        kode = sc.nextLine();
        System.out.print("Nama          : ");
        nama = sc.nextLine();
        while (true) {
            System.out.print("Jenis Kelamin(Pria/Wanita) : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            if (dummy.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
                break;
            }else if (dummy.equalsIgnoreCase("Wanita")) {
                jenisKelamin = false;
                break;
            }else{
                System.out.println("Jenis Kelamin tidak valid!!");
                jenisKelamin =false;
            }
        }
        System.out.print("Usia          : ");
        dummy = sc.nextLine();
        usia = Integer.parseInt(dummy);
        System.out.println("------------------------------" );

    }

    public void dataSemuaDosen(){
        System.out.println("=== Data Semua Dosen ===");
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        if (jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Pria" );
        }else{
            System.out.println("Jenis Kelamin : Wanita" );
        }
        System.out.println("Usia          : " + usia);
        System.out.println("------------------------------" );
    }
    public static void jumlahDosenPerJenisKelamin(Dosen01[] arrayDosen){
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen01 dosen01 : arrayDosen) {
            if (dosen01.jenisKelamin) {
                jumlahPria++;
            }else{
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayDosen){
        int totalPria = 0, jumlahPria = 0;
        int totalWanita = 0, jumlahWanita = 0;
    
        for (Dosen01 dosen : arrayDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else { 
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }
    
        if (jumlahPria > 0) {
            double rataRataPria = (double) totalPria / jumlahPria;
            System.out.println("Rata-rata Usia Dosen Pria   : " + rataRataPria);
        } else {
            System.out.println("Tidak ada Dosen Pria.");
        }
    
        if (jumlahWanita > 0) {
            double rataRataWanita = (double) totalWanita / jumlahWanita;
            System.out.println("Rata-rata Usia Dosen Wanita : " + rataRataWanita);
        } else {
            System.out.println("Tidak ada Dosen Wanita.");
        }
    }
    public static void infoDosenPalingTua(Dosen01[] arrayDosen){
        Dosen01 dosenPalingTua = arrayDosen[0];

        for (Dosen01 dosen01 : arrayDosen) {
            if (dosen01.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen01;
            }
        }
        System.out.println("Kode          : " + dosenPalingTua.kode);
        System.out.println("Nama          : " + dosenPalingTua.nama);
        if (dosenPalingTua.jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Pria" );
        }else{
            System.out.println("Jenis Kelamin : Wanita" );
        }
        System.out.println("Usia          : " + dosenPalingTua.usia);
    }
    public static void infoDosenPalingMuda(Dosen01[] arrayDosen){
        Dosen01 dosenPalingMuda = arrayDosen[0];

        for (Dosen01 dosen01 : arrayDosen) {
            if (dosen01.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen01;
            }
        }
        System.out.println("Kode          : " + dosenPalingMuda.kode);
        System.out.println("Nama          : " + dosenPalingMuda.nama);
        if (dosenPalingMuda.jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Pria" );
        }else{
            System.out.println("Jenis Kelamin : Wanita" );
        }
        System.out.println("Usia          : " + dosenPalingMuda.usia);
    }

}
