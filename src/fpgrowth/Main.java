/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgrowth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kamran
 */
public class Main {

    static int threshold = 10000;
    static String file = "census.dat";


    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        new FPGrowth(new File(file), threshold);
        System.out.println((System.currentTimeMillis() - start));
    }
}
