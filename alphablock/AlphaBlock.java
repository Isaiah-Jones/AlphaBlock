/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphablock;

/**
 *
 * @author Isaiah
 *
 */
//Create a 2-dimensional array
//Fill it up (half Upper Case, half Lower Case)
//Print the content of the Array
//Print out how many times each appears in the array
public class AlphaBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a two dimensional array
        char[][] numbuh2D = new char[10][10];

        //Fill up the array with random letters
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numbuh2D.length; j++) {
                numbuh2D[i][j] = AlphaBlock.getRandomUpperCaseLetter();
            }
        }
        for (int i = 5; i < numbuh2D.length; i++) {
            for (int j = 0; j < numbuh2D.length; j++) {
                numbuh2D[i][j] = AlphaBlock.getRandomLowerCaseLetter();
            }
        }
        
        //Print out the array in a 10x10 grid
        for (int i = 0; i < numbuh2D.length; i++) {
            for (int j = 0; j < numbuh2D.length; j++) {
                if (j == 9) {
                    System.out.println(numbuh2D[i][j] + " ");
                } else {
                    System.out.print(numbuh2D[i][j] + " ");
                }
            }
        }
        System.out.println();

        //Count the number of times each letter occurs
        int[] letterStore = new int[52];

        for (int i = 0; i < numbuh2D.length; i++) {
            for (int j = 0; j < numbuh2D.length; j++) {
                switch (numbuh2D[i][j]) {

                    case 'A':
                        letterStore[0]++;
                        break;
                    case 'B':
                        letterStore[1]++;
                        break;
                    case 'C':
                        letterStore[2]++;
                        break;
                    case 'D':
                        letterStore[3]++;
                        break;
                    case 'E':
                        letterStore[4]++;
                        break;
                    case 'F':
                        letterStore[5]++;
                        break;
                    case 'G':
                        letterStore[6]++;
                        break;
                    case 'H':
                        letterStore[7]++;
                        break;
                    case 'I':
                        letterStore[8]++;
                        break;
                    case 'J':
                        letterStore[9]++;
                        break;
                    case 'K':
                        letterStore[10]++;
                        break;
                    case 'L':
                        letterStore[11]++;
                        break;
                    case 'M':
                        letterStore[12]++;
                        break;
                    case 'N':
                        letterStore[13]++;
                        break;
                    case 'O':
                        letterStore[14]++;
                        break;
                    case 'P':
                        letterStore[15]++;
                    case 'Q':
                        letterStore[16]++;
                        break;
                    case 'R':
                        letterStore[17]++;
                        break;
                    case 'S':
                        letterStore[18]++;
                        break;
                    case 'T':
                        letterStore[19]++;
                        break;
                    case 'U':
                        letterStore[20]++;
                        break;
                    case 'V':
                        letterStore[21]++;
                        break;
                    case 'W':
                        letterStore[22]++;
                    case 'X':
                        letterStore[23]++;
                        break;
                    case 'Y':
                        letterStore[24]++;
                        break;
                    case 'Z':
                        letterStore[25]++;
                        break;
                    case 'a':
                        letterStore[26]++;
                        break;
                    case 'b':
                        letterStore[27]++;
                        break;
                    case 'c':
                        letterStore[28]++;
                        break;
                    case 'd':
                        letterStore[29]++;
                        break;
                    case 'e':
                        letterStore[30]++;
                        break;
                    case 'f':
                        letterStore[31]++;
                        break;
                    case 'g':
                        letterStore[32]++;
                        break;
                    case 'h':
                        letterStore[33]++;
                        break;
                    case 'i':
                        letterStore[34]++;
                        break;
                    case 'j':
                        letterStore[35]++;
                        break;
                    case 'k':
                        letterStore[36]++;
                        break;
                    case 'l':
                        letterStore[37]++;
                        break;
                    case 'm':
                        letterStore[38]++;
                        break;
                    case 'n':
                        letterStore[39]++;
                        break;
                    case 'o':
                        letterStore[40]++;
                        break;
                    case 'p':
                        letterStore[41]++;
                        break;
                    case 'q':
                        letterStore[42]++;
                        break;
                    case 'r':
                        letterStore[43]++;
                        break;
                    case 's':
                        letterStore[44]++;
                        break;
                    case 't':
                        letterStore[45]++;
                        break;
                    case 'u':
                        letterStore[46]++;
                        break;
                    case 'v':
                        letterStore[47]++;
                        break;
                    case 'w':
                        letterStore[48]++;
                        break;
                    case 'x':
                        letterStore[49]++;
                        break;
                    case 'y':
                        letterStore[50]++;
                        break;
                    case 'z':
                        letterStore[51]++;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }

            }
        }
        //Print out Upper Case letters
        for (char b = 'A'; b <= 'Z'; b++) {
            if (b == 'Z') {
                System.out.println(b);
            } else {
                System.out.print(b + " ");
            }
        }
        //Print out the number of occurances
        for (int i = 0; i < 26; i++) {
            if (i == 25) {
                System.out.println(letterStore[i]);
            } else {
                System.out.print(letterStore[i] + " ");
            }
        }
        
        System.out.println();
        
        //Print out LowerCase letters
        for (char b = 'a'; b <= 'z'; b++) {
            if (b == 'z') {
                System.out.println(b);
            } else {
                System.out.print(b + " ");
            }
        }
        //Print out the number of ocurrances
        for (int i = 26; i < 52; i++) {
            if (i == 52) {
                System.out.println(letterStore[i]);
            } else {
                System.out.print(letterStore[i] + " ");
            }
        }
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomCharacter(char a, char z) {
        return (char) (a + Math.random() * (z - a + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

}
