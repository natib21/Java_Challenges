package Abstraction_Challenge.BinarySearch;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Testing MyLinkedList:");
//        MyLinkedList list = new MyLinkedList(null);
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            list.addItem(new Node(s));
//        }
//        list.traverse(list.getRoot());
//
//        System.out.println("\nRemoving items from MyLinkedList:");
//        list.removeItem(new Node("Melbourne"));
//        list.removeItem(new Node("Adelaide"));
//        list.removeItem(new Node("Brisbane"));
//        list.removeItem(new Node("Sydney"));
//        list.traverse(list.getRoot());
        // Testing SearchTree
        System.out.println("\nTesting SearchTree:");
        SearchTree tree = new SearchTree(null);
        String treeData = "5 7 3 9 8 2 1 4 6 0";
        String[] treeItems = treeData.split(" ");
        for (String s : treeItems) {
            tree.addItem(new Node(Integer.parseInt(s)));
        }
        tree.traverse(tree.getRoot());


    }
}
