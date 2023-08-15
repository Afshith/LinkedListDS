public class Main {
    public static void main(String[] args) {

        SLL ll = new SLL();
        ll.insertFirst(3);
        ll.insertFirst(5);
        ll.insertFirst(7);
        ll.insertFirst(9);
        ll.display();
        ll.insertLast(19);
        ll.display();
        ll.insert(4,3);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.delete(1));
        ll.display();


    }
}