package homework2;

public class Example2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String word1 = string.split("\\s")[0];
        System.out.println(word1);
        word1 = word1.replace(",","");
        System.out.println(word1);
        String word2 = string.split("\\s")[1];
        String word3 = string.split("\\s")[2];
        String word4 = string.split("\\s")[3];
        String word5 = string.split("\\s")[4];
        System.out.println("Cлово1 = " + word1 + ", Длина = " + word1.length() + ".");
        System.out.println("Cлово2 = " + word1 + ", Длина = " + word2.length() + ".");
        System.out.println("Cлово3 = " + word1 + ", Длина = " + word3.length() + ".");
        System.out.println("Cлово4 = " + word1 + ", Длина = " + word4.length() + ".");
        System.out.println("Cлово5 = " + word1 + ", Длина = " + word5.length() + ".");
        boolean result = word1.length() > word2.length() &&
                word1.length() > word3.length() &&
                word1.length() > word4.length() &&
                word1.length() > word5.length();
        System.out.println(result);
    }
}
