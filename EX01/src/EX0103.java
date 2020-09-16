// Stephen Haugland
// 9/14/2020
// Software QA - Pete Tucker
// Whitworth University

import java.util.*;


public class EX0103{

    // a: first vector in union
    // b: second vector in union
    // c: emtpy destination vector for (a union b) to be returned to
    public static Vector<Integer> unionVectors(Vector<Integer> a, Vector<Integer> b, Vector<Integer> c){
        // check for every element in a if it exists in b
        for (int i = 0; i < a.size(); i++){
            for(int j = 0; j < b.size(); j++){
                if (a.get(i) == b.get(j)){
                    // add like elements to destination vector
                    c.add(a.get(i));
                }
            }
        }
        return c;
    }

     public static void main(String []args){
        // driver code
        Vector<Integer> vec1 = new Vector<Integer>();
        vec1.add(1);
        vec1.add(2);
        vec1.add(3);
        Vector<Integer> vec2 = new Vector<Integer>();
        vec2.add(3);
        vec2.add(1);
        vec2.add(25);
        Vector<Integer> vec3 = new Vector<Integer>();
        unionVectors(vec1, vec2, vec3);
        System.out.println(vec3);
        
     }
}