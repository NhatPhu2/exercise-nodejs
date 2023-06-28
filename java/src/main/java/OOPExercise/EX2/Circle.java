package OOPExercise.EX2;

public class Circle extends Shape{
    @Override
    public void CalculateArea(float pi, float r) {
        float area = (float) (pi * Math.pow(r,2));
        System.out.println("Diện tích hình tròn: " + area);
    }

    @Override
    public void CalculatePerimeter(double d, double r) {
        double c = d * 3.14;
        System.out.println("Chu vi hình tròn: " + c);
    }
}
