package com.in28minutes.java.ProgrammingQuestion;

/**
 * Created by sheik on 5/1/2018.
 */
public class ReverseWords {
    public static String reverseWords(String s) {
          /*
            Assume that the parameter String can only contain spaces and alphanumeric characters.
            Please implement this method to
            reverse each word in the original String while maintaining the         word order.
            For example:
            parameter: "Hello world", result: "olleH dlrow"
           */
        String temp[] = s.split("\\s+"); //split at spaces

        for(int i = 0 ; i<temp.length ; i++)
        {
            temp[i] = new StringBuilder(temp[i]).reverse().toString();
        }

        String fin = "";

        for(int j = 0 ; j< temp.length ; j++)
        {
            fin += temp[j]+ " ";

        }
        return fin;
    }


}
