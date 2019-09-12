import java.util.*;
import java.io.*;

class Dog extends Animal{


    Dog(String name, int legs){
      super(name, legs);
    }


    public String getName(){
      return name;
    }

    public int getLegs(){
      return legs;
    }

    public String toString(){
      return getName() + " " + getLegs();

    }


}
