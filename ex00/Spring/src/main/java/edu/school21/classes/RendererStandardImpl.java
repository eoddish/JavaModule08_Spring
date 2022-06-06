package edu.school21.classes;

import java.io.PrintStream;

public class RendererStandardImpl implements Renderer {
    private PreProcessor preProcessor;
    private PrintStream stream;

    public RendererStandardImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
        stream = System.out;
    }
    public PrintStream getStream() {
        return stream;
    }
    public String render(String str) {
        return preProcessor.preProcess(str);
    }
}
