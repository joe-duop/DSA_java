package com.joe.intro;

import java.util.HashMap;
import java.util.Map;

public class task2 {

    public static void main(String[] args) {
        Map<String,String> theBoard = new HashMap<>();
        theBoard.put("top_l", " ");
        theBoard.put("top_m", " ");
        theBoard.put("top_r", " ");

        theBoard.put("mid_l", " ");
        theBoard.put("mid_m", "x");
        theBoard.put("mid_r", " ");

        theBoard.put("low_l", " ");
        theBoard.put("low_m", " ");
        theBoard.put("low_r", "o");

        printBoard(theBoard);
    }

    private static void printBoard(Map<String, String> board){
        System.out.println(board.get("top_l") + "|" + board.get("top_m") + "|" + board.get("top_r"));
        System.out.println("-+-+-");
        System.out.println(board.get("mid_l") + "|" + board.get("mid_m") + "|" + board.get("mid_r"));
        System.out.println("-+-+-");
        System.out.println(board.get("low_l") + "|" + board.get("low_m") + "|" + board.get("low_r"));
    }
}
