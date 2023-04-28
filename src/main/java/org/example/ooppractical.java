package org.example;

public class ooppractical {
    public static void main(String[] args) {
        String s0 = new String("Ali");
        String s1 = "Ahmed Ibrahim Elgeballi";
        String[] splitstring = s1.split("Ibrahim");
//        System.out.println(splitstring[0]);
        for (int i=0; i<=s1.length(); i++) {
            System.out.println(s1.charAt(i));
//            ooppractical g1 = new ooppractical();
            gethello();
        }
    }

    public static void gethello(){
        System.out.println("Hello World!");
        gethello();
    }
}
