/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author jordanmurray
 */
public class Customer extends StatementGeneration{
    private String customerTelephone;
    private int employeeID;
    private String customerFirst;
    private String customerLast;
    private String customerCardCVV;
    private int customerIsMember;

    public Customer(String customerTelephone, int employeeID, String customerFirst, String customerLast,
                    String customerCardCVV, int customerIsMember) {
            this.customerTelephone = customerTelephone;
            this.employeeID = employeeID;
            this.customerFirst = customerFirst;
            this.customerLast = customerLast;
            this.customerCardCVV = customerCardCVV;
            this.customerIsMember = customerIsMember;
    }

    public Customer() {}

    public String getCustomerTelephone() {
            return customerTelephone;
    }

    public void setCustomerTelephone(String customerTelephone) {
            this.customerTelephone = customerTelephone;
    }

    public int getEmployeeID() {
            return employeeID;
    }

    public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
    }

    public String getCustomerFirst() {
            return customerFirst;
    }

    public void setCustomerFirst(String customerFirst) {
            this.customerFirst = customerFirst;
    }

    public String getCustomerLast() {
            return customerLast;
    }

    public void setCustomerLast(String customerLast) {
            this.customerLast = customerLast;
    }

    public String getCustomerCardCVV() {
            return customerCardCVV;
    }

    public void setCustomerCardCVV(String customerCardCVV) {
            this.customerCardCVV = customerCardCVV;
    }

    public int isCustomerIsMember() {
            return customerIsMember;
    }

    public void setCustomerIsMember(int customerIsMember) {
            this.customerIsMember = customerIsMember;
    }
	
    public String generateInsertIntoStatement() {
        return "INSERT INTO Customers VALUES('" 
                + getCustomerTelephone() 
                + "', '" + getEmployeeID() + "'"
                + ", '" + getCustomerFirst() + "'"
                + ", '" + getCustomerLast() + "'"
                + ", '" + getCustomerCardCVV() + "'"
                + ", " + isCustomerIsMember() + ")";
    }
    
    public String generateEditStatement(){
        return "UPDATE Customers SET customerTelephone= '" 
                + getCustomerTelephone() 
                + "' , employeeID= '"
                + getEmployeeID()
                + "' , customerFirst= '"
                + getCustomerFirst()
                + "' , customerLast= '"
                + getCustomerLast()
                + "' , customerCardCVV= '"
                + getCustomerCardCVV()
                + "' , customerIsMember= '"
                + isCustomerIsMember()
                + "' WHERE customerTelephone='"
                + getCustomerTelephone()
                + "';";
    }
    
    @Override
    public String toString() {
            return "Customer [customerTelephone=" + customerTelephone + ", employeeID=" + employeeID + ", customerFirst="
                            + customerFirst + ", customerLast=" + customerLast + ", customerCardCVV=" + customerCardCVV
                            + ", customerIsMember=" + customerIsMember + "]";
    }
}
