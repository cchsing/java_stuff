// https://www.youtube.com/watch?v=wjI1WNcIntg&t=1s
// Data Structures: Stacks and Queues
package practice_2;

public class ds_stack_1 {

    static class Stack {
        private static class Node {
            private int data;
            private Node next;

            private Node(int data) {
                this.data = data;
            }
        }

        private Node top;

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {
            return top.data;
        }

        public void push(int data) {
            Node node = new Node(data);
            node.next = top;
            top = node;
        }

        public int pop() {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public static void main(String[] args) {
        Stack stk_1 = new Stack();
        stk_1.push(10);
        stk_1.push(20);
        System.out.println(stk_1.peek());
        stk_1.pop();
        System.out.println(stk_1.peek());
    }
}
