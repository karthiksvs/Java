package M3_as2;

/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the 
 * string is less than length 3. Return n copies of the front;
 * 
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 * 
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 * 
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 * 
 * @author: Siva Sankar
 */

public class FrontTimes {

    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) {
        //  Your code goes here....
        String a="";
        String b="";
        String d="";
        if(str.length()<3){
            for(int i=0;i<n;i++){
                d=d+str;
            }
            return d;
        }
        else {
            for (int i = 0; i < 3; i++) {
                char c = str.charAt(i);
                a = a + c;
            }
            for (int i = 0; i < n; i++) {
                b = b + a;
            }
            return b;
        }
    }
}