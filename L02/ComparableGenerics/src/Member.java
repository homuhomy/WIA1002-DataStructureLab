public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member member) {
        if (this.height == member.getHeight()) {
            return 0;
        } else if (this.height > member.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }

    /*

        As returning a negative number from compareTo() is enough
        if the this object is smaller than the parameter object,
        and returning zero is sufficient when the lengths are the same,
        the compareTo method described above can also
        be implemented as follows.

    */

    //or can be written as
//    @Override
//    public int compareTo(Member member) {
//        return this.height - member.getHeight();
//    }
}