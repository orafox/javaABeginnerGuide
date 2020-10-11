package com.ch08;

public interface MyIF {
    int getUserID();
    default int getAdmin(){
        return 1;
    }

    static int getUniversalID() {
        return 0;
    }
}
