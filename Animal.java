import java.util.*;
import java.io.*;



/*
Collections =

Comparable = code goes inside frg. Method takes in one other objects (compareTo())

Comparator  = Code goes in a seperate class. Method Takes two objets (compare())

*/
class Animal{

    String name;
    int legs;
    Animal(String name, int legs){
      this.name = name;
      this.legs = legs;
    }

    public int getLegs(){
      return legs;
    }



}
