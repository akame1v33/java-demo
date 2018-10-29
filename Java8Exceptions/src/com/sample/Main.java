package com.sample;

import com.sample.collections.CollectionDemo;
import com.sample.enums.EnumDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {

    static public void main(String[] args) {
//        List<String[]> test = new ArrayList<>();
//
//        String[] strings = new String[10];
//        strings[0] = "RIMURU";
//        strings[1] = "TEMPEST";
//        strings[2] = "18";
//        strings[3] = "HARD";
//        test.add(  strings  );
//        test.add( strings );
//
//        print( test );

//        try {
//            FileReader file = new FileReader("somefile.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //NO ERROR BECAUSE I THROW UNCHECKED EXCEPTION

//        new EnumDemo().run();


        new CollectionDemo().run();
    }











    static <T extends Iterable> void print(T t){

        t.forEach(r -> {
            if( r instanceof Object[]  ){
                Object[] col = (Object[])r;
                Stream.of(col).forEach(c -> {
                    System.out.print(c +"\t");
                });
            } else {
                List<String> cols = (List<String>)r;

                cols.forEach(c -> {
                    System.out.print(c +"\t");
                });
            }

            System.out.println();
        });
    }




}
