// https://www.youtube.com/watch?v=wjI1WNcIntg&t=1s
// Data Structures: Stacks and Queues
package practice_2;

public class script1 {
    static class Queue {
        public static class Node {
            public int data;
            public Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public Node head; // remove from the head
        public Node tail; // add things here
        public Node test;

        public boolean isEmpty() {
            return head == null;
        }

        public int peek() {
            return head.data;
        }

        public void add(int data) {
            Node node = new Node(data);
            if (tail != null) {
                tail.next = node;
            }
            tail = node;
            if (head == null) {
                head = node;
            }
        }

        public int remove() {
            int data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }
    }

    public static void main(String[] args) {
        Queue queue_1 = new Queue();
        Queue.Node node2 = new Queue.Node(2);
        Queue.Node node3 = new Queue.Node(3);
        Queue queue_2 = new Queue();
        for (int i = 1; i < 21; i++) {
            queue_1.add(i);
        }
        // System.out.println(queue_1.head.next.next.data);
        System.out.println("test " + queue_2.head);
        // queue_2.tail = node2;
        // queue_2.head = node2;
        queue_2.add(2);
        System.out.println("Tail Data:" + queue_2.tail.data);
        System.out.println("Tail Next:" + queue_2.tail.next);
        System.out.println("head Data:" + queue_2.head.data);
        System.out.println("head Next:" + queue_2.head.next);
        // queue_2.add(20);
        queue_2.tail.next = node2;
        // queue_2.head.next = node2;
        // queue_2.tail = node3;
        System.out.println("Tail: " + queue_2.tail);
        System.out.println("Head: " + queue_2.head);
        System.out.println("Tail Data:" + queue_2.tail.data);
        System.out.println("Tail Next:" + queue_2.tail.next);
        System.out.println("head Data:" + queue_2.head.data);
        System.out.println("head Next:" + queue_2.head.next);

        queue_2.head.next = node3;
        System.out.println("Tail: " + queue_2.tail);
        System.out.println("Head: " + queue_2.head);
        System.out.println("Tail Data:" + queue_2.tail.data);
        System.out.println("Tail Next:" + queue_2.tail.next);
        System.out.println("head Data:" + queue_2.head.data);
        System.out.println("head Next:" + queue_2.head.next.next);
    }
}