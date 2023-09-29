package com.giuseppe;

public class Valid_Palindrome {
    public static void main(String[] args) {

        String s = "a.b,c,c!b!!a";
        System.out.println(isPalindrome(s));


    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            // if char is a Letter or a digit skip this while loop
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            // if char is a Letter or a digit skip this while loop
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
