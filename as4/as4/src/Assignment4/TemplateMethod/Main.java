package Assignment4.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        QualityCheck foodCheck = new FoodQualityCheck();
        foodCheck.checkProduct();

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        electronicsCheck.checkProduct();
    }
}