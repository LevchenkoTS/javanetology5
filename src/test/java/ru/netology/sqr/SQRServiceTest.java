package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

@ParameterizedTest
@CsvFileSource (files="src/test/resources/resources.csv")
public void amountSqr(int expected, int upperRangeLimit, int lowerRangeLimit) {
    SQRService service = new SQRService();
    int actual = service.calcSqr(upperRangeLimit, lowerRangeLimit);
    Assertions.assertEquals(expected, actual);

    }
}
