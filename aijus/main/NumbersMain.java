package com.aijus.main;

import java.util.List;
import java.util.ArrayList;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import com.aijus.math.FibonacciNumber;
import com.aijus.math.PrimesNumber;

public class NumbersMain {
    public static void main( String[] args ) throws IOException {


      System.out.println("��N�Ԗڂ̃t�B�{�i�b�`�� �y�� �t�B�{�i�b�`�����\�����܂��B");

      do{
          System.out.println("���͂��Ă��������B( exit �܂��� quit�ŏI�����܂��B)");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();


                if (input.equals("exit") || input.equals("quit")) {
                  System.out.println("�v���O�������I�����܂��B");
                    break;
                }

                long numl = Long.parseLong(input);
                if(numl >= 1L && numl <= 70L) {
                    int num = Integer.parseInt( input );
                    FibonacciNumber fibonacci = new FibonacciNumber( num );
                    PrimesNumber primes =new PrimesNumber(num);

                    System.out.println("��"+ num + "�Ԗڂ̑f���@: "+ primes.getNumber());

                    System.out.println("��" + num + "�Ԗڂ̃t�B�{�i�b�`���@ : " + fibonacci.getNumber());

                    System.out.print("��" + num + "�Ԗڂ̃t�B�{�i�b�`���� : ");
                    String separator = "";
                    for ( Number fibonacciI : fibonacci.getNumbers() ) {
                        System.out.print(separator + fibonacciI);
                        separator = " , ";
                    }
                    System.out.println("");
                }
                else {
                  System.out.print("���l��1�ȏ�70�ȉ���");
                }
            }
            catch ( NumberFormatException e ) {
              System.out.println("������̓��͂� exit �܂��� quit �����󂯕t���܂���B");
              System.out.print("������x");
          }
          catch ( OutOfMemoryError e ) {
              System.out.println("���l���傫�����邽�ߌv�Z�ł��܂���B");
              System.out.print("������x");
            }
        }
        while( true );
    }
}
