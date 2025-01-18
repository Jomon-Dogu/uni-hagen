


public class ListNode {

    public int entry;
    private ListNode next;


    public ListNode(int value) {
        this(value, null);
        }

    public ListNode(int value, ListNode nextNode) {
        this.entry = value;
        this.next = nextNode;
        }

    public void setEntry(int value) {
        this.entry = value;
        }

    public void setNext(ListNode nextNode) {
        this.next = nextNode;
        }

    public int getEntry() {
        return this.entry;
        }

    public ListNode getNext() {
        return this.next;
        }

    public void print_node(){
        System.out.println(this.entry);

            }


    @Override
    public String toString() {
        return "ListNode{" +
                "entry=" + entry +
                ", next=" + (next != null ? next.entry : "null") +
                '}';
    }
    

    public static void main(String[] args) {
        ListNode instanz = new ListNode(33);
        instanz.print_node();
        System.out.println(instanz.getNext());


        ListNode instanz2 = new ListNode(11,instanz);
        instanz2.print_node();
        System.out.print(instanz2.getNext());



        }
}


