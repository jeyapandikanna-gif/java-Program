
package letterdelay;
public class LetterDelay {
    public static void main(String[] args) throws InterruptedException {

        String text = "HAI\n" +
                      "HAI SIR HOW CAN I HELP YOU\n" +
                      "CAN YOU TELL ME ABOUT JAVA\n" +
                      "SURE, JAVA IS AN PROGRAMMING\n" +
                      "LANGUAGE WHICH IS USED FOR DEVELOP\n" +
                      "APPLICATIONS WITH PLATFORM\n" +
                      "INDEPENDENT";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(300); // 0.3 seconds delay
        }
    }
}