package OOPExercise.EX2;



public class Triangle extends Shape{

    @Override
    public void CalculateArea(float a, float b) {
        float area = (float) (0.5 * a * b);
        System.out.println("Diện tích hình tam giác: " + area);
    }

    @Override
    public void CalculatePerimeter(double a, double c) {
        double perimeter = 2*a + c;
        System.out.println("Chu vi hình tam giác cân " + perimeter);
    }
}
