package com.modernjava.textblocks;

public class TextBlocks {



    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return  multiLine;
    }

    public static String multiLineString2() {

        var multiLine = """
                This is a
                multiline string
                with newlines inside
                """;

        return  multiLine;
    }

    public static String multiLineString3(String name) {

        var multiLine = """
                This is a %s
                multiline string
                with newlines inside
                """.formatted(name);

        return  multiLine;
    }
    public static String sql() {

        var multiLine = """
                select * from employees
                where first_name='John'
                where last_name='Smith'
                """;

        return  multiLine;
    }

    public static String json() {

        var multiLine = """
                {
                "orde_id":1234,
                "orde_first_name":'John',
                "orde_last_name":'Smith',
                "orde_age":123
                }
                """;

        return  multiLine;
    }


    public static void main(String[] args) {

        System.out.println("multiLineString = " + multiLineString());
        System.out.println("multiLineString2 = " + multiLineString2());
        System.out.println("multiLineString3 = " + multiLineString3("Raju's"));
        System.out.println("sql = " + sql());
        System.out.println("json = " + json());


    }
}
