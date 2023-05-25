public class Test3 {

    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 7, 6, 7, 8, 9, 0, 9};
//        System.out.println(findDuplicate(array));

        Node [] nodeArray = new Node[11];
        for (int i = 0; i < 11; i++) {
            nodeArray[i] = new Node();
            nodeArray[i].value = array[i];
        }

        for (int i = 0; i < 10; i++) {
            nodeArray[i].next = nodeArray[i + 1];
        }


        Node newHead = reverse(nodeArray[0], null);


        while (newHead != null) {
            System.out.print(newHead.value);
            newHead = newHead.next;
        }

    }

    /*

    int 11 elm
    0 <= 9

     */
    public static int findDuplicate(int[] array) {
        boolean [] existArray = new boolean[10];
        for (int i: array) {
            if (existArray[i]) return i;
            existArray[i] = true;
        }
        return -1;
    }

    /*
    int
    next*

     */
    public static Node reverse(Node head, Node prev) {
        Node newHead = null;

        if(head.next == null) {
            newHead = head;
            newHead.next = prev;
        } else {
            newHead = reverse(head.next, head);
            head.next = prev;
        }

        return newHead;

    }
}

class Node {
    int value;
    Node next;
}
