/** Given a string s consisiting of n letters either 'a' or 'b' in one move you can only swap one letter for the other
 *  ('a' for 'b' or 'b' for 'a')
 *  return the number of moves require to obtain a string containing no instances of three identical consecutive letters
 *  input: "baaaaa"
 *  output: 1
 *  */

package com.phanidharsai.interviewquestions.opentext;

public class StringSwapWithCondition {
        public static int solution(String S) {
            int moves = 0;
            int consecutiveCount = 1;

            for (int i = 1; i < S.length(); i++) {
                if (consecutiveCount == 3) {
                    moves++;
                    consecutiveCount = 1; // Reset consecutiveCount to 1 after swap
                }
                if (S.charAt(i) == S.charAt(i - 1)) {
                    consecutiveCount++;

                } else {
                    consecutiveCount = 1; // Reset consecutiveCount if characters are different
                }
            }

            return moves;
        }

        public static void main(String[] args) {
            String S1 = "baaaaa";
            String S2 = "baaabbaabbba";
            String S3 = "baabab";

            System.out.println(solution(S1)); // Output: 1
            System.out.println(solution(S2)); // Output: 2
            System.out.println(solution(S3)); // Output: 0
        }
    }
