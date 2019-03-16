
package dataStructures;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * @file LinkedList.java
 * @description This program collects polynomials according to the data that read from the file.
 * First line is value of x other lines are splitted with * for passing new polynomial.
 * @assignment Homework01
 * @date Mar 7, 2019 , 6:56:17 PM
 * @author mertagcakoyun
 */
public class LinkedList<T> {

    private Node<T> head;
    private int total=0;

    void add(T coefficient, T power) throws FileNotFoundException {
        Node<T> newNode = new Node<>(coefficient, power);
        Node<T> tmp = head;
        File file = new File("/Users/mertagcakoyun/Desktop/VeriYapilari/veri.txt");
        Scanner scanner = new Scanner(file);
        int x = scanner.nextInt();
        if (head == null) {
            head = newNode; //newNode has been added to HEAD

        } else {
            while (tmp != null) {

                if (Integer.parseInt(tmp.power.toString()) > Integer.parseInt(newNode.power.toString())) {

                    if (tmp.listNext != null && Integer.parseInt(tmp.listNext.power.toString()) < Integer.parseInt(newNode.power.toString())) {
                        newNode.listNext = tmp.listNext; //newNode has been added to between two nodes
                        tmp.listNext = newNode;

                        break;
                    } else if (tmp.listNext == null) {//newNode has been added to LAST
                        tmp.listNext = newNode;

                        break;
                    } else {
                        tmp = tmp.listNext; //Crossed to the next node

                    }

                } else if (Integer.parseInt(tmp.power.toString()) < Integer.parseInt(newNode.power.toString())) {
                    newNode.listNext = head;    //newNode has been added to FIRST
                    head = newNode;

                    break;
                } else {
                    addToUnder(tmp, newNode);
                    break;
                }

            }

        }

    total+=  (int) (Integer.parseInt(newNode.coefficient.toString())*Math.pow(x,Integer.parseInt(newNode.power.toString()))); // every newNodes are added to total
    }

    void addToUnder(Node<T> fNode, Node<T> newNode) {
        fNode.nodeTmp = fNode;
        while (fNode.nodeTmp.nodeNext != null) {
            fNode.nodeTmp = fNode.nodeTmp.nodeNext;
        }
        fNode.nodeTmp.nodeNext = newNode;   //newNode has been added to under of node that have same power
        fNode.nodeTmp = newNode;


    }
    void print() {
        Node<T> temp = head;
        Node<T> NodeTemp;

        while (temp != null) {
            NodeTemp = temp;
            System.out.print(temp.coefficient + ", " + temp.power + " -> ");
            while (NodeTemp.nodeNext != null) {
                System.out.print(NodeTemp.nodeNext.coefficient + ", " + NodeTemp.nodeNext.power+" -> ");
                NodeTemp = NodeTemp.nodeNext;

            }
            temp = temp.listNext;

        }

        System.out.println("null");
    }

    void printNewPolynomial() {
        Node<T> temp = head;
        Node<T> NodeTemp;

        while (temp != null) {
            NodeTemp = temp;
            System.out.print("[ ");
            System.out.print("("+temp.coefficient + "x^" + temp.power + ")");
            while (NodeTemp.nodeNext != null) {
                System.out.print(" + ("+NodeTemp.nodeNext.coefficient+ "x^"  + NodeTemp.nodeNext.power +") ");

                NodeTemp = NodeTemp.nodeNext;

            }
            if (temp.listNext == null) {    ////This control do that: When printed new polynomial, it must not adding + after last node
                System.out.print(" ]");
            } else {
                System.out.print(" ] + ");
            }
            temp = temp.listNext;
        }

        System.out.println(" = "+sum());
    }

    int sum(){
    return total;}
}
