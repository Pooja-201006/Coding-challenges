/*
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    Node y;
    int size;

    public myStack() {
        // Initialize your data members
           y=null;
           size=0;
        
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(y==null)
        {
            return true;
        }
       return false;
        
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
      Node newnode=new Node(x);
      if(isEmpty())
      {
          y=newnode;
          size++;
      }
      else{
          newnode.next=y;
          y=newnode;
          size++;
      }
    }

    public void pop() {
        // Removes the front element of the stack.
        if(isEmpty())
        {
            return;
        }
        else
        {
            y=y.next;
            size--;
            if(size==0)
            {
                y=null;
            }
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return y.data;
        }
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
    
}
