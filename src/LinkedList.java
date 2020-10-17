// Your list must have a constructor which will make an instance of your linked list.
// It will take in a variable of type  <E>

public class LinkedList<E> {
        Node<E> head;
        Node<E> tail;
        int capacity = 0;
        public LinkedList () {
            head = tail = null;
        }

// Your code must have TWO add functions.
// One of which will take in Node of type E and add it to the end of the LinkedList.
// The other one takes in both the Node of type E and the Position of which it is to be added into.
// This should not return anything.
        public void add(E item) {
            Node<E> node = new Node<E>(item);
            if (this.head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            this.capacity++;
        }
    // Your code must have TWO add functions.
// One of which will take in Node of type E and add it to the end of the LinkedList.
// The other one takes in both the Node of type E and the Position of which it is to be added into.
// This should not return anything.
        public void add(E item, int position) {
            Node<E> node = new Node<E>(item);
            if (this.head == null) {
                head = node;
                tail = node;
            } else {
                //checking if ur inserting at the head
                if (position == 0){
                    node.next = head;
                    head = node;
                    this.capacity++;
                    return;
                }
                Node<E> present = this.head;
                for (int count = 0; present != null && count < position-1; present = present.next) {
                    count++;
                }
                if (present.next == null){
                    present.next = node;
                    this.tail = node;
                }else{
                    node.next = present.next;
                    present.next = node;
                }
            }
            this.capacity++;
        }
        // This takes in an integer position which then returns the node at that position in the list.
        // If the position is invalid, return null.

        public E get(int position) {
            Node<E> node = head;
            if(position < 0 || position > this.capacity){
                 return null;
            }
            for(int i = 0; i < position; i++){
                node = node.next;
            }
            return node.value;
        }

        // takes in an integer position,
        // which it then both removes and returns the Node of type E at that position.


        public E remove(int position) {
            if (head == null) {
                return null;
            } else {
                if (head.value.equals(position)) {
                    if (tail == head) {
                        tail = null;
                    }
                    head=head.next;
                }
            }
            Node<E> present = head;
            // recon figures the tail, if the last node is removed.
            int count = 0;
            while (present.next != null) {
                if (count == position-1){
                    this.capacity--;
                    E value = present.next.value;
                    present.next = present.next.next;
                    return value;
                } else {
                    present = present.next;
                }
                count++;
            }
            return null;
        }

//        The function reverses the whole linkedlist from head to tail.
//        It should take in a parameter Node of type E named head.
//        And return back the new head once the function is finished.
         public E reverse(E head){
                 Node presentNode = this.head;
                 Node oldNode = null;
                 Node newNode = null;
                 while(presentNode != null){
                     newNode = presentNode;
                     presentNode = presentNode.next;
                     newNode.next = oldNode;
                     oldNode = newNode;
                     this.head = newNode;
                 }
                 return this.head.value;
             }

// string method
        private String toString(Node front) {
            String result = ""+front.value;
            if (front.next != null){
                result +="->"+ toString(front.next);
            }
            return result;
        }
        @Override
        public String toString() {
            return toString(head);
        }
        private class Node<E> {
            E value;
            Node<E> next;

            public Node(E value) {
                this.next = null;
                this.value = value;

            }
        }


//       This is just a message:
//          I explained how to run my program in the read me file.
//          I think you can figure it out yourself to.
        public static void main(String args[]) {
            LinkedList list = new LinkedList();
            for(int i = 1; i < 6; i++){
                Integer n = Integer.valueOf(i);
                list.add(n);
            }
            list.add(6);

            list.add(6,0);
             System.out.println(list.toString());
             System.out.println(list.get(5));
             System.out.println(list.remove(4));
              System.out.println(list.toString());
            System.out.println(list.reverse(5));
                System.out.println(list.toString());

        }
    }

