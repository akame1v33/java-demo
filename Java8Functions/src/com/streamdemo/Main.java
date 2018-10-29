package com.streamdemo;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        DoubleConsumer doubleConsumer = new DoubleConsumer() {
            @Override
            public void accept(double value) {

            }
        };

        DoubleToIntFunction doubleToIntFunction = new DoubleToIntFunction() {
            @Override
            public int applyAsInt(double value) {
                return 0;
            }
        };

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return null;
            }
        };

    }
}
