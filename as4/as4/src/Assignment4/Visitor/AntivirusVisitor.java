package Assignment4.Visitor;

public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for banned words...");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code...");
    }
}