public class SLLMain01 {
    public static void main(String[] args) {
        SingleLinkedList01 sll = new SingleLinkedList01();

        Mahasiswa01 mhs1 = new Mahasiswa01("24212200","Alvaro", "1A", 4.0);
        Mahasiswa01 mhs2 = new Mahasiswa01("23212201","Bimon", "2B", 3.8);
        Mahasiswa01 mhs3 = new Mahasiswa01("22212202","Cintia", "3C", 3.5);
        Mahasiswa01 mhs4 = new Mahasiswa01("21212203","Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        
    }
}
