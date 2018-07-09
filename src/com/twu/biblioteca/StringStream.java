package com.twu.biblioteca;

import java.io.*;

public class StringStream extends PrintStream {
    public StringStream() {
        super(new ByteArrayOutputStream());
    }

}
