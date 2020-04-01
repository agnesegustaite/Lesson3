/**
 calculate the payment based on hours worked (standard and overtime hours) and payRate
 */

// declare a class

public class publicClassPayment {
    // declare instance variables for the values to be calculated
    private double standardPay; //parametri seit tiek rakstiti//
    private double overtimePay;
    private double totalPay;
    
    // declare a method with 3 parameters to calculate the payment
    public void calculatePayment(double payRate, double standardHours, double overtimeHours){
        // calculate overtime payment
        standardPay = payRate * standardHours;
        // calculate overtime payment
        double overtimePayRate = payRate * 1.5;
        overtimePay = overtimePayRate * overtimeHours;
        // calculate the total payment
        totalPay = standardPay + overtimePay;
        
    }
    
    // declare a method without any parameters
    public void displayPayment(){
        System.out.println("My standard pay: " + standardPay);
        System.out.println("My standard overtime pay: " +overtimePay);
        System.out.println("My total pay: " +totalPay);
    }
    
    public static void main(String args[]){
        // declare a variable of type Payment
        payment myPayment;
        
        // create an object of type Payment
        myPayment = new Payment();
        
        double pR, sH, oH;
        pR = 20;
        sH = 35;
        oH = 10;
        
        // calculate the payment
        myPayment.calculatePayment(pR, sH, oH);
        myPayment.displayPayment();
        System.out.println();
        
        double apple = 50;
        sH = 40;
        oH = 0;
        
        // we should not use the method displayPayment if we haven't calculated the payments yet
//        myPayment.displayPayment();
//        System.out.println();
        
        myPayment.calculatePayment(apple, sH, pR);
        myPayment.displayPayment();
    }
}