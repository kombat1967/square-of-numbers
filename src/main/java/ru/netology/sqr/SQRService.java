package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int lLimit, int uLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int number = i * i;
            if (lLimit <= number && number <= uLimit) {
                count = count + 1;
            }
        }
        return count;
    }
}
