package ru.netology.sqr.javaqasquaresmvn.services;

public class SqrService {

    public int correctCount(int startNumber, int finishNumber) {

        int squareCount = 0;

        for (int i = 10; i < 100; i++) {
            int square = i * i;

            if (square < startNumber) {
                continue;
            }

            if (square <= finishNumber) {
                squareCount++;
            }

        }

        return squareCount;
    }

}