package homework2;

public class Example3 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, " +
                "we just need to determine how many times the character 'a'" +
                " occurs there. And we can use the split method and the length method.";
        String[] strings = string.split("A");
        System.out.println(strings.length -1);

    }
}
