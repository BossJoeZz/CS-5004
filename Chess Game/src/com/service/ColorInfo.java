package com.service;


/**
 * The ColorInfo class provides a utility method for formatting and displaying text in color and style.
 */
public class ColorInfo {

    /**
     * @param colour  color code: background color code (41-46); foreground color code (31-36)
     * @param type    style code: 0 none; 1 bold; 3 italic; 4 underline
     * @param content The content to be printed (distance of six spaces)
     */
    public static String getFormatLogString(String content, int colour, int type) {
        boolean hasType = type != 1 && type != 3 && type != 4;
        if (hasType) {
            return String.format("\033[%dm%s\033[0m", colour, content);
        } else {
            return String.format("\033[%d;%dm%s\033[0m", colour, type, content);
        }
    }

//    public static void main(String[] args) {
//        System.out.println("console color test：");
//        System.out.println(getFormatLogString("[ Red ]", 31, 0));
//        System.out.println(getFormatLogString("[ Yellow ]", 32, 0));
//        System.out.println(getFormatLogString("[ Orange ]", 33, 0));
//        System.out.println(getFormatLogString("[ Blue ]", 34, 0));
//        System.out.println(getFormatLogString("[ Purple ]", 35, 0));
//        System.out.println(getFormatLogString("[ Green ]", 36, 0));
//
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(rand.nextInt(8) + 1);
//        }
//
//    }


}
