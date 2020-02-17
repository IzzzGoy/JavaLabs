package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File sin = new File("sin.txt");
        File input = new File("input.txt");

        PrintWriter printWriter = new PrintWriter(sin);

        FileReader sinFileReader = new FileReader(sin);
        FileReader inputFileReader = new FileReader(input);

        BufferedReader sinBufferedReader = new BufferedReader(sinFileReader);
        BufferedReader inputBufferReader = new BufferedReader(inputFileReader);
        //first task
        try {
            for (int i = 0; i < 360; i++) {
                printWriter.println(Math.sin(i));
            }
            printWriter.flush();
        } catch (Throwable th) {
            /**/
        } finally {
            printWriter.close();
        }



        //second task

        double[] sins = new double[360];

        try {
            for (int i = 0; i < sins.length; ++i){
                sins[i] = Double.parseDouble(sinBufferedReader.readLine());
            }
            System.out.println(sins[Integer.parseInt(inputBufferReader.readLine())]);
        } catch (Throwable th) {
            /**/
        } finally {
            inputFileReader.close();
            sinFileReader.close();
        }


        //third task

        FileOutputStream fosSin = new FileOutputStream("sin2.dat");
        ObjectOutputStream oosSin = new ObjectOutputStream(fosSin);

        FileInputStream fisSin = new FileInputStream("sin2.dat");
        ObjectInputStream oisSin = new ObjectInputStream(fisSin);

        double[] sins3 = new double[360];

        try {


            oosSin.writeObject(sins);
            oosSin.flush();

            double[] sins2 = (double[]) oisSin.readObject();
            System.out.println("first method: " + Arrays.toString(sins2));

            for (double el : sins) {
                oosSin.writeDouble(el);
                oosSin.flush();
            }
            oosSin.flush();

            for (int i = 0; i < sins3.length; i++) {
                double deSerilazeble = oisSin.readDouble();
                sins3[i] = deSerilazeble;
            }
        } catch (Throwable th) {
            /**/
        } finally {
            oosSin.close();
            oisSin.close();
            fisSin.close();
            fosSin.close();
        }


        System.out.println("second method: " + Arrays.toString(sins3));
    }
}
