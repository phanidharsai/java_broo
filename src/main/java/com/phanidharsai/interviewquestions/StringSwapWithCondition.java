package com.phanidharsai.interviewquestions;

public class StringSwapWithCondition {
        public static int solution(String S) {
            int moves = 0;
            int consecutiveCount = 1;

            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(i - 1)) {
                    consecutiveCount++;
                    if (consecutiveCount == 3) {
//                    if(S.charAt(i)==S.charAt(i+1)){
//                        consecutiveCount=0;
//                    }
                        moves++;
                        consecutiveCount = 1; // Reset consecutiveCount to 2 after swap
                    }
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
