//public class Sentence_Similarity {
//    public static void main(String[] args) {
//       String sentence1 = "My name is Haley", sentence2 = "My Haley";
//        System.out.println(areSentencesSimilar(sentence1,sentence2));;
//    } static boolean areSentencesSimilar(String sentence1, String sentence2) {
//        // Step 1: Split both sentences into arrays of words
//        String[] words1 = sentence1.split(" ");
//        String[] words2 = sentence2.split(" ");
//
//        int i = 0, j = 0;
//
//        // Step 2: Match words from the start
//        while (i < words1.length && i < words2.length && words1[i].equals(words2[i])) {
//            i++;
//        }
//
//        // Step 3: Match words from the end
//        while (j < words1.length - i && j < words2.length - i && words1[words1.length - 1 - j].equals(words2[words2.length - 1 - j])) {
//            j++;
//        }
//
//        // Step 4: Check if all middle words have been matched
//        return i + j == Math.min(words1.length, words2.length);
//    }
//}
//int i ,j=0;
