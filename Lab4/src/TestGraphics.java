import acm.program.GraphicsProgram;
import acm.graphics.*;

public class TestGraphics extends GraphicsProgram {
    public void run() {
        GLabel label = new GLabel("Hello, ACM Graphics!");
        label.setFont("Serif-36");
        add(label, 100, 100);  // Adds the label to the canvas at coordinates (100, 100)
    }

    public static void main(String[] args) {
        new TestGraphics().start();
    }
}
