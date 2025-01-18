

public class LinkedList {
    
    
    private ListNode head;          // head == [47 | null]   nach dem ersten eintrag; ist eine Variable aus ListNode


    public LinkedList() { 
        this.head = null;             // jedes mal wenn ich LinkedList aufrufe, wird erst mal this.head Varable erstellt und null gesetzt
        }

    /**
    public void add(int value) {
        ListNode newNode = new ListNode(value, this.head);      //  HIER WIRD DAS gemacht was ich bei main gemacht habe von ListNode.java
                                                                //  ListNode instanz2 = new ListNode(11,instanz);
                                                                //  instanz2.print_node();
                                                                //  System.out.print(instanz2.getNext());


        this.head = newNode;                                    // !!!!!!!!!!!!!!!!!!!!!!!!The head of the list is updated to point to the new node!!!!!!!
        }
    */
    /**
    public int size() {
        ListNode current = this.head;
        int count = 0;
        while (current != null) {                   // Also wenn es sich um den ersen Eintrag handelt, wird die While Schleife nicht ausgeführt.
            count++;
            current = current.getNext();            // Ruft nächsten Knoten auf      
            }

        return count;
        }

    */


    /**
    // 34.2-4
    public int sum(){
        ListNode current = this.head;
        int sum = 0;
        while (current != null) {
            sum += current.getEntry();              // über getter abrufen nicht direkte variable!!!!!!
            current = current.getNext();
            }
            return sum;
    }
    */

    // 34.2-5:
    public int sum(){
        return sum(this.head);
    }

    private int sum(ListNode node){
        if (node == null) {
            return 0;
        }
        return node.getEntry() + sum(node.getNext());
    }

    

    // size in rekursiv
    public int size() {
        return size(this.head);
    }
    private int size(ListNode node) {       // 1
        if (node == null) {                 // 2
        return 0;                           // 3
        }                                   // 4
    return size(node.getNext()) + 1;        // 5
    }


    /**
     * Iterative Version
     
    public boolean contains(int value) {
        ListNode current = this.head;
        while (current != null) {
        if (current.getEntry() == value) {
        return true;
        }
        current = current.getNext();
        }
        return false;
        }*/

    public void printList() {
        printList(this.head);
        }
    private void printList(ListNode node) {
        if (node == null) {
        return;
        }
        node.print_node();
        System.out.print(" ");
        printList(node.getNext());
    }



    /**
    // Selbsttest 34.2-2
    public int size() {
        int count = 0;
        for (ListNode current = this.head; current!=null; current.getNext()) {
            count++;
        }
        return count;
        
    }
    */

    public void remove(int value) {
        this.head = remove(this.head, value);
        }
    private ListNode remove(ListNode node, int value) {             // 1
        if (node == null) {                                         // 2
            return null;                                            // 3
        }                                                           // 4
        
        if (node.getEntry() == value) {                             // 5
            return node.getNext();                                  // 6
        }                                                           // 7
        
        node.setNext(remove(node.getNext(), value));                // 8
            return node;                                            // 9
        }


    public boolean contains(int value) {
        return contains(this.head, value);
    }

    private boolean contains(ListNode node, int value){
        if (node == null){
            return false;
        }
        if (node.getEntry() == value){
            return true;
        }
        return contains(node.getNext(), value);


    }

    public void add(int index, int value){
        if ( index < 0 || index > size()){
            throw new IndexOutOfBoundsException("index muss im Bereich von 0 bis " + size() + " liegen");
        }
        this.head = add(this.head, index, value);
    }

    private ListNode add(ListNode node, int steps, int value){
        if ( steps == 0){
            return new ListNode(value, node);
        }
        node.setNext((add(node.getNext(), steps - 1, value)));      // SET NEXT !!!!!
        return node;
    }


    public static void main(String[] args) {
        LinkedList instanz = new LinkedList();                   // erzeugt eine neue Instanz aus ListNode head=null SONST NICHTS
        instanz.add(0,47);                                         // auf instanz wird add funtion aus LinkedList angewendet wo ich values angebe
                                                                // damit die Klasse ListNode ( also die erstellung von einem Node) einen festen
                                                                // wert für Ihren werteeintrag bzw für Variable "entry" einen festen Wert bekommt.
                                                                // Die Klassenvariable "next" bekommt als Wert den "this.head" aus dieser Klasse hier.
                                                                // Also als ersten eintrag wo this.head = null ist wäre der Verweis auf null ?
                                                                // Also start der Liste ?

        instanz.printList();
        System.out.printf("instanz von LinkedList ist instanz.head =, %s %n", instanz.head);
        System.out.println("#########################################");
        instanz.add(0,11);   
        instanz.printList();
        System.out.println(instanz.head);

    }   
}



// Also wenn ich eine Instanz von LinkedList() Klasse erstelle, wird this.head auf null gesetzt
// Zugleich wird über das KlassenAttribut head ein neuer Node erstellt mit nextNode = 0 und value auch null.


// über add() wird dann ein neuer Node erzegt, welcher den wert hat den ich als parameter eingebe und 