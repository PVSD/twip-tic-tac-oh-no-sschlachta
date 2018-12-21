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

            System.out.println("Cool move! Now it's my turn!");

            if(board[fc][sc] != board[0][0]){

                board[0][0] = compSign;

            } else if(board[fc][sc] != board[0][2]){

                board[0][2] = compSign;

            } else if(board[fc][sc] != board[2][0]){

                board[2][0] = compSign;

            } else if(board[fc][sc] != board[1][1]){

                board[1][1]= compSign;

            } else if(board[fc][sc] != board[1][0]) {

                board[1][0] = compSign;

            } else if(board[fc][sc] != board[1][2]){

                board[1][2] = compSign;

            } else if(board[fc][sc] != board[0][1]){

                board[0][1] = compSign;

            } else if(board[fc][sc] != board[2][1]){

                board[2][1] = compSign;

            }

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }

            System.out.println("Your turn again! What row would you like to place your 'X'?");
            Scanner secMove = new Scanner(System.in);
            int sm = secMove.nextInt();

            System.out.println("And the column?");
            Scanner secMoveCor = new Scanner(System.in);
            int smc = secMoveCor.nextInt();

            board[sm][smc] = "X";

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }

            System.out.println("My turn again!");

            if(fc == sm){

                board[fc][!]

            } else if(sc == smc){

                int myMove = sc + smc;
                int realMove = 3 - myMove;
                board[sc][realMove] = compSign;

            }

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

            System.out.println("Good move! Now it's my turn!");

           if(board[fc][sc] != board[0][0]){

               board[0][0] = compSign;

           } else if(board[fc][sc] != board[0][2]){

               board[0][2] = compSign;

           } else if(board[fc][sc] != board[2][0]){

               board[2][0] = compSign;

           } else if(board[fc][sc] != board[1][1]){

               board[1][1]= compSign;

           } else if(board[fc][sc] != board[1][0]) {

               board[1][0] = compSign;

           } else if(board[fc][sc] != board[1][2]){

               board[1][2] = compSign;

           } else if(board[fc][sc] != board[0][1]){

               board[0][1] = compSign;

           } else if(board[fc][sc] != board[2][1]){

               board[2][1] = compSign;

           }

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }


            System.out.println("Your turn again! What row would you like to place your 'X'?");
            Scanner secMove = new Scanner(System.in);
            int sm = secMove.nextInt();

            System.out.println("And the column?");
            Scanner secMoveCor = new Scanner(System.in);
            int smc = secMoveCor.nextInt();

            board[sm][smc] = "X";

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }

            System.out.println("My turn again!");

            if(fc == sm){

                int myMove = fc + sm;
                int realMove = 3 - myMove;
                board[fc][realMove] = compSign;

            } else if(sc == smc){

                int myMove = sc + smc;
                int realMove = 3 - myMove;
                board[sc][realMove] = compSign;

                }

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }

            }

        }

    }
