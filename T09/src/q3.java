public class q3 {

    /*reverse("Object")
        (reverse("bject")) + "O" => bjectO
        ((reverse("ject")) + "b") + "O") => bjectO
        (((reverse("ect")) + "j") + "b") + "O") => bjectO
        ((((reverse("ct")) + "e") + "j") + "b") + "O") => bjectO
        (((((reverse("t")) + "c") + "e") + "j") + "b") + "O") => bjectO
    return t
    FINAL OUTPUT: ""*/

    public static String reverse(String str) {

        //Terminating condition
        if(str == null || str.length() <= 1) {
            return str;
        }

        //Recursive function call
        //str.charAt(0) so it will 'take' and add the character at index 0
        return reverse(str.substring(1)) + str.charAt(0); //substring basically keluarkan all the characters after 1
    }

    public static void main(String[] args) {

        String str = "String";
        String revStr = reverse(str);

        System.out.println(revStr);

    }
}
