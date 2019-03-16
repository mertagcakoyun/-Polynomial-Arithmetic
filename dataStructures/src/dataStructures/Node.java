
package dataStructures;

/**
 * @file Node.java
 * @description This program collects polynomials according to the data that read from the file. 
 * First line is value of x other lines are splitted with * for passing new polynomial.
 * @assignment Homework01
 * @date Mar 7, 2019 , 6:55:57 PM
 * @author mertagcakoyun
  */
public class Node<T> {
    
    Node<T> nodeNext;   //  It used for processes between nodes that have equal power
    Node<T> listNext;   //  It used for process on LinkedList
    Node<T> nodeTmp;    //  It used for remainder.
    T power, coefficient;

    public Node(T coefficient, T power) {
        this.power = power;
        this.coefficient = coefficient;
    }
    
    
    
}
