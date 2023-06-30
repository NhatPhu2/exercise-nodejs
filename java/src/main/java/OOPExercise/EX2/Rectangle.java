package OOPExercise.EX2;

public class Rectangle extends Shape{
    @Override
    public void CalculateArea(float a, float b) {
        float result = (float) a * b;
        System.out.println("diện tích hình chữ nhật: " + result);
    }

    @Override
    public void CalculatePerimeter(double a, double b) {
        double result = (a + b) * 2;
        System.out.println("Chu vi hình chứ nhật: " + result);
    }

}
