// 비선형 자료구조 - 그래프
// 인접 행렬을 이용한 그래프 구현

class MyGraphMatrix {
    char[] vertices;
    int[][] adMat;
    int eleCnt;

    public MyGraphMatrix() {}
    public MyGraphMatrix(int size){
        this.vertices = new char[size];
        this.adMat = new int[size][size];
        this.eleCnt = 0;
    }

    public boolean isFull() {
        return this.eleCnt == this.vertices.length;
    }

    public void addVertex(char data) {
        if (isFull()) {
            System.out.println("Full");
            return;
        }
        this.vertices[this.eleCnt++] = data;
    }

    public void addEdge(int x, int y) {
        this.adMat[x][y] = 1;
        this.adMat[y][x] = 1;
    }

    public void addDirectedEdge(int x, int y) {
        this.adMat[x][y] = 1;
    }

    public void deleteEdge(int x, int y) {
        this.adMat[x][y] = 0;
        this.adMat[y][x] = 0;
    }

    public void deleteDirectedEdge(int x, int y) {
        this.adMat[x][y] = 0;
    }

    public void printAdjacentMatrix() {
        System.out.print("  ");
        for (char ele: this.vertices) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int i = 0; i < this.eleCnt; i++) {
            System.out.print(this.vertices[i] + " ");
            for (int j = 0; j <this.eleCnt ; j++) {
                System.out.print(this.adMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Test code
        MyGraphMatrix graph = new MyGraphMatrix(4);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.printAdjacentMatrix();
    }
}
