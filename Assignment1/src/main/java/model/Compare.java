package model;

/**
 * Created by Taylor on 1/21/2016.
 */
public class Compare {
    


    // The two inputs should be the string values that represent the suits, or the faces (since they are also strings).
    // Yeah, this is pretty much a stock function, or method or whatever it is in Java.
    // This is called later in the greater compare function.
    public static boolean same_string(String a, String b){
        if(a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

    // Also rather simple, but hey, this is pretty good for hardly understanding Java.
    // This one takes in three strings, two strings of numbers and one that asks whether user wants a greater than or less than comparison.
    // Technically don't need the third one if this function was used cleverly, but let's be convenient.
    // Number strings are parsed into ints and compared. Returns boolean.
    // Also incorporated into the larger compare function.
    public static boolean compare_face(String a, String b, String c){
        int aint = Integer.parseInt(a);
        int bint = Integer.parseInt(b);
        if (c.equals("g")){
            if (aint > bint){
                return true;
            }
            return false;
        }
        if (c.equals("l")){
            if (aint < bint){
                return true;
            }
            return false;
        }
        return false;   // Something went wrong here. But logically it'll never happen, so don't worry boys and girls.
    }




}
