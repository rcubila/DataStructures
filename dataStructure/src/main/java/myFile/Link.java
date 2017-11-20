package myFile;

public class Link {

    public String value;
    public int millionsSold;
    public Link next;

    public Link(String value, int millionsSold) {
        this.value = value;
        this.millionsSold = millionsSold;
    }


    public void display() {
        System.out.println(value + " ..." + millionsSold);
    }


    public String toString() {
        return value;
    }

    public static void main(String[] args) {

        Link link = new Link("waste", 19999);

        LinkList theLinkedList = new LinkList();
        theLinkedList.insertFirstLnk("Raul", 33);
        theLinkedList.insertFirstLnk("Gaby", 2);
        theLinkedList.insertFirstLnk("Gladys", 1);
        theLinkedList.insertFirstLnk("Gerardo", 56);
        theLinkedList.insertFirstLnk("Charo", 30);


        theLinkedList.removeFirst();


    }

}
     class LinkList{

        public Link firsLink;

        LinkList() {
            firsLink = null;
        }

        public boolean isEmpty() {
            return (firsLink == null);
        }

        public void insertFirstLnk(String value, int millionsSold) {

            Link newLink = new Link(value, millionsSold);

            newLink.next = firsLink;

            firsLink = newLink;
        }

        public Link removeFirst() {
            Link linkReference = firsLink;

            if (!isEmpty()) {
                firsLink = firsLink.next;
            } else {
                System.out.println("Empty linkList");
            }
            return linkReference;
        }

        public void find() {
            Link theLink = firsLink;
            while (theLink != null) {

                theLink.display();
                System.out.println("Next Link " + theLink.next);
                theLink = theLink.next;
                System.out.println();
            }
        }

        public Link find(String index) {

            Link theLink = firsLink;

            if (!isEmpty()) {
                while (theLink.value != index) {
                    if (theLink.next == null) {
                        return null;
                    } else {
                        theLink = theLink.next;
                    }
                }
            } else {
                System.out.println("Empty LinkedList");
            }
            return theLink;
        }

        public Link removeLink(String value) {
            Link currentLink = firsLink;
            Link previousLink = firsLink;

            while (currentLink.value != value) {
                if (currentLink.next == null) {
                    return null;
                } else {
                    previousLink = currentLink;
                    currentLink = currentLink.next;
                }
            }

            if (currentLink == firsLink) {

                firsLink = firsLink.next;

            } else {
                previousLink.next = currentLink.next;
            }
            return currentLink;
        }

    }



