public class ScoreNote {
    class Node{
        String item;
        Node next;
        Node previous;

        public Node(String item) {
            this.item = item;
        }
        public String val(Node a){
            return a.item;
        }
        @Override
        public String toString() {
            return item;
        }
    }
    Node head, tail = null;
    public void addNode(String item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = tail = newNode;
            head.previous = tail;
            head.next=tail;
        }
        else if ((head.equals(head.previous))&&(head.equals(head.next))){
            tail.next = newNode;
            newNode.previous = tail;
            tail.previous=newNode;
            tail = newNode;
            tail.next = tail.previous;
        }else {
            head.previous=newNode;
            tail.next = newNode;
            newNode.next=head;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    public String get(int index){
        int currentIndex=0;
        if(index>0){
            Node prev = head;
            Node current = head.next;
            while(index!=currentIndex){
                currentIndex++;
                prev = current;
                current = current.next;
            }
            return prev.item;
        } else if(index<0){
            Node next = head;
            Node current = head.previous;
            while(index!=currentIndex){
                currentIndex--;
                next = current;
                current = current.previous;
            }
            //System.out.println(next.previous.item + " " +next.next.item);
            return next.item;
        }else{
            return head.item;
        }
    }
    public int getNote(String val, int i){
        int index=0;
        Node next = head;
        while (true){
            if(next.item.equals(val)){
                break;
            }
            index++;
            next=next.next;
        }
        System.out.println();
        System.out.println(get(index));
        System.out.println(get(index+i));
        return index;
    }
    public String getNodeNext(){
        Node next = head;
        return next.item;
    }
}
