package dio.exercicio2;

public class Quadrilatero {

    public static double area(double lado){
        return lado*lado;
    }
    public static double area(double ladoA,double ladoB){
        return ladoA * ladoB;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return (baseMaior + baseMenor)*altura/2;
    }
}
