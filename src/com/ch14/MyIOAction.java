package com.ch14;

import java.io.IOException;
import java.io.Reader;

public interface MyIOAction {
    boolean ioAaction(Reader rdr) throws IOException;
}
