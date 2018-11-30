package info.jessequinn;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compiled high level, object-oriented, platform independant langauge");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners all purposes symbolic instruction code");
        languages.put("Lisp", "There les madness");

        System.out.println(languages.get("Java"));
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println("++++++++++++++++++++++++++");

//        languages.remove("Lisp");

        /* replace, remove, put, get, etc..*/
        if(languages.remove("Lisp","a family of algorithmic languages")) {
            System.out.println("Algol Removed");
        } else {
            System.out.println("Did not remove Algol");
        }

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
