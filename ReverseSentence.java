public class ReverseSentence {
public static void main(String[] args) {
String words = "Amazon development centre,Chennai";
int wordCount = words.length();
System.out.println("Word Count: " + wordCount);
System.out.print("Reversed Sentence: ");
for (int i = wordCount - 1; i >= 0; i--) {
System.out.print(words(i) + " ");
        }
    }
}
