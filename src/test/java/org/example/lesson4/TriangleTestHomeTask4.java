package org.example.lesson4;

import org.example.lesson4UiAuto.AreaOfTriangleLesson4HomeTask;
import org.example.lesson4UiAuto.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTestHomeTask4 {


    @Test
    void test() throws MyException {
        final AreaOfTriangleLesson4HomeTask areaOfTriangleLesson4HomeTask = new AreaOfTriangleLesson4HomeTask();
        Assertions.assertEquals(33,areaOfTriangleLesson4HomeTask.someMethod(10,10,7));
        Assertions.assertThrows(MyException.class,()-> areaOfTriangleLesson4HomeTask.someMethod(10,10,-7));
    }
    @ParameterizedTest
    @Tag("Positive")
    @CsvSource({"3,4,3,4","10,10,8,37","100,80,90,3420"})
    void testCsvSource (int a, int b, int c, int result) throws MyException {
        AreaOfTriangleLesson4HomeTask areaOfTriangleLesson4HomeTask = new AreaOfTriangleLesson4HomeTask();
        Assertions.assertEquals(result,areaOfTriangleLesson4HomeTask.someMethod(a,b,c));
    }

    @ParameterizedTest
    @Tag("Negative")
    @CsvSource({"-1,-1, 3", "-10, 8, 1", "-100, 200, -10"})
    void testCsvSource1 (int a, int b, int c) throws MyException {
        AreaOfTriangleLesson4HomeTask areaOfTriangleLesson4HomeTask = new AreaOfTriangleLesson4HomeTask();
        Assertions.assertThrows(MyException.class, ()-> areaOfTriangleLesson4HomeTask.someMethod(a,b,c));
    }
}