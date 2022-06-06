package edu.school21.classes;

import java.io.PrintStream;

public interface Renderer {
    public PrintStream getStream();
    public String render(String str);
}
