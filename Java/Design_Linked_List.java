class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node head;
    private int size;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
            if (index < 0 || index >= size) return -1;

            if (size == 1) {
                return head.val;
            }

            Node cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }
        public void addAtHead(int val) {
            if (head == null) {
                head = new Node(val);
            } else {
                Node n = new Node(val);
                n.next = head;
                head = n;
            }
            size++;
        }


        public void addAtTail(int val) {
            if (head == null) {
                head = new Node(val);
            } else {
                Node cur = head;
                for (int i = 0; i < size - 1; i++) {
                    cur = cur.next;
                }
                cur.next = new Node(val);
            }
            size++;
        }


        public void addAtIndex(int index, int val) {
            if ( index > size) {
                return;
            }

            if (index <= 0) {
                addAtHead(val);
            } else if (index == size) {
                addAtTail(val);
            } else {
                Node cur = head;
                for (int i = 0; i < index - 1; i++) {
                    cur = cur.next;
                }
                Node node = new Node(val);
                node.next= cur.next;
                cur.next = node;

                size++;
            }
        }


        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            size--;
            if (index == 0) {
                head = head.next;
                return;
            }

            Node cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }

            cur.next = cur.next.next;
        }
}
