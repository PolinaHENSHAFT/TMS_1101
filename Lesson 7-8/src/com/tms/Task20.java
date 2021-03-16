package com.tms;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class Task20 {

    public static void main(String[] args)  {


        String text1 = "Teach me gall tell hello ";
        String regex = "\\w\\b";
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text1);
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }
        System.out.println(stringBuilder);
    }
}
