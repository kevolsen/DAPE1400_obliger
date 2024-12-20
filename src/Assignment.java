public class Assignment {
    /**
     * Returns the sum of all the received numbers.
     */
    public int addThreeNumbers(int i, int j, int k) {
        return i+j+k;
    }

    /**
     * Evaluates if the received number is
     * Small (less than 100).
     * Big (greater than 1000).
     * Medium (not small or big)
     */
    public String isNumberSmallMediumOrBig(int number){
        if(number < 100) {
            return "Small";
        }
        else if(number > 1000) {
            return "Big";
        }
        else {
            return "Medium";
        }
    }

    /**
     * Prints course name for provided course code.
     * ADTS1600 -> Interaksjonsdesign og Prototyping
     * DAPE1400 -> Programmering
     * DATA1200 -> Webutvikling og inkluderende design
     * DATA1100 -> Teknologi og samfunn for programmerere
     * or "Unknown" if none of the above.
     */
    public void printCourseName(String courseCode){
        switch (courseCode) {
            case "ADTS1600" -> System.out.println("Interaksjonsdesign og Prototyping");
            case "DAPE1400" -> System.out.println("Programmering");
            case "DATA1200" -> System.out.println("Webutvikling og inkluderende design");
            case "DATA1100" -> System.out.println("Teknologi og samfunn for programmerere");
            default -> System.out.println("Unknown");
        }
    }

    /**
     * Returns true if provided color is represented in the Norwegian flag.
     * Color input is lowercase only.
     */
    public boolean isColorInNorwegianFlag(String color){
        return (color.equals("red") || color.equals("blue") || color.equals("white"));
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        return s1.length()+s2.length();
    }


    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     */
    public int firstOccurrence(String string, char c){
        return string.indexOf(c);
    }

    /**
     * Returns the string with out starting spaces only a single trailing space at the end
     * hint: https://www.w3schools.com/java/ref_string_trim.asp
     */
    public String ensureOnlySingleSpaceAtEndOfString(String string){
        return string.trim()+" ";
    }

    /**
     * Return true if string is shorter than or equal to maxChar characters and longer then or equal to minChar characters.
     * hint: https://www.w3schools.com/java/ref_string_length.asp
     */

    public Boolean checkIfStringIsWithinCorrectLength(String string, int maxChar, int minChar){
        return (string.length() <= maxChar && string.length() >= minChar);
    }

    /**
     * Return True if the string is valid under the following conditions:
     * Only single trailing spaces
     * No starting spaces
     * Must be longer or equal to 6 characters
     * Must be shorter or equal to 60 characters
     * Hint: Maybe its possible to reuse previous methods for this task?
     */
    public Boolean validateString(String string) {
        if (string.startsWith(" ")) return false;
        if (string.length() != string.trim().length() + 1) return false;
        if (string.length() < 6 && string.length() > 60) return false;
        return true;
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        for (int i=0;i<strings.length;++i) System.out.println(strings[i]);
    }

    /**
     * Returns the sum of all numbers in received array.
     */
    public int arraySum(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;++i) sum+=numbers[i];
        return sum;
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings){
        for (int i=0;i<strings.length;++i)
            if (!"Corona".equals(strings[i]))
                System.out.println(strings[i]);
    }

    /**
     * Returns the sum of all the received numbers.
     * hint: this is called varargs
     */
    public int addNumbers(int... numbers){
        int sum=0;
        for(int i=0;i<numbers.length;++i) sum+=numbers[i];
        return sum;
    }

    // The following methods are Optional assignments:
    // additional optional assignments might be added later.

    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){
        for(int i=0;i<strings.length;++i) System.out.println(strings[i].toUpperCase());
    }

    /**
     * Print all characters until a char is "."
     * including the .
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {
        int j=chars.length-1;
        for(int i=0;i<chars.length;++i)
            if (chars[i]=='.') {
                j=i;
                break;
            }
        for(int k=0;k<j+1;++k) System.out.print(chars[k]);
    }


    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){
        for(int i=0;i<strings.length;++i)
            if (!"Corona".equalsIgnoreCase(strings[i]))
                System.out.println(strings[i]);
    }
}
