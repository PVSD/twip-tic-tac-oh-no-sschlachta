package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Arrays;


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

        System.out.println("Welcome to Tic Tac Toe! Today you will be 'X', and I'll even let you go first!");

        String compSign = "O";

        System.out.println("Now, pick a row to put your first 'X' in!");
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

        System.out.println("Good move! Now it's my turn!");


        List<Integer> pref1 = Arrays.asList(0, 2);
        Random rand = new Random();
        int cfm = pref1.get(rand.nextInt(pref1.size()));

        List<Integer> pref2 = Arrays.asList(0, 2);
        Random ran = new Random();
        int csm = pref2.get(ran.nextInt(pref2.size()));

        List<Integer> pref3 = Arrays.asList(0, 1, 2);
        Random ra = new Random();
        int ctm = pref3.get(ra.nextInt(pref3.size()));


        if (board[cfm][csm] == " ") {

            board[cfm][csm] = "O";

        } else if (board[1][1] == " ") {

            board[1][1] = "O";

        } else if (board[ctm][1] == " ") {

            board[ctm][1] = "O";

        } else if (board[1][ctm] == " ") {

            board[1][ctm] = "O";

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


        if (board[sm][smc] == " ") {

            board[sm][smc] = "X";

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }

            System.out.println("My turn again!");

            if (fc == sm) {

                if (board[fc][0] == " ") {

                    board[fc][0] = "O";

                } else if (board[fc][1] == " ") {

                    board[fc][1] = "O";

                } else if (board[fc][2] == " ") {

                    board[fc][2] = "O";

                }

            } else if (sc == smc) {

                if (board[0][sc] == " ") {

                    board[0][sc] = "O";

                } else if (board[1][sc] == " ") {

                    board[1][sc] = "O";

                } else if (board[2][sc] == " ") {

                    board[2][sc] = "O";

                }

            } else if ((fc == sc) && (sm == smc)) {

                if (board[1][1] == " ") {

                    board[1][1] = "O";

                } else if (board[0][0] == " ") {

                    board[0][0] = "O";

                } else if (board[2][2] == " ") {

                    board[2][2] = "O";

                }

            } else if (board[0][2] == " ") {

                board[0][2] = "O";

            } else if (board[1][1] == " ") {

                board[1][1] = "O";

            } else if (board[2][0] == " ") {

                board[2][0] = "O";

            } else {

                if (board[cfm][csm] == " ") {

                    board[cfm][csm] = "O";

                } else if (board[1][1] == " ") {

                    board[1][1] = "O";

                } else if (board[ctm][1] == " ") {

                    board[ctm][1] = "O";

                } else if (board[1][ctm] == " ") {

                    board[1][ctm] = "O";

                }

            }

            System.out.println("  0 1 2");
            for (int i = 0; i < board.length; i++) {
                System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
            }

            System.out.println("And now it's back to you! What row would you like next?");
            Scanner thirdMove = new Scanner(System.in);
            int tmfc = thirdMove.nextInt();

            System.out.println("Awesome! And the column?");
            Scanner thirdMove2 = new Scanner(System.in);
            int tmsc = thirdMove2.nextInt();

            if (board[tmfc][tmsc] == " ") {

                board[tmfc][tmsc] = "X";

                System.out.println("  0 1 2");
                for (int i = 0; i < board.length; i++) {
                    System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
                }

                System.out.println("Wicked move! Now it's my turn again!");


                if (fc == tmfc) {

                    if (board[fc][0] == " ") {

                        board[fc][0] = "O";

                    } else if (board[fc][1] == " ") {

                        board[fc][1] = "O";

                    } else if (board[fc][2] == " ") {

                        board[fc][2] = "O";

                    }

                } else if (sc == tmsc) {

                    if (board[0][sc] == " ") {

                        board[0][sc] = "O";

                    } else if (board[1][sc] == " ") {

                        board[1][sc] = "O";

                    } else if (board[2][sc] == " ") {

                        board[2][sc] = "O";

                    }

                } else if ((fc == sc) && (tmfc == tmsc)) {

                    if (board[1][1] == " ") {

                        board[1][1] = "O";

                    } else if (board[0][0] == " ") {

                        board[0][0] = "O";

                    } else if (board[2][2] == " ") {

                        board[2][2] = "O";

                    }

                } else if (board[0][2] == " ") {

                    board[0][2] = "O";

                } else if (board[1][1] == " ") {

                    board[1][1] = "O";

                } else if (board[2][0] == " ") {

                    board[2][0] = "O";

                } else if (sm == tmfc) {

                    if (board[sm][0] == " ") {

                        board[sm][0] = "O";

                    } else if (board[sm][1] == " ") {

                        board[sm][1] = "O";

                    } else if (board[sm][2] == " ") {

                        board[sm][2] = "O";

                    }

                } else if (smc == tmsc) {

                    if (board[0][smc] == " ") {

                        board[0][smc] = "O";

                    } else if (board[1][smc] == " ") {

                        board[1][smc] = "O";

                    } else if (board[2][smc] == " ") {

                        board[2][smc] = "O";

                    }

                } else if ((sm == smc) && (tmfc == tmsc)) {

                    if (board[1][1] == " ") {

                        board[1][1] = "O";

                    } else if (board[0][0] == " ") {

                        board[0][0] = "O";

                    } else if (board[2][2] == " ") {

                        board[2][2] = "O";

                    }

                } else if (board[0][2] == " ") {

                    board[0][2] = "O";

                } else if (board[1][1] == " ") {

                    board[1][1] = "O";

                } else if (board[2][0] == " ") {

                    board[2][0] = "O";

                } else {

                    if (board[cfm][csm] == " ") {

                        board[cfm][csm] = "O";

                    } else if (board[1][1] == " ") {

                        board[1][1] = "O";

                    } else if (board[ctm][1] == " ") {

                        board[ctm][1] = "O";

                    } else if (board[1][ctm] == " ") {

                        board[1][ctm] = "O";

                    }
                }

                System.out.println("  0 1 2");
                for (int i = 0; i < board.length; i++) {
                    System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
                }

                System.out.println("Back to you! Your Row?");
                Scanner fourthMove = new Scanner(System.in);
                int fom = fourthMove.nextInt();

                System.out.println("Column?");
                Scanner fourthMove2 = new Scanner(System.in);
                int fomsc = fourthMove2.nextInt();

                if (board[fom][fomsc] == " ") {

                    board[fom][fomsc] = "X";

                    System.out.println("  0 1 2");
                    for (int i = 0; i < board.length; i++) {
                        System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
                    }

                    if ((board[0][0] == "X") && (board[0][1] == "X") && (board[0][2] == "X")) {

                        System.out.println("Congrats, you beat me! Let's play again sometime!");

                    } else if ((board[1][0] == "X") && (board[1][1] == "X") && (board[1][2] == "X")) {

                        System.out.println("You were a worthy opponent, it was an honor to play against you: Congrats on your Win!");

                    } else if ((board[2][0] == "X") && (board[2][1] == "X") && (board[2][2] == "X")) {

                        System.out.println("I am defeated! Congratulations!");

                    } else if ((board[0][0] == "X") && (board[1][0] == "X") && (board[2][0] == "X")) {

                        System.out.println("You won! Congrats!");

                    } else if ((board[0][1] == "X") && (board[1][1] == "X") && (board[2][1] == "X")) {

                        System.out.println("Bested by a human! Congrats on your win!");

                    } else if ((board[0][2] == "X") && (board[1][2] == "X") && (board[2][2] == "X")) {

                        System.out.println("You won! Congratulations!");

                    } else if ((board[0][0] == "X") && (board[1][1] == "X") && (board[2][2] == "X")) {

                        System.out.println("Diagonals were always my worst enemy, congrats on winning!");

                    } else if ((board[2][0] == "X") && (board[1][1] == "X") && (board[0][2] == "X")) {

                        System.out.println("You won this time...");

                    } else {

                        System.out.println("My turn!");


                        if (board[cfm][csm] == " ") {

                            board[cfm][csm] = "O";

                        } else if (board[1][1] == " ") {

                            board[1][1] = "O";

                        } else if (board[ctm][1] == " ") {

                            board[ctm][1] = "O";

                        } else if (board[1][ctm] == " ") {

                            board[1][ctm] = "O";

                        }

                        System.out.println("  0 1 2");
                        for (int i = 0; i < board.length; i++) {
                            System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
                        }

                        if ((board[0][0] == "O") && (board[0][1] == "O") && (board[0][2] == "O")) {

                            System.out.println("I won! Let's play again sometime!");

                        } else if ((board[1][0] == "O") && (board[1][1] == "O") && (board[1][2] == "O")) {

                            System.out.println("I win!");

                        } else if ((board[2][0] == "O") && (board[2][1] == "O") && (board[2][2] == "O")) {

                            System.out.println("I am victorious!");

                        } else if ((board[0][0] == "O") && (board[1][0] == "O") && (board[2][0] == "O")) {

                            System.out.println("I won!");

                        } else if ((board[0][1] == "O") && (board[1][1] == "O") && (board[2][1] == "O")) {

                            System.out.println("I have bested you!");

                        } else if ((board[0][2] == "O") && (board[1][2] == "O") && (board[2][2] == "O")) {

                            System.out.println("I won!");

                        } else if ((board[0][0] == "O") && (board[1][1] == "O") && (board[2][2] == "O")) {

                            System.out.println("I won!");

                        } else if ((board[2][0] == "O") && (board[1][1] == "O") && (board[0][2] == "O")) {

                            System.out.println("I won!");

                        } else {

                            System.out.println("Alrighty, your turn again! Row?");
                            Scanner fifMove = new Scanner(System.in);
                            int fim1 = fifMove.nextInt();

                            System.out.println("Row?");
                            Scanner fifMove2 = new Scanner(System.in);
                            int fim2 = fifMove2.nextInt();

                            if (board[fim1][fim2] == " ") {

                                board[fim1][fim2] = "X";

                                System.out.println("  0 1 2");
                                for (int i = 0; i < board.length; i++) {
                                    System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
                                }

                                if ((board[0][0] == "X") && (board[0][1] == "X") && (board[0][2] == "X")) {

                                    System.out.println("Congrats, you beat me! Let's play again sometime!");

                                } else if ((board[1][0] == "X") && (board[1][1] == "X") && (board[1][2] == "X")) {

                                    System.out.println("You were a worthy opponent, it was an honor to play against you: Congrats on your Win!");

                                } else if ((board[2][0] == "X") && (board[2][1] == "X") && (board[2][2] == "X")) {

                                    System.out.println("I am defeated! Congratulations!");

                                } else if ((board[0][0] == "X") && (board[1][0] == "X") && (board[2][0] == "X")) {

                                    System.out.println("You won! Congrats!");

                                } else if ((board[0][1] == "X") && (board[1][1] == "X") && (board[2][1] == "X")) {

                                    System.out.println("Bested by a human! Congrats on your win!");

                                } else if ((board[0][2] == "X") && (board[1][2] == "X") && (board[2][2] == "X")) {

                                    System.out.println("You won! Congratulations!");

                                } else if ((board[0][0] == "X") && (board[1][1] == "X") && (board[2][2] == "X")) {

                                    System.out.println("Diagonals were always my worst enemy, congrats on winning!");

                                } else if ((board[2][0] == "X") && (board[1][1] == "X") && (board[0][2] == "X")) {

                                    System.out.println("You won this time...");

                                } else {

                                    System.out.println("Alas, it's a tie... play again and we'll see who the real winner is!");

                                }

                            } else if (board[fim1][fim2] != " ") {

                                System.out.println("Illegal move, please restart your game.");

                            }

                        }

                    }

                    } else if (board[fom][fomsc] != " ") {

                        System.out.println("Illegal move. Please restart.");

                    }

                } else if (board[tmfc][tmsc] != " ") {

                    System.out.println("Sorry, but that is an illegal move, please restart.");

                }


            } else if (board[sm][smc] != " ") {

                System.out.println("Sorry, but that spot is taken, please restart.");

            }

        }
    }
