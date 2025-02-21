public class MataKuliahMain01 {
    public static void main(String[] args) {
        MataKuliah01 mk1 = new MataKuliah01();
        mk1.kodeMK = "34W";
        mk1.nama = "Pancasila";
        mk1.jumlahJam = 3;
        mk1.sks = 2;

        System.out.println();
        mk1.tampilinInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(3);
        mk1.kurangiJumlah(10);
        mk1.tampilinInformasi();
    }
}
