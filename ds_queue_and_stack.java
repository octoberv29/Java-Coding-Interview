import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ds_queue_and_stack {
  /*
    We may access a random element by index in Array. 
    However, we might want to restrict the processing order in some cases.

    First-in-First-out (FIFO) | Queue
    Last-in-First-out  (LIFO) | Stack
  */

  public static void queue() {
    /*
      Queue:

      In a FIFO data structure, the first element added to the queue will be processed first.
      The insert operation is called enqueue and the new element is always added at the end of the queue. 
      The delete operation is called dequeue. You are only allowed to remove the first element.
    */

    Queue<Integer> q = new LinkedList();  // initialise

    q.isEmpty();                          // check if empty
    q.peek();                             // get the first element
    q.offer(5);                           // push a new element
    q.poll();                             // pop an element
    q.size();                             // size of the queue
  }

  public static void stack() {
    /*
      Stack:
      
      In a LIFO data structure, the newest element added to the queue will be processed first.
      The insert operation is called push in a stack. 
      Similar to the queue, a new element is always added at the end of the stack.
      However, the delete operation, pop, will always remove the last element, in comparison to the queue.p
    */
    Stack<Integer> s = new Stack<>();     // initialise

    s.push(5);                            // push a new element
    s.empty();                            // check if stack is empty
    s.pop();                              // pop an element
    s.peek();                             // get the top element of the stack
    s.size();                             // size of the stack
  }

  public static void BFS() {
    // using queue
  }

  public static void DFS() {
    // using stack
  }

}