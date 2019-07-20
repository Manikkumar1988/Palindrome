public class Palindrome {

    public boolean inMemorySolution(String sentence) {
        String clean = sentence.replaceAll("\\s+", "").toLowerCase();

        int leftIndex = 0;
        int rightIndex = clean.length() - 1;

        while (rightIndex > leftIndex)
        {
            if (clean.charAt(leftIndex++) != clean.charAt(rightIndex--))
            {
                return false;
            }
        }
        return true;
    }

    public boolean libraryFunctionSolution(String sentence) {

        String clean = sentence.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public boolean recursiveSolution(String text){
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        return recursivePalindrome(clean,0,clean.length()-1);
    }

    private boolean recursivePalindrome(String text, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((text.charAt(forward)) != (text.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return recursivePalindrome(text, forward + 1, backward - 1);
        }

        return true;
    }
}
