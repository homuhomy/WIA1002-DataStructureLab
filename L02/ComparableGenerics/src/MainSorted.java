import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSorted {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));

        System.out.println("Original List: ");
        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        // sorting the stream that is to be printed using the sorted method
        System.out.println("\nSorted using stream, wont change the original list, " +
                "only items are sorted");
        member.stream().sorted().forEach(m -> System.out.println(m));

        System.out.println("\nBack to the original position");
        member.stream().forEach(m -> System.out.println(m));

        // sorting a list with the sort-method of the Collections class
        System.out.println("\nif programmer wanna organize original list, need to use original list");
        System.out.println("Assuming the objects on the list implement Comparable interface");
        Collections.sort(member);
        member.stream().forEach(m -> System.out.println(m));
    }
}
