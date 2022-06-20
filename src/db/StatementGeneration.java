/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author jordanmurray
 */
public class StatementGeneration {    
    public StatementGeneration(){}

    public String generateDeleteRecordStatement(String uniqueID, int uniqueValue, String nameOfTable){
        return "DELETE FROM " + nameOfTable +  " WHERE " + uniqueID + " LIKE " + uniqueValue;
    }

    public String generateSearchStatement(String uniqueID, int uniqueValue, String nameOfTable){
        return "SELECT * FROM " + nameOfTable + " WHERE " +  uniqueID + " LIKE " + uniqueValue;
    }   
    
    
     public String generateDeleteRecordStatementStringID(String uniqueID, String uniqueValue, String nameOfTable){
        return "DELETE FROM " + nameOfTable +  " WHERE " + uniqueID + "='" + uniqueValue + "';";
    }   
    
    public String generateSearchStatementStringID(String uniqueID, String uniqueValue, String nameOfTable){
        return "SELECT * FROM " + nameOfTable + " WHERE " +  uniqueID + "='" + uniqueValue + "';";
    }
    
}
