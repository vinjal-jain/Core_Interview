package String;

public class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer("suraj");

        System.out.println(sb.replace(2,4,"yadav"));
        System.out.println(sb.charAt(4));
        System.out.println(sb.length());
        System.out.println(sb.indexOf("j"));
        System.out.println(sb.capacity());


        System.out.println(sb.reverse());



    }
}
