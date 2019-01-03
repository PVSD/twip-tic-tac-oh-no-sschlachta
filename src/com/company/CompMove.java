package com.company;

/**
 * Created by ss772 on 1/3/19.
 */

public class CompMove {


    void CompMove(String[][]){
    }

    public String makeMove(String a[][]){

        if(a[0][0] == " "){

            a[0][0] = "O";

        } else if(a[0][2] == " "){

            a[0][2] = "O";

        } else if(a[2][0] == " "){

            a[2][0] = "O";

        } else if(a[1][1] == " "){

            a[1][1]= "O";

        } else if(a[1][0] == " ") {

            a[1][0] = "O";

        } else if(a[1][2] == " "){

            a[1][2] = "O";

        } else if(a[0][1] == " "){

            a[0][1] = "O";

        } else if(a[2][1] == " "){

            a[2][1] = "O";

        }

    }

}
