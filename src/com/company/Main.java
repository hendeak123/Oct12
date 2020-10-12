package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sodaJam = new ArrayList<String>();
        sodaJam.add("Pepsi");
        sodaJam.add("Coke");
        sodaJam.add("Mountain Dew");
        sodaJam.add("Root Beer");
        //sodaJam.remove(3);
        //sodaJam.add(3, "Orange Crush");
        //Collections.sort(sodaJam);
        System.out.println(sodaJam);
        ArrayList<String> sodaJamClone = (ArrayList<String>) sodaJam.clone();
        System.out.println(sodaJamClone);

        /*for (int i = 0; i < sodaJam.size(); i += 2){
            sodaJam.remove(i);
        }*/
        System.out.println(sodaJam);

        for (String soda:sodaJam) {
            if (soda == "Coke"){
                sodaJamClone.add("Cream Soda");
            }
            if (soda == "Mountain Dew"){
                sodaJamClone.remove(soda);
            }
        }
        System.out.println(sodaJamClone);
        sodaJam.clear();
        System.out.println(sodaJam);

    }
}
