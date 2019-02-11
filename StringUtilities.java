
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        //char[] rev =  valueToBeReversed.toCharArray();
        StringBuilder rev = new StringBuilder();
        String rev1;
        rev.append(valueToBeReversed);
        rev = rev.reverse();
        rev1 = rev.toString();
        
        return rev1;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if (word.length() %2 ==0){
         return word.charAt((word.length() /2)-1);   
        }
        else{
         return word.charAt(word.length()/2);   
        }
        
        
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String s = "" + charToRemove;
        
        return value.replace(s,"");
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] last = sentence.split(" ");
        
        return last[last.length -1];
    }
}
