public class Mahasiswa01 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0) {
            return "Kinerja sangat baik";
        }else if (ipk >= 2.0) {
            return "Kinerja sangat baik";
        }else{
            return "Kinerja kurang";
        }
    }
    public Mahasiswa01(){

    }
    public Mahasiswa01(String nm, String mim, double ipk, String kls){
        nama = nm;
        this.nim= nim;
        this.ipk = ipk;
        kelas = kls;
    }
 
}

