package SList;

public class TestList {
    public static void main(String[] args) {
        SList<String> list = new SList<String>();

        //Append the following values individually: “Linked list, is, easy.”
        list.appendEnd("Linked");
        list.appendEnd(" list,");
        list.appendEnd(" is,");
        list.appendEnd(" easy.");

        //display the values
        list.display();
        System.out.println("");

        //Remove the word “Linked list” and display the removed value.
        list.removeInitial();
        System.out.println("");
        list.removeInitial();

        //Check if ‘difficult’ is in the list.
        System.out.println(list.contains("difficult"));

        //clear the list
        list.clear();
    }
}
