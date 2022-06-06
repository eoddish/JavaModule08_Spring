package edu.school21.classes;

public class PrinterWithPrefixImpl implements Printer {
    private String prefix;
    private Renderer renderer;

    public PrinterWithPrefixImpl(Renderer renderer) {
        this.renderer = renderer;
    }
    public void print(String str) {
        renderer.getStream().println(renderer.render(prefix + " " + str));
    }
    public void setPrefix (String prefix) {
        this.prefix = prefix;
    }
}
