package edu.school21.classes;

import java.io.PrintStream;

public class RendererErrImpl implements Renderer {
    private PreProcessor preProcessor;
    private PrintStream stream;

    public RendererErrImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
        stream = System.err;
    }
    public PrintStream getStream() {
        return stream;
    }
    public String render(String str) {
        return preProcessor.preProcess(str);
    }
}
