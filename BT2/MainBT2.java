package BT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBT2 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Red");
        lst.add("Green");
        lst.add("Orange");
        lst.add("White");
        lst.add("Black");
        System.out.println("List before sort: " + lst);
        Collections.sort(lst);
        System.out.println("List after sort: " + lst);
    }
}