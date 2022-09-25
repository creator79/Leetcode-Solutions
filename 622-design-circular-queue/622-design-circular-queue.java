class MyCircularQueue {
    int[] q;
    int size;
    int front;
    int rear;
    int used;

    public MyCircularQueue(int k) {
        q = new int[k];
        size = k;
        front = q[0];
        rear = q[q.length - 1];
        used = 0;
    }

    public boolean enQueue(int value) {
        if (used == size) return false;
        if (used == 0) {
            front = 0;
            rear = 0;
            q[rear] = value;
            used++;
            return true;
        }
        if (rear == q.length - 1) {
            rear = 0;
        } else {
            rear += 1;
        }
        q[rear] = value;
        used++;
        return true;
    }

    public boolean deQueue() {
        if (used == 0) return false;
        q[front] = 0;
        used--;
        if (front == q.length - 1) {
            front = 0;
        } else {
            front += 1;
        }
        return true;
    }

    public int Front() {
        if (used == 0) return -1;
        return q[front];
    }

    public int Rear() {
        if (used == 0) return -1;
        return q[rear];
    }

    public boolean isEmpty() {
        return used == 0;
    }

    public boolean isFull() {
        return used == size;
    }
}
