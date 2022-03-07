/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variable;
import java.util.HashMap;
/**
 *
 * @author ASUS
 */
public class HMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Michael", 10);
        map.put("Fang", 30);
        map.put("Mario", 20);
        
        Boolean a = map.containsKey(30);
        System.out.println(a);
    }
}
