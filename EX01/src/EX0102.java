// Stephen Haugland
// 9/14/2020
// Software QA - Pete Tucker
// Whitworth University



public class EX0102{

    public static boolean isTriangle(int a, int b, int c){
        // ensure sides have a valid length (length > 0)
        if (a > 0 && b > 0 && c > 0){
            // triangle inequality theorem
            if((a + b > c) && (b + c > a) && (a + c > b)){
                return true;
            }
        }
        // if sides are invalid lengths or cannot make a triangle return false
        return false;
    }

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(isTriangle(5,5,9));
     }
}