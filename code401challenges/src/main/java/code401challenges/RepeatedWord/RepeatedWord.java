package code401challenges.RepeatedWord;

public class RepeatedWord {


 public static void getCount(String [] args) {
     int count = 0;
     String string = "My little Pony, My little Pony";

     string.toLowerCase();

     String[] words = string.split(" ");

     for(int i = 0; i < words.length; i++) {
         count = 1;
         for(int j = i+1; j < words.length; j++) {
             if(words[i].equals(words[j])) {
                 count++;

                 words[j] = "0";
             }
         }

         if(count > 1 && words[i] != "0")
             System.out.println(words[i]);

     }


 }
}

//Used this as a resource https://www.javatpoint.com/program-to-find-the-duplicate-words-in-a-string