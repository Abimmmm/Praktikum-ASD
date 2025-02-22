public class Dosen01 {
    
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung; 

    void tampilinInformasi(){
        System.out.println("Id Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " tahun");
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    int hitungMasaKerja(int thnSkrng){
        return thnSkrng - tahunBergabung;
    }
    void ubahKeahlianBidang(String bidang){
        bidangKeahlian = bidang;
    }
    public Dosen01(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
