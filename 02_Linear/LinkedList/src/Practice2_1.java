// Practice1
// 단방향 연결 리스트에서 중복 데이터를 찾아 삭제하세요.

// 입출력 예시)
// 입력 연결 리스트: 1, 3, 3, 1, 4, 2, 4, 2
// 결과 연결 리스트: 1, 3, 4, 2


class Node2 {
    int data;
    Node2 next;

    Node2() {}
    Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList3
 {
    Node2 head;

    LinkedList3
() {}
    LinkedList3
(Node2 node2) {
        this.head = node2;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addData(int data) {
        if (this.head == null) {
            this.head = new Node2(data, null);
        } else {
            Node2 cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node2(data, null);
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node2 cur = this.head;
        Node2 pre = cur;
        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head) {
                    this.head = cur.next;
                } else {
                    pre.next = cur.next;
                }
                break;
            }

            pre = cur;
            cur = cur.next;
        }
    }

    public boolean findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        }

        Node2 cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node2 cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}


public class Practice2_1 {
    public static LinkedList3 removeDup(LinkedList3 listBefore) {
        LinkedList3 after = new LinkedList3();
        Node2 cur = listBefore.head;

        while (cur != null) {
            if (after.findData(cur.data) == false) {
                after.addData(cur.data);
            }
            cur = cur.next;
        }
        return after;
    }

    public static void main(String[] args) {
        // Test code
        LinkedList3 linkedList3 = new LinkedList3();
        linkedList3.addData(1);
        linkedList3.addData(3);
        linkedList3.addData(3);
        linkedList3.addData(1);
        linkedList3.addData(4);
        linkedList3.addData(2);
        linkedList3.addData(4);
        linkedList3.addData(2);
        linkedList3.showData();  // 1 3 3 1 4 2 4 2

        linkedList3 = removeDup(linkedList3);
        linkedList3.showData();  // 1 3 4 2

    }
}
