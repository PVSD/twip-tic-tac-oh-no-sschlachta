package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String[][] board = new String[3][3];

        board[0][0] = " ";
        board[0][1] = " ";
        board[0][2] = " ";
        board[1][0] = " ";
        board[1][1] = " ";
        board[1][2] = " ";
        board[2][0] = " ";
        board[2][1] = " ";
        board[2][2] = " ";

        System.out.println("  0 1 2");
        for(int i = 0; i < board.length; i++){
            System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);

        }

        System.out.println("Welcome to Tic Tac Toe! Would you like to be X's or O's?");
        Scanner askUser = new Scanner(System.in);
        String xoUser = askUser.next();

        if(xoUser.equalsIgnoreCase("X")){

            System.out.println("Great! What row would you like to put your first 'X' in?");
            Scanner firstCoor = new Scanner(System.in);
            int fc = firstCoor.nextInt();

            System.out.println("Awesome! Now what column would you like to place your 'X' in?");
            Scanner secondCoor = new Scanner(System.in);
            int sc = secondCoor.nextInt();

            board[fc][sc] = "X";

        }

    }
}
