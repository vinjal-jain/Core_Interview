package String;

public class StringMethods {
    public static void main(String[] args) {
        String name = " Rohit ";
                String st = name.replace("R", "P");

        System.out.println(st.length());
       // System.out.println(name.replace("R","V"));
        System.out.println(st.charAt(3));
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.startsWith("s"));
        System.out.println(st.endsWith("t"));
        System.out.println(st.equalsIgnoreCase("r0hit"));
        System.out.println(st.trim());


    }
}
