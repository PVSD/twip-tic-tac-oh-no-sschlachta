package com.company;
import java.util.Random;
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
        for (int i = 0; i < board.length; i++) {
            System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);

        }

        System.out.println("Welcome to Tic Tac Toe! Would you like to be X's or O's?");
        Scanner askUser = new Scanner(System.in);
        String xoUser = askUser.next();
        String compSign;

        if (xoUser.equalsIgnoreCase("X")) {

            compSign = "O";

            System.out.println("Great! What row would you like to put your first 'X' in?");
            Scanner firstCoor = new Scanner(System.in);
            int fc = firstCoor.nextInt();

            System.out.println("Awesome! Now what column would you like to place your 'X' in?");
            Scanner secondCoor = new Scanner(System.in);
            int sc = secondCoor.nextInt();

            board[fc][sc] = "X";

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);

            }

        } else if (xoUser.equalsIgnoreCase("O")) {

            compSign = "X";

            System.out.println("Great! What row would you like to put your first 'O' in?");
            Scanner firstCoor = new Scanner(System.in);
            int fc = firstCoor.nextInt();

            System.out.println("Awesome! Now what column would you like to place your 'O' in?");
            Scanner secondCoor = new Scanner(System.in);
            int sc = secondCoor.nextInt();

            board[fc][sc] = "O";

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);

            }

        }

        System.out.println("Good move! Now it's my turn!");

        Random compcor1 = new Random();
        int firstcomp = compcor1.nextInt(3);

        Random compcor2 = new Random();
        int secondcomp = compcor2.nextInt(3);

        if(board[firstcomp][secondcomp].equalsIgnoreCase(" ")){

            board

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);

            }

        } else {



        }

    }
}
