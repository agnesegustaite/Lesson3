/**
 Calculator.java -- performs simple arithmetic operations
 */

// declare a class named Calculator
public class Calculator {
	
    // declare instance variables -- to represent the state/properties of the objects
    // private double number1, number2;
    // declare an instance variable to store the result of each arithmetic operation
    private double result;
    
    // declare methods -- to implement behaviour/actions
    
    // declare a method called add -- each method describes one behaviour/ task the objects know to perform
    // the method add takes in two parameters i.e. the two numbers the addition is performed on
    public void add(double num1, double num2){
        // add the values corresponding to num1 and numb2 and assign/store
        // the result into the instance variable named result
        result = num1 + num2;
        // display the result of the addition
        System.out.println(num1 + " + " + num2 + " = " + result);
    } // ends the body of the add method
    
    // declare a method called subtract -- each method describes one behaviour/ task the objects know to perform
    // the method subtract takes in two parameters i.e. the two numbers the subtraction is performed on
    public void subtract(double n1, double n2){
        // subtract the value of n2 from n1 and assign (i.e. store) the result into the instance variable named result
        result = n1 - n2;
        // display the result of the subtraction
        System.out.println(n1 + " - " + n2 + " = " + result);
    } // ends the body of the subtract method
    
    // declare the main method
    public static void main(String args[]){
    	
        // reuse the Calculator class
        // declare a variable of type Calculator
        Calculator banana;
        // create an object of type Calculator
        banana = new Calculator();
        
        // call/ invoke the method add on the object banana
        // the method add takes in two arguments, that are the value 5 and 10
        banana.add(5, 10);
        
        // declare two variables d1 and d2 and initialize them with some values
        double d1 = 5.5;
        double d2 = 10;
        
        // call/ invoke the method subtract on the object banana
        // the method subtract takes in two arguments, that are the value stored in d1 (i.e. 5.5) and d2 (i.e. 10.0)
        banana.subtract(d1, d2);
        
        // call/ invoke the method subtract on the object banana
        // the method subtract takes in two arguments, that are the value stored in d2 (i.e. 10.0) and d1 (i.e. 5.5)
        banana.subtract(d2, d1);
        
    } // ends the body of the main method
    
} // ends the body of the class