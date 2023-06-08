package org.example.lesson4UiAuto;

public class AreaOfTriangleLesson4HomeTask {
    public int someMethod(int a, int b, int c) throws MyException {
        if(testValue(a,b,c)) throw new MyException("Some text");
        double halfPerimeter = (a+b+c)/2.0;
        double S = Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));
        int result = (int) Math.round(S);
        return result;

        /*
        if (a<0 || b<0 || c<0) throw new MyException("Значения сторон треугольника не могут быть отрицательными - построить треугольник нельзя");
        if (a==0 || b==0 || c==0) throw new MyException("Значения сторон треугольника не могут быть равны нулю - построить треугольник нельзя");
        if (a+b<=c || b+c<=a || c+a<=b) throw new MyException("Сумма длин двух сторон теругольника не может быть больше третей стороны - построить трегуольник нельзя");
         */
    }
    private boolean testValue(int a, int b,int c){
        return a<0 || b<0 || c<0;
    }

}
