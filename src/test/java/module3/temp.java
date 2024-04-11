package module3;

public class temp {
    public static void main(String[] args) {


        String text = "1 2 3 4 5 5 5 5";
        String word = "5";
        System.out.println(searchWord(text, word));
    }


    public static int searchWord(String text, String word) {
        int count = 0;
        String[] words = text.split(" ");

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        return count;
    }
}

/*
public static void main(String[] args) {


    String text = "1 6  2 3 4 5 5 5 5 6";
    String word = "6";
    System.out.println(searchWord(text, word));
}


public static int searchWord(String text, String word) {

    String [] w  = text.split(word);
    int count = Math.max(0, w.length);

    return count;

}
 */
