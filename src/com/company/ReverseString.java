package com.company;

public class ReverseString {
    String reversed;
    char[] str;
    StringBuffer control;

    public ReverseString(String initial) {
        reversed = "";
        control = new StringBuffer();
        str = initial.toCharArray();
        reverser();
    }

    private void reverser() {



        int k = 1;
        for (char e : str) {

            control = control.append(e);
            if (k == 4) {
                reversed = reversed + control.reverse().toString();
                control = new StringBuffer();
                k = 0;

            }
            k++;
        }
    }

    public String getReversed() {

        return reversed;
    }


}
