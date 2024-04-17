package az.edu.turing.module01.lesson28;

public class MyLinkedListApp {

    public static void main(String[] args) {
        final Node<Integer> head=new Node<>(10);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(head);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());

        var second =new Node<>(11);
        myLinkedList.addTail(second);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());

        myLinkedList.addTail(new Node<>(13));
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());

        myLinkedList.addHead(new Node<>(9));
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());

        myLinkedList.update(2,new Node<>(12));
        System.out.println(myLinkedList);

        myLinkedList.delete(2);
        System.out.println(myLinkedList);

        myLinkedList.deleteObject(13);
        System.out.println(myLinkedList);


    }
}
