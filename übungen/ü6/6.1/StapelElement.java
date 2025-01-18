



    public class StapelElement {
        
        String eintrag ;
        StapelElement next_eintrag;

        // Konstruktor
        public StapelElement(String namens_value) {
            this.eintrag = namens_value;
            this.next_eintrag = null;
            }

        // Konstruktor überladen

        public StapelElement(String namens_value, StapelElement nextCard) {
            this.eintrag = namens_value;
            this.next_eintrag = nextCard;
            }



        // Getter und Setter
        
        public void setEntry(String namens_value) {
            this.eintrag = namens_value;
            }

        public void setNext(StapelElement nextCard) {
            this.next_eintrag = nextCard;
            }

        public String getEntry() {
            return this.eintrag;
            }

        public StapelElement getNext() {
            return this.next_eintrag;
            }

        public void print_card(){
            System.out.println(this.eintrag);

                }


        // Überschreiben der toString-Methode
        @Override
        public String toString() {
            return "StapelElement{eintrag='" + eintrag + '\'' +
                ", next_eintrag=" + (next_eintrag != null ? next_eintrag.eintrag : "null") +
                '}';
        }



        public static void main(String[] args) {
            
        // StapelElement neue_instanz = new StapelElement();           // konstruktor muss zufrieden gestellt werden
            StapelElement neue_instanz = new StapelElement("Horst");           // konstruktor muss zufrieden gestellt werden
            System.out.printf("%s%n",(neue_instanz));


            StapelElement neue_instanz2 = new StapelElement("Lalua",neue_instanz);           // konstruktor muss zufrieden gestellt werden


            System.out.printf("%s%n",(neue_instanz2));
            System.out.printf("%s%n",(neue_instanz2.eintrag));
            System.out.printf("%s",(neue_instanz2.next_eintrag.eintrag));



            



        }


    }