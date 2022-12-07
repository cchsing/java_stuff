package practice_2;

public class script3 {
    static class Test_DataModel {
        public static class DataNode {
            public int value;
            public DataNode next;

            public DataNode(int value) {
                this.value = value;
            }
        }

        // Reference variables - No object is created
        public DataNode head;
        public DataNode tail;
    }

    public static void main(String[] args) {
        Test_DataModel dm_1 = new Test_DataModel();
        Test_DataModel.DataNode Node1 = new Test_DataModel.DataNode(1);
        Test_DataModel.DataNode Node2 = new Test_DataModel.DataNode(2);
        Test_DataModel.DataNode Node3 = new Test_DataModel.DataNode(3);

        dm_1.head = dm_1.tail = Node1;
        System.out.println("### dm_1.head = dm_1.tail = Node1;");
        System.out.println("Head : - " + dm_1.head);
        System.out.println("Head Value: - " + dm_1.head.value);
        System.out.println("Head Next: - " + dm_1.head.next);
        System.out.println("-------------------------------------------------");
        System.out.println("Tail: - " + dm_1.tail);
        System.out.println("Tail Value: - " + dm_1.tail.value);
        System.out.println("Tail Next: - " + dm_1.tail.next);
        System.out.println("-------------------------------------------------");

        dm_1.tail.next = Node2;
        System.out.println("### dm_1.tail.next = Node2;");
        System.out.println("Head : - " + dm_1.head);
        System.out.println("Head Value: - " + dm_1.head.value);
        System.out.println("Head Next: - " + dm_1.head.next);
        System.out.println("-------------------------------------------------");
        System.out.println("Tail: - " + dm_1.tail);
        System.out.println("Tail Value: - " + dm_1.tail.value);
        System.out.println("Tail Next: - " + dm_1.tail.next);
        System.out.println("-------------------------------------------------");
        dm_1.tail = Node2;
        System.out.println("### dm_1.tail = Node2;");
        System.out.println("Head : - " + dm_1.head);
        System.out.println("Head Value: - " + dm_1.head.value);
        System.out.println("Head Next: - " + dm_1.head.next);
        System.out.println("---------------------------------");
        System.out.println("Tail: - " + dm_1.tail);
        System.out.println("Tail Value: - " + dm_1.tail.value);
        System.out.println("Tail Next: - " + dm_1.tail.next);
        System.out.println("-------------------------------------------------");

        dm_1.tail.next = Node3;
        System.out.println("### dm_1.tail.next = Node3;");
        System.out.println("Head : - " + dm_1.head);
        System.out.println("Head Value: - " + dm_1.head.value);
        System.out.println("Head Next: - " + dm_1.head.next);
        System.out.println("-------------------------------------------------");
        System.out.println("Tail: - " + dm_1.tail);
        System.out.println("Tail Value: - " + dm_1.tail.value);
        System.out.println("Tail Next: - " + dm_1.tail.next);
        System.out.println("-------------------------------------------------");
        dm_1.tail = Node3;
        System.out.println("### dm_1.tail = Node3;");
        System.out.println("Head : - " + dm_1.head);
        System.out.println("Head Value: - " + dm_1.head.value);
        System.out.println("Head Next: - " + dm_1.head.next);
        System.out.println("---------------------------------");
        System.out.println("Tail: - " + dm_1.tail);
        System.out.println("Tail Value: - " + dm_1.tail.value);
        System.out.println("Tail Next: - " + dm_1.tail.next);
        System.out.println("-------------------------------------------------");
    }
}
