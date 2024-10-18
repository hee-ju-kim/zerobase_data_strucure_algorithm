// 단순 연결 리스트 구현 완성

class LinkedList2 extends LinkedList {
    public LinkedList2(Node node) {
        super(node);
    }

    // 연결리스트에 데이터 추가
    // before_data가 null인 경우, 가장 뒤에 추가
    // before_data에 값이 있는 경우, 해당 값을 가진 노드 앞에 추가

    public void addData(int data, Integer beforeData) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else if (beforeData == null) {
            Node cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        } else {
            Node cur = this.head;
            Node pre = cur;
            while (cur != null) {
                if (cur.data == beforeData) {
                    if (cur == this.head) {
                        this.head = new Node(data, this.head);
                    } else {
                        pre.next = new Node(data, cur);
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;
        while(cur != null) {
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
}

public class Practice1_1 {
    public static void main(String[] arg) {

        LinkedList2 li2 = new LinkedList2(new Node(1, null));
        li2.showData();

        li2.addData(2);
        li2.addData(3);
        li2.addData(4);
        li2.addData(5);
        li2.showData();

        li2.addData(100, 1);
        li2.addData(200, 2);
        li2.addData(300, 3);
        li2.addData(400, 4);
        li2.addData(500, 5);
        li2.showData();

        li2.removeData(300);
        li2.removeData(100);
        li2.removeData(500);
        li2.removeData(200);
        li2.removeData(400);
        li2.showData();

        li2.removeData(3);
        li2.removeData(1);
        li2.removeData(5);
        li2.removeData(2);
        li2.removeData(4);
        li2.showData();
    }
}
