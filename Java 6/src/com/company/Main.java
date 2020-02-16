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
        for (int i = 0; i < 360; i++) {
            printWriter.println(Math.sin(i));
        }
        printWriter.flush();

        //second task
        double[] sins = new double[360];
        for (int i = 0; i < 360; ++i){
            sins[i] = Double.parseDouble(sinBufferedReader.readLine());
        }
        System.out.println(sins[Integer.parseInt(inputBufferReader.readLine())]);
        printWriter.close();
        inputFileReader.close();
        sinFileReader.close();
        //third task
        FileOutputStream fosSin = new FileOutputStream("sin2.dat");
        ObjectOutputStream oosSin = new ObjectOutputStream(fosSin);

        FileInputStream fisSin = new FileInputStream("sin2.dat");
        ObjectInputStream oisSin = new ObjectInputStream(fisSin);

        oosSin.writeObject(sins);
        oosSin.flush();
        //oosSin.close();

        double[] sins2 = (double[]) oisSin.readObject();
        System.out.println("first method: " + Arrays.toString(sins2));

        for (double el : sins) {
            oosSin.writeDouble(el);
            oosSin.flush();
        }
        oosSin.flush();
        double[] sins3 = new double[360];
        for (int i = 0; i < sins3.length; i++) {
            double deSerilazeble = oisSin.readDouble();
            sins3[i] = deSerilazeble;
        }
        oosSin.close();
        oisSin.close();
        fisSin.close();
        fosSin.close();
        System.out.println("second method: " + Arrays.toString(sins3));
    }
}
