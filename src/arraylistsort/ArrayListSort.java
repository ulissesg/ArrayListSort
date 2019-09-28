/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsort;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ulisses
 */
public class ArrayListSort {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        Collections.reverse(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
