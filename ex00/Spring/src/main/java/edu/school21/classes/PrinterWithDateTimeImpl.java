package edu.school21.classes;

import java.time.LocalDateTime;

public class PrinterWithDateTimeImpl implements Printer {

    private String prefix;
    private Renderer renderer;

    public PrinterWithDateTimeImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    public void print(String str) {
        renderer.getStream().println(renderer.render(LocalDateTime.now() + " " + str));
    }
}
