package com.perscholas.java_basics;

public class Main {
      static void IntBinary(){
          // Write the following integers in binary notation
       /* 1
          o	8
          o	33
          o	78
          o	787
          o	33,987 */

          int myInt =  1;
          int myInt2 = 8;
          int myInt3 = 33;
          int myInt4 = 78;
          int myInt5 = 787;
          int myInt6 = 33987;
          System.out.println(Integer.toBinaryString(myInt));
          System.out.println(Integer.toBinaryString(myInt2));
          System.out.println(Integer.toBinaryString(myInt3));
          System.out.println(Integer.toBinaryString(myInt4));
          System.out.println(Integer.toBinaryString(myInt5));
          System.out.println(Integer.toBinaryString(myInt6));

      }

      static void BinaryToDouble(){
         // Writte binary into double notation
        /*  0010                    2
          1001                    1+8= 9
          0011 0100               4+16+32= 52
          0111 0010               2+16+32+64= 114
          0010 0001 1111          1+2+4+8+16+512= 543
          0010 1100 0110 0111     1+2+4+ 32+64+ 1024+2048 +8192= 11,367*/
      }
        static void ShiftOperator(){
      System.out.println("================================================================>");
          // use the left shift operator (<<) to shift by 1 and assign the result to x.
            int x = 2;
            System.out.println(Integer.toBinaryString(x));
            x <<= 1;


            x = 9;
            System.out.println(Integer.toBinaryString(x));
            x <<= 1;

            x = 17;
            System.out.println(Integer.toBinaryString(x));
            x <<= 1;


            x = 88;
            System.out.println(Integer.toBinaryString(x));
            x <<= 1;
            System.out.println(Integer.toBinaryString(x));

        }
         static void RightShift(){
             // use the left shift operator (<<) to shift by 1 and assign the result to x.
             int x = 150;
             System.out.println(Integer.toBinaryString(x));
             x >>= 2;


             x = 255;
             System.out.println(Integer.toBinaryString(x));
             x >>= 2;


             x = 1555;
             System.out.println(Integer.toBinaryString(x));
             x >>= 2;


             x = 32456;
             System.out.println(Integer.toBinaryString(x));
             x >>= 2;

         }
          static void Int3(){
            int x = 7, y = 17 ;
              System.out.println(Integer.toBinaryString(x ));
              System.out.println(Integer.toBinaryString(y ));
          }
      static void Increment(){
          int x = 2;
          System.out.println(x);
              ++x;
          System.out.println(x);
      }
      static void IncrementThree(){
          System.out.println("===========>");
          int x = 4;
              x++;
          System.out.println(x);
               ++x;
          System.out.println(x);
               x+=1;
          System.out.println(x);
      }
      static void IntTwo(){
          // postfix increement
          int x = 5, y = 8;
          int sum = (x++) + y;
          System.out.println(sum);

      }
    public static void main(String[] args) {
	// write your code here
        IntBinary();
        ShiftOperator();
        Increment();
        IncrementThree();
        IntTwo();
    }
}
