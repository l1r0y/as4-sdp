package Assignment4.TemplateMethod;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking functionality and warranty...");
    }
}