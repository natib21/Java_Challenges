package Abstraction_Challenge.BinarySearch;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }
    @Override
    public int compareTo(ListItem item){
        if(item != null){
            return ((Comparable<Object>)
                    this.value).compareTo(item
                    .getValue());
        }else{
            return -1;
        }
    }
}
