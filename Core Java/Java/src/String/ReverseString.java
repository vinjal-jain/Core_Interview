package String;

public class ReverseString {
    public static void main(String[] args) {
        String name = "vinjal";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

            /*With using stringbuilder object
            StringBuilder sb = new StringBuilder("Jain");
            System.out.println(sb.reverse());*/
        }
    }
}
