package Assignment4.Visitor;

public class Main {
    public static void main(String[] args) {
        File textFile = new TextFile("This is a sample text.");
        File executableFile = new ExecutableFile("Program.exe");

        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        textFile.accept(antivirus);
        executableFile.accept(antivirus);

        textFile.accept(report);
        executableFile.accept(report);
    }
}