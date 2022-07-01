package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int border1, int border2) {
        int x = 0;
        for (int i = 10; i < 99; i++)
            if (i * i >= border1 && i * i <= border2) {
                x++;
            }
        return x;
    }
}



