package s05_doubly_linked_list.sample;

import s05_doubly_linked_list.DoublyLinkedList;

public class Get {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);

        System.out.println(myDLL.get(3).value);

        /*
            EXPECTED OUTPUT:
            ----------------
            3
        */

    }
}