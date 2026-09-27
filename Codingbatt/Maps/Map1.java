package Maps;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<String, String> data = new HashMap<>();

        data.put("a", "candy");
        data.put("b", "dirt");// "a": "candy", "b": "dirt"

        // data.put("b",data.get("a"));
        // data.put("a","");
        // System.out.println(mapBully(data));

        Map<String, String> data2 = new HashMap<>();

        data2.put("a", "aaa");
        data2.put("b", "bbb");
        data2.put("c", "ccc");

        // System.out.println(mapShare(data));

        Map<String, String> Map3 = new HashMap<>();

        Map3.put("a", "aaa");
        // Map3.put("b", "bbb");
        // Map3.put( "c", "cake");

        // System.out.println(mapAB4(Map3));

        Map<String, String> Map4 = new HashMap<>();

        Map4.put("a", "aaa");
        Map4.put("ab", "nope");
        Map4.put("b", "bbb");
        Map4.put("c", "ccc");

        // System.out.println(mapAB(Map4));

        Map<String, String> Map5 = new HashMap<>();

        Map5.put("ice cream", "peanuts");

        // System.out.println(topping1(Map5));

        Map<String, String> Map6 = new HashMap<>();

        Map6.put("a", "aaa");
        Map6.put("b", "aaa");
        Map6.put("c", "cake");

        System.out.println(mapAB2(Map6));

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    // Modify and return the given map as follows: if the key "a" has a value, set
    // the key "b" to have that same value. In all cases remove the key "c", leaving
    // the rest of the map unchanged.

    // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    // mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    // mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d":
    // "hi"}

    // public static Map<String, String> mapShare(Map<String, String> map) {
    // map.remove("a");
    // }

    // Modify and return the given map as follows: if the keys "a" and "b" have
    // values that have different lengths, then set "c" to have the longer value. If
    // the values exist and have the same length, change them both to the empty
    // string in the map.

    // mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
    // "aaa"}
    // mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c":
    // "bbb"}
    // mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
    public static Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");

            map.put("ab", a + b);

        }
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");

            map.put("ab", a + b);

        } else {
            return map;
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;

    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b")) {
            map.put("c", map.get("b"));
        }
        return map;
    }

}