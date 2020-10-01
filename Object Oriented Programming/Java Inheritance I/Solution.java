// github.com/andy489

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}
//since the Bird class is inheriting Animal class. It make Bird class to have characteristics of Animal class i.e. objects of bird can access members of animal.
class Bird extends Animal {               
    void fly() {
        System.out.println("I am flying");
    }
    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {
   public static void main(String args[]) {
      Bird bird = new Bird();
      bird.walk();   //object of Bird calling member function of Animal class.
      bird.fly();
      bird.sing();
   }
}
