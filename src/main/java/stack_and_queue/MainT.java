package stack_and_queue;

public class MainT {
    public static void main(String[] args) {
//        Queue<Integer> stack = new MyStack<>(8);
//        System.out.println(stack.push(1));
//        System.out.println(stack.push(2));
//        System.out.println(stack.push(3));
//        System.out.println(stack.push(4));
//        System.out.println(stack.push(5));
//        System.out.println(stack.push(6));
//        System.out.println(stack.push(7));
//        System.out.println(stack.push(8));
//        System.out.println(stack.push(9));
//        stack.printAll();
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.push(9));
//        stack.printAll();
//        Queue<Integer> stack2 = new MyStack<>(8);
//        System.out.println(stack2.push(1));
//        System.out.println(stack2.push(2));
//        System.out.println(stack2.push(3));
//        System.out.println(stack2.push(4));
//        System.out.println(stack2.push(5));
//        System.out.println(stack2.push(6));
//        System.out.println(stack2.push(7));
//        System.out.println(stack2.push(8));
//        System.out.println(stack2.push(9));
//        stack2.printAll();
//        System.out.println(stack2.peek());
//        System.out.println(stack2.pop());
//        stack2.printAll();
//        System.out.println(stack2.push(9));
//        stack2.printAll();

        Queue<Integer> queues = new MyQueue<>(8);

        System.out.println(queues.push(1));
        System.out.println(queues.push(2));
        System.out.println(queues.push(3));
        System.out.println(queues.push(4));
        System.out.println(queues.push(5));
        System.out.println(queues.push(6));
        System.out.println(queues.push(7));
        System.out.println(queues.push(8));

        System.out.println(queues.pop());
        queues.printAll();
        System.out.println(queues.push(1));
        queues.printAll();
    }
}
