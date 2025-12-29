//Item Class for storing different attributes of an item in a warehouse
package com.transport;

public class Item{
    byte Category;//goes from 1 too 100
    short warehouseZone;//goes till 32,627 in theory
    int quantity;//standard to store quantity of stock 
    long trackingNumber;//can go as long as 18 digits
    float weight;//Item weight can use decimals
    double temp;//Scientific accuracy needed for delicate items
    char shippingGrade;//store single character 'A' 'B' 'C'
    boolean isFragile;//stores true or false
    String productName;//stores the name of the product
}