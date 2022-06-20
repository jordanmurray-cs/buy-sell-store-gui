/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author jordanmurray
 */
public class Transaction extends StatementGeneration {
    private int productID;
    private int employeeID;
    private String transactionDate;
    private String transactionAmount;
    private String transactionPaymentMethod;
    private String customerTelephone;

    public Transaction(int productID, int employeeID, String transactionDate,
                    String transactionAmount, String transactionPaymentMethod, String customerTelephone) {
            this.productID = productID;
            this.employeeID = employeeID;
            this.transactionDate = transactionDate;
            this.transactionAmount = transactionAmount;
            this.transactionPaymentMethod = transactionPaymentMethod;   
            this.customerTelephone = customerTelephone;
    }
    
    public Transaction(){}

    /**
     * @return the productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the transactionDate
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the transactionAmount
     */
    public String getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount the transactionAmount to set
     */
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return the transactionPaymentMethod
     */
    public String getTransactionPaymentMethod() {
        return transactionPaymentMethod;
    }

    /**
     * @param transactionPaymentMethod the transactionPaymentMethod to set
     */
    public void setTransactionPaymentMethod(String transactionPaymentMethod) {
        this.transactionPaymentMethod = transactionPaymentMethod;
    }
    
    /**
     * @return the customerTelephone
     */
    public String getCustomerTelephone() {
        return customerTelephone;
    }

    /**
     * @param customerTelephone the customerTelephone to set
     */
    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }
    
    @Override
    public String toString() {
        return "Transaction [productID=" + productID + ", employeeID=" + employeeID
                + ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount
                + ", transactionPaymentMethod=" + transactionPaymentMethod + "]";
    }

    
    public String generateInsertIntoStatement() {
        return "INSERT INTO Transactions (productID, employeeID, transactionDate, transactionAmount, transactionPaymentMethod, customerTelephone)"
                + "VALUES('" 
                + getProductID() + "'"
                + ", '" + getEmployeeID() + "'"
                + ", '" + getTransactionDate() + "'"
                + ", '" + getTransactionAmount() + "'"
                + ", '" + getTransactionPaymentMethod() + "'"
                + ", '" + getCustomerTelephone() + "')";
    }
    
    public String generateEditStatement(int ID){
        return "UPDATE Transactions SET " 
                + "productID= '"
                + getProductID()
                + "' , employeeID= '"
                + getEmployeeID()
                + "' , transactionDate= '"
                + getTransactionDate()
                + "' , transactionAmount= '"
                + getTransactionAmount()
                + "' , transactionPaymentMethod= '"
                + getTransactionPaymentMethod()
                + "' , customerTelephone= '"
                + getCustomerTelephone()
                + "' WHERE transactionID="
                + ID
                + ";";
    }   

}
