package com.sample.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EnumDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Move.DOWN.ordinal());

        Move up = Move.UP;


        Stream.of( Move.values() )
                    .forEach(m -> {
                        m.move();
                    });

        List<String> names = Arrays.asList("FUCK","THIS","SHIT");
        names.forEach(System.out::println);
//        System.out.println
// ;
    }


    enum Move {
        RIGHT, LEFT, UP, DOWN;



        public void move(){
            System.out.println("Moving at "+this);
        }
    }


}
