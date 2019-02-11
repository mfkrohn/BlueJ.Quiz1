 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int ans = 1;
          for(int i = 1; i<number + 1; i++){
             ans *= i; 
            }
          
          return ans;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] acr = phrase.split(" ");
          String[] firstLetter = new String[acr.length];
          StringBuilder builder = new StringBuilder();
          String acronym = "";
          for(int i = 0; i < acr.length; i++){
            firstLetter[i] = ("" + acr[i].charAt(0)).toUpperCase();  
            }
          for(int j = 0; j < firstLetter.length; j++){
            acronym += firstLetter[j];  
            }
          return acronym;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] encrypt1 = word.toCharArray();
          for(char c: encrypt1){
             System.out.print(c); 
            }
          String secretWord = "";
          for(int i = 0; i < encrypt1.length; i++){
             switch (encrypt1[i]){
              case 'x':
              encrypt1[i] = 'a';
              break;
              
              case 'y':
              encrypt1[i] = 'b';
              break;
              
              case 'z':
              encrypt1[i] = 'c';
              break;
              
              case 'X':
              encrypt1[i] = 'A';
              break;
              
              case 'Y':
              encrypt1[i] = 'B';
              break;
              
              case 'Z':
              encrypt1[i] = 'C';
              break;
              
              default:   
              encrypt1[i] += 3;
              break;
            }
            
        }
        for(int j = 0; j < encrypt1.length; j++){
            secretWord += encrypt1[j]; 
            System.out.println(secretWord);
            }
          return secretWord;
      }
}
