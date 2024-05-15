package Quiz2najwa;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        dll.deleteLast();
        dll.print();
        split(dll);
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        //complete this method
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
        if (dll.isEmpty() || dll.head.n == null) {
            System.out.println("List hanya memiliki kosong atau hanya satu elemen.");
            return;
        }
        
        Node slow = dll.head;
        Node fast = dll.head;
        while (fast != null && fast.n != null && fast.n.n != null) {
            slow = slow.n;
            fast = fast.n.n;
        }
    
        DoubleLinkedList list1 = new DoubleLinkedList();
        DoubleLinkedList list2 = new DoubleLinkedList();
    
        list1.head = dll.head;
        list1.tail = slow;
        list1.size = dll.size / 2;
        list2.head = slow.n;
        list2.tail = dll.tail;
        list2.size = dll.size - list1.size;
    
        slow.n.p = null; 
        slow.n = null;
    
        System.out.print("List 1 -> ");
        list1.print();
        System.out.print("List 2 -> ");
        list2.print();
    }
}
