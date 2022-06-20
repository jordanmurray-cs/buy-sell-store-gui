/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author jordanmurray
 */
public class Employee extends StatementGeneration {
    private String employeeFirst;
    private String employeeSurname;
    private String employeePosition;
    private String employeeTypeOfContract;
    private String employeeContractStartDate;
    private String employeeContractLength;
    private String employeePayFrequency;
    private String employeeHourlyRate;

    public Employee(String employeeFirst, String employeeSurname, String employeePosition,
                                    String employeeTypeOfContract, String employeeContractStartDate, String employeeContractLength,
                                    String employeePayFrequency, String employeeHourlyRate)
    {
            this.employeeFirst = employeeFirst;
            this.employeeSurname = employeeSurname;
            this.employeePosition = employeePosition;
            this.employeeTypeOfContract = employeeTypeOfContract;
            this.employeeContractStartDate = employeeContractStartDate;
            this.employeeContractLength = employeeContractLength;
            this.employeePayFrequency = employeePayFrequency;
            this.employeeHourlyRate = employeeHourlyRate;
    }

    public Employee(){};

    public String getEmployeeFirst() {
            return employeeFirst;
    }

    public void setEmployeeFirst(String employeeFirst) {
            this.employeeFirst = employeeFirst;
    }

    public String getEmployeeSurname() {
            return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
            this.employeeSurname = employeeSurname;
    }

    public String getEmployeePosition() {
            return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
            this.employeePosition = employeePosition;
    }

    public String getEmployeeTypeOfContract() {
            return employeeTypeOfContract;
    }

    public void setEmployeeTypeOfContract(String employeeTypeOfContract) {
            this.employeeTypeOfContract = employeeTypeOfContract;
    }

    public String getEmployeeContractStartDate() {
            return employeeContractStartDate;
    }

    public void setEmployeeContractStartDate(String employeeContractStartDate) {
            this.employeeContractStartDate = employeeContractStartDate;
    }

    public String getEmployeeContractLength() {
            return employeeContractLength;
    }

    public void setEmployeeContractLength(String employeeContractLength) {
            this.employeeContractLength = employeeContractLength;
    }

    public String getEmployeePayFrequency() {
            return employeePayFrequency;
    }

    public void setEmployeePayFrequency(String employeePayFrequency) {
            this.employeePayFrequency = employeePayFrequency;
    }

    public String getEmployeeHourlyRate() {
            return employeeHourlyRate;
    }

    public void setEmployeeHourlyRate(String employeeHourlyRate) {
            this.employeeHourlyRate = employeeHourlyRate;
    }

    @Override
    public String toString() {
            return "Employee = [First: " 
                            + employeeFirst + ", Surname: "
                            + employeeSurname + ", Position: " 
                            + employeePosition + ", Type Of Contract: "
                            + employeeTypeOfContract + ", Contract Start Date: " 
                            + employeeContractStartDate
                            + ", Contract Length=" + employeeContractLength 
                            + ", Pay Frequency: " + employeePayFrequency 
                            + ", Hourly Rate=" + employeeHourlyRate + "]";
    }

    public String generateInsertIntoStatement() {
            return "INSERT INTO Employees  (employeeFirst, employeeSurname, employeePosition, employeeTypeOfContract, employeeContractStartDate, employeeContractLength, employeePayFrequency, employeeHourlyRate)"
                + "VALUES('" 
                + getEmployeeFirst() + "'"
                + ", '" + getEmployeeSurname() + "'"
                + ", '" + getEmployeePosition() + "'"
                + ", '" + getEmployeeTypeOfContract() + "'"
                + ", '" + getEmployeeContractStartDate() + "'"
                + ", '" + getEmployeeContractLength() + "'"
                + ", '" + getEmployeePayFrequency() + "'"
                + ", '" + getEmployeeHourlyRate() + "')";
    }
    
    public String generateEditStatement(int ID){
        return "UPDATE Employees SET " 
                + "employeeFirst= '"
                + getEmployeeFirst()
                + "' , employeeSurname= '"
                + getEmployeeSurname()
                + "' , employeePosition= '"
                + getEmployeePosition()
                + "' , employeeTypeOfContract= '"
                + getEmployeeTypeOfContract()
                + "' , employeeContractStartDate= '"
                + getEmployeeContractStartDate()
                + "' , employeeContractLength= '"
                + getEmployeeContractLength()
                + "' , employeePayFrequency= '"
                +  getEmployeePayFrequency()
                + "' , employeeHourlyRate= '"
                + getEmployeeHourlyRate()
                + "' WHERE employeeID= "
                + ID
                + ";";
    }
   
}