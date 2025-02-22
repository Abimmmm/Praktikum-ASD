public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 dsn1 = new Dosen01("003", "Harisun Laily", true, 2012, "Teknik Informatika");
        dsn1.tampilinInformasi();
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlianBidang("Sistem Informasi");
        dsn1.tampilinInformasi();
    }
}
