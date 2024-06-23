class QNode {
    int Data;
    QNode Next;

    public QNode(int data) {
        Data = data;
        Next = null;
    }
}

public class LinkedListQueue {
    QNode front, rear;

    public LinkedListQueue() {
        front = rear = null;
    }

    public boolean EnQueue (int data) {
        boolean ans = false;

        QNode node = new QNode(data);

        if (node != null) {

            if (rear == null) { // Queue is empty
                rear = front = node;
            }

            else { // queue has elements
                rear.Next = node;
                rear = node;
            }
            ans = true;
        }

        return ans;
    }

    public QNode DeQueue () {
        QNode ans = front;

        if (front != null) { // There is a queue
            front = front.Next;

            if (front == null) {
                rear = null;
            }
        }
        return ans;
    }

}
