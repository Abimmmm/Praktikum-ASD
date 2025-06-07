public class DoublelinkedLists01 {
    Node01 head;
    Node01 tail;

    public DoublelinkedLists01(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa01 data){
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa01 data){
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return; 
        }
        Node01 newNode = new Node01(data);

        //jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }else {
            //sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print(){
        Node01 current = head;
        if (isEmpty()) {
            System.out.println("Warning! List masih kosong.");
        }
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        }else {
            tail = tail.next;
            tail.prev = null;
        }
    }
     public void addAt(int index, Mahasiswa01 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node01 newNode = new Node01(data);
            Node01 current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah elemen, menambahkan di akhir.");
                addLast(data);
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode; 
                }
                current.next = newNode;
            }
        }
    }

    public void removeAfter(String keyNim) {
        Node01 current = head;
        if (isEmpty()) {
        System.out.println("List kosong. Tidak ada yang bisa dihapus.");
        return;
        }
        

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current.next != null) {
            Node01 removeAfter = current.next;
            current.next = removeAfter.next;
            if (removeAfter.next != null) {
                removeAfter.next.prev = current;
            } else {
                tail = current; 
            }
            System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
        } else {
            System.out.println("Tidak ada node setelah NIM " + keyNim + ".");
        }

    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node01 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah data yang ada, tidak ada yang dihapus.");
                return;
            }
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang ditampilkan.");
        } else {
            tail.data.tampil();
        }
    }
    
    public int getIdx(String nim) {
        Node01 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.nama.equals(nim)) {
                return index; 
            }
            current = current.next;
            index++;
        }
        return -1; 
    }

    public int getTotalSize() {
        Node01 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
