package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TestRunner.runner (TestedClass.class);
    }
}