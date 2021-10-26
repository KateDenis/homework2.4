package ru.netology.sqr;

public class SQRService {
    public int countNumbers(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int tmp = i * i;
            if (tmp >= min && tmp <= max) {
                counter++;
            }
        }

        return counter;
    }
}
