package com.ch09;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;

    }

    @Override
    public String toString() {
        return "\nQueue is full . Maximum size is "+size;
    }
}
