public class MahasiswaBerprestasi01 {
    Mahasiswa01[] listMhs = new Mahasiswa01[5];
    int idx = 0;

    void tambah(Mahasiswa01 m){
            listMhs[idx] = m;
            idx++;

    }

    void tampil () {
        for (Mahasiswa01 m : listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    int sequensialSearching(double cari){
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk==cari) {
                posisi=i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : " +x+ " ditemukan pada indeks " +pos);
        }
        else {
            System.out.println("Data " +x+ " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else {
            System.out.println("Data Mahasiswa dengan IPK " +x + " tidak ditemukan");
        }
    }
}
