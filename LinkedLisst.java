import java.util.LinkedList;

public class LinkedLisst {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        LinkedList<String> objp = new LinkedList<String>();
        objp.add("ok");
        objp.add("addidas");
        // objp.clear();
        objp.add(0, "pddd");
        objp.addFirst("ashish");
        objp.addLast("arya");
        objp.removeLast();

        LinkedList<String> newobj = new LinkedList<String>();
        newobj = (LinkedList) objp.clone();

        System.out.println("First Linked list = " + objp);
        System.out.println("  ");
        System.out.println("second Linked list = " + newobj);
        System.out.println("  ");
        System.out.println(objp.getFirst());
    }
}
