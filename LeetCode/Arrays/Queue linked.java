// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
    
    Node front,rear;
    int count;

    public myQueue() {
        // Initialize your data members
        front=rear=null;
        count=0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        if(rear==null && front==null)
        {
            return true;
        }
        return false;
        }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue
        Node newnode=new Node(x);
        if(isEmpty())
        {
            front=rear=newnode;
            count++;
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
            count++;
        }
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty())
        {
            return;
        }
        else
        {
            front=front.next;
            count--;
            if(count==0)
            {
                front=rear=null;
            }
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return front.data;
        }
    }

    public int size() {
        // Returns the current size of the queue.
        return count;
    }
}
