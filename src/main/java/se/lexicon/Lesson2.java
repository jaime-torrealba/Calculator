package se.lexicon;

public class Lesson5 {

    public static void main(String[] args) {
        int num1 = 11;
        int answer;

        answer = multNumbers(num1);

        System.out.println("The result is: " + answer);


    }

    public static int multNumbers(int a) {

        int ans = a * 7;

        return ans;
    }


}

