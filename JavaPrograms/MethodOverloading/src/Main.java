// Method overloading example
package com.jessequinn;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Jesse", 500);
        System.out.println("New score is " + newScore);
        calculateScore(20);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
}