public class Mahasiswa01 {

    String nim,nama,kelas;
    double ipk;

    public Mahasiswa01(){

    }
    public Mahasiswa01(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama =name;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}