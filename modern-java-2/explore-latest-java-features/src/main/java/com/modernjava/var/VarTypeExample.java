package com.modernjava.var;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VarTypeExample {


    //var in the class properties are not allowed.
    //private var x = "abc";



    public static void main(String[] args) {
    var list = List.of("adam","didlip");
        System.out.println("list : "+list);

        for(var name: list) {
            System.out.println("name"+name);
        }

       var map = Map.ofEntries( Map.entry("a",List.of("adam","alax")));
        System.out.println("map : "+map);

        map.forEach(( s ,  strings)->System.out.println("s = "+s));

        var transformName =transform("dilip");
        System.out.println("transformName : "+transformName);
        //we can't have var x = null;


    }

    static String transform(String name) { // var in the function argument is not allowed

        return name.toUpperCase();

    }

}

