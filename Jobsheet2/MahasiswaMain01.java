public class MahasiswaMain01 {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01();
        mhs1.nama = "Muhammad ALi Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi(); 
        System.out.println();

        mhs1.ubahKelas("SI2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        System.out.println();
        Mahasiswa01 mhs2 = new Mahasiswa01("Annisa Nabila", "2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
