package codewars.chalenges;

import java.util.Scanner;

/** Description:
 * We have to write a class named MyRegex which should contain a string pattern. We need to write a regular expression
 * and assign it to the pattern such that it can be used to validate an IP address.
 * We have to use the following definition - IP address is a string in the form "A.B.C.D",
 * where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C,
 * or D can't be greater than 3.
 */

public class IPAddressRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))\\b";
}

