package ru.netology.sqr.javaqasquaresmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {

    @ParameterizedTest()
    @CsvFileSource(files = "src/test/resources/SquareCountData.csv")
    void testSquareNumbers(int start, int finish, int correctNumber) {
        SqrService service = new SqrService();

        int calculated = service.correctCount(start, finish);

        Assertions.assertEquals(correctNumber, calculated);
    }

}
