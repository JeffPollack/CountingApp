/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keycounting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author jdpollac
 */
public class KeyCounting {

    public static void main(String[] args) {
        System.out.println();

        String s = "4HS 3, 2LW, 1DDD 131, 1GMA 14CD, 1GMA 277, 1NNA 50, 1NNA 53, 1RRR M1, 1Z, 1ZF 3A, Recycle key, Lift key, Chariot key, Rider key, "
                + "4HS 21, 2LW, 2C, 2CT, Recycle key, Lift key, "
                + "4HS 18, 1RG 2, 1GMX 45, 1Z, 2B, 2C, 4GMA 90, Recycle key, Lift key, Chariot key, Elev. 4th key, "
                + "4HS 22, 1GMA 81, 1JD 48, 2C, Recycle key, Lift key, Chariot key, "
                + "4HS 20, 2LW, 2C, 2DE, 2FK, Recycle key, Lift key, "
                + "4HS 11, 1Q 8, 1GGG, 1GMA68, 1GMA 203, 2DM 3, 2GMA 168, Recycle key, Lift key, Chariot key, "
                + "4HS 12, 1Q 8, 1GGG, 1GX G1, 1GMX 11, 2D, Recycle key, Lift key, Elev. on/off key, "
                + "4HS 13, 1Q 8, 1GGG, 1GX G1, 1GMX 11, 2GMA 1, Recycle key, Lift key, "
                + "4HS 14, 1Q 8, 1GGG, 1SSS, Recycle key, Lift key, "
                + "4HS 16, 2LW, 1C 49, 1Q 8, 1GGG, Recycle key, Lift key, Chariot key, "
                + "4HS 8, 2E, 1C 49, 1GMA 18, 1GMA 69, 1GMA 70, 1GMA 88, 1GMA 240, Recycle key, Lift key, Chariot key, "
                + "4HS 4, 2LW, 2E, 1GMA 267, Recycle key, Lift key, "
                + "4HS 9, 4HS 10, 2LW, 2E P, 1GMA 268, Recycle key, Lift key, Chariot key, "
                + "4HS 9, 2E, 1GMA 240, Recycle key, Lift key, "
                + "4HS 7, 2E, 1GMA 291, 1X 1, 2XG, 2CT, 1SSS 1, 1SSS 2, 1SSS 3, Recycle key, Lift key, "
                + "4HS 5, 4HS 6, Chariot key, Rider key, "
                + "4HS 5, 4HS 6, Chariot key, Rider key";
        String keys[] = s.split(", ");
        
        Map count = new HashMap();
        Integer ONE = 1;
        for (String key : keys) {
            Integer frequency = (Integer)count.get(key);
            if (frequency == null) {
                frequency = ONE;
            } else {
                int value = frequency;
                frequency = (value + 1);
            }
            count.put(key, frequency);
        }
        
        Map<String, String> map = new TreeMap<>(count);
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " ,Count is: " + entry.getValue());
        }
    }            
}