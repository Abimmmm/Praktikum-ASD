public class SingleLinkedList01 {
    Node01 head;
    Node01 tail;
    
    boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            Node01 tmp = head;
            System.out.println("Isi Linked List:\t ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa01 input){
        Node01 ndinput = new Node01(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        }else {
            ndinput.next = head;
            head = ndinput;
        }
    }
    public void addLast(Mahasiswa01 input){ 
        Node01 ndinput = new Node01(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        }else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }
    public void insertAfter(String key, Mahasiswa01 input) {
        Node01 ndinput = new Node01(input, null);
        Node01 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                if (ndinput.next == null) {
                    tail = ndinput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa01 input){
        if (index < 0) {
            System.out.println("indeks salah");
        }else if (index == 0) {
            addFirst(input);
        }else {
            Node01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node01(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
