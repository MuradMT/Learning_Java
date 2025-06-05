import lombok.Getter;

public class MyLinkedList<T> {
    private static class Node<T>{
        public T obj;
        public Node prev;
        public Node next;

        public Node(T obj){
            this.obj=obj;
        }
    }
    private Node<T> head,tail;
    @Getter
    private int size=0;
    public void add(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }

    public String printList(){
        StringBuilder sb=new StringBuilder();
        sb.append("Current chain:\n");
        Node<T> current=head;
        while(current!=null){
            sb.append(current.obj.toString()).append("-");
            current=current.next;
        }
        int len=sb.length()-1;
        String val =null;
        if(sb.charAt(len)=='-'){
            val=sb.substring(0,len);
        }
        return val==null?sb.toString():val;
    }

    public void remove(T data){
        Node<T> current=head;
        while(current!=null){
            if(current.obj.equals(data)){
                if(current==head){
                    head=current.next;
                    if(head!=null) head.prev=null;
                }else if(current==tail){
                    tail=current.prev;
                    if(tail!=null) tail.next=null;
                }else{
                    current.prev.next=current.next;
                    current.next.prev=current.prev;
                }
                size--;
            }
            current=current.next;
        }
    }

    public void reverseLinkedList(){
        //1-2-3
        Node<T> current=head;
        Node<T> temp=null;
        while(current!=null){
            temp=current.next;
            current.next=current.prev;
            current.prev=temp;
            current=temp;
        }
        Node<T> tempHead = head;
        head = tail;
        tail = tempHead;
    }

}
