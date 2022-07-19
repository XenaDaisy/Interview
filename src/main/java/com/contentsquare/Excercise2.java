package com.contentsquare;

public class Excercise2 {


int[] output;

    public static void main(String[] args) {
        int[] input = {2,12,7,15,7,7};
        int target = 9;

        for (int i = 0; i < input.length; i++ ){


            for (int j = i+1; j < input.length; j++){
               if (input[i] + input[j] == target) {
                   System.out.println("our indices are: " + i +  " and " + j);
               }

            }


            }

        }

    }




