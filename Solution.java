// Solution one: brute force.
// Generates all possible scores by iterating through the String
// counting zeroes and ones for each possible partition.
// Sorts the ArrayList of possible scores and spits out the highest.

// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {

//     String str;

//     public int countZeroesLeft(int index) {
//         int count = 0;
//         for (int j = 0; j <= index; j++) {
//             if (str.charAt(j) == '0') {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public int countOnesRight(int index) {
//         int count = 0;
//         for (int j = str.length() - 1; j > index; j--) {
//             if (str.charAt(j) == '1') {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public ArrayList<Integer> genPossScores() {
//         ArrayList<Integer> possibleScores = new ArrayList<>();
//         for (int i = 0; i < str.length() - 1; i++) {
//             int score = countZeroesLeft(i) + countOnesRight(i);
//             possibleScores.add(score);
//         }
//         return possibleScores;
//     }

//     public int maxScore(String s) {
//         s = this.str;
//         ArrayList<Integer> possibleScores = genPossScores();
//         Collections.sort(possibleScores);
//         return possibleScores.get(possibleScores.size() - 1);
//     }

//     public static void main(String args[]) {
//         Solution sln = new Solution();
//         sln.str = args[0];
//         int result = sln.maxScore(args[0]);
//         System.out.println(result);
//     }
// }

// Solution Two: Iterates through the String to count total ones.
//MaxScore = ZeroesLeft - OnesRight + totalOnes
//Updates the score for each possible partition if the score is higher than the previous one
//Requires two passes of the string

// class Solution {

//     public int maxScore = 0;
//     public int zeroCount = 0;
//     public int onesCount = 0;
//     public int totalOnes;

//     public int countOnes(String s) {
//         for (int i = 0; i < s.length(); i++){
//             if (s.charAt(i) == '1') {
//                 totalOnes++;
//             }
//         }
//         return totalOnes;
//     }

//     public void updateCurrentScore() {
//         int currentScore = zeroCount + totalOnes - onesCount;
//         if (currentScore > maxScore) {
//             maxScore = currentScore;
//         }
//     }

//     public int maxScore(String s) {
//         countOnes(s);
//         for (int i = 0; i < s.length()-1; i++) {
//             if (s.charAt(i) == '0') {
//                 zeroCount++;
//             } else {
//                 onesCount++;
//             }
//             updateCurrentScore();
//         }
//         return maxScore;
//     }

//     public static void main(String args[]) {
//         Solution sln = new Solution();
//         String s = args[0];
//         System.out.println(sln.maxScore(s));
//     }
// }

//Solution three

class Solution {

    public int zeroesLeft;
    public int onesLeft;
    public int best = Integer.MIN_VALUE;

    public void updateCurrentBest() {
        int currentBest = zeroesLeft - onesLeft;
        if (currentBest > best) {
            best = currentBest;
        }
    }

    public int maxScore(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                zeroesLeft++;
            } else {
                onesLeft++;
            }
            updateCurrentBest();
        }
        return onesLeft + best;

    }


    public static void main(String[] args) {
        Solution sln = new Solution();
        String s = args[0];
        System.out.println(sln.maxScore(s));

    }
    
}