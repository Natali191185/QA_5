package homework2;

public class Example1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0,string1.indexOf("it"));
        String string3 = string2 + "is perfect";
        System.out.println(string1);
        System.out.println(string1.length());
        System.out.println(string2);
        System.out.println(string2.length());
        System.out.println(string3);
        System.out.println(string3.length());
    }
}

