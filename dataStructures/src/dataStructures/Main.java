
package dataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @file Test.java
 * @description This program collects polynomials according to the data that read from the file.
 * First line is value of x other lines are splitted with * for passing new polynomial.
 * @assignment Homework01
 * @date Mar 7, 2019 , 6:55:10 PM
 * @author mertagcakoyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> list = new LinkedList<>();
        String filePath="/Users/mertagcakoyun/Desktop/dataStructures/veri.txt"; //    "/Users/userName/DocumentName/FileName.txt"
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int x = scanner.nextInt();          //First line is x value.
        System.out.println("x : " + x);
        int polynomialCounter = 0;
        while (scanner.hasNextLine()) {     // Reading file Line by Line
            String line = scanner.nextLine();
            if (line.contains(",") && !line.contains("*")) {
                String ListOfSplit[] = line.split(",");
                ListOfSplit[1] = ListOfSplit[1].substring(1);
                list.add(ListOfSplit[0], ListOfSplit[1]);

            } else {
                polynomialCounter++;
            }

        }
        list.print();
        System.out.println("Total of polynomials : " + list.sum()); 
        System.out.println("Number of polynomials =" + polynomialCounter);
        list.printNewPolynomial();
    }

}
