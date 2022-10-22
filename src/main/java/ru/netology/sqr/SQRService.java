package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int upperRangeLimit, int lowerRangeLimit) {
        int variable = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= upperRangeLimit & i * i <= lowerRangeLimit) {
                variable++;
            }
        }
        return variable;
    }
}






