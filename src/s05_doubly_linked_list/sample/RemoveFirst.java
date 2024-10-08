package s05_doubly_linked_list.sample;

import s05_doubly_linked_list.DoublyLinkedList;

public class RemoveFirst {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeFirst());

        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null
        */
    }
}
