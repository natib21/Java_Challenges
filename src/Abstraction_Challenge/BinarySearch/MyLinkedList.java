package Abstraction_Challenge.BinarySearch;

public class MyLinkedList implements  NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem current = this.root;
        while(current != null){
            int comparison = current.compareTo(item);
            if(comparison == 0){
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }else if(comparison < 0){
                if (current.next() != null) {
                    current = current.next();
                }else {
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }
            }else {
                if (current.previous() != null) {
                    current.previous().setNext(item);
                    item.setPrevious(current.previous());
                    item.setNext(current);
                    current.setPrevious(item);
                }else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
