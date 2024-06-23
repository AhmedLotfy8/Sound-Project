public class LinerQueue {

    int[] Queue;
    int size, rear;

    public LinerQueue() {
        rear = 0;
        size = 10;
        Queue = new int[size];
    }

    public LinerQueue(int Size) {
        size = Size;
        rear = 0;
        Queue = new int[size];
    }

    public boolean EnQueue (int data) {
        boolean ans = false;

        if (rear < size) {
            Queue[rear] = data;
            rear++;
            ans = true;
        }

        return ans;
    }

    public int DeQueue () {
        int ans = -1;

        if (rear > 0) {
            ans = Queue[0];

            for (int i=0; i<rear-1; i++) {
                Queue[i] = Queue[i+1];

            }
            rear--;
        }
        return ans;
    }

}
