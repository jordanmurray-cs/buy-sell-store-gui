/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author jordanmurray
 */
public class Product extends StatementGeneration {
    private String productBrandName;
    private String productModelName;
    private String productModelYear;
    private String productPrice;
    private String currentProductLevels;
    private int productAvailability;
    private String productCondition;
    private String productSize;
    private String productScreenSize;
    private String productProcessor;
    private String productRAM;
    private String productHasOS;
    private String productStorage;
    private int productIsAccessory;
    private int productHasWarranty;

    public Product(String productBrandName, String productModelName, String productModelYear,
                    String productPrice, String currentProductLevels, int productAvailability, String productCondition,
                    String productSize, String productScreenSize, String productProcessor, String productRAM,
                    String productHasOS, String productStorage, int productIsAccessory, int productHasWarranty) {
            this.productBrandName = productBrandName;
            this.productModelName = productModelName;
            this.productModelYear = productModelYear;
            this.productPrice = productPrice;
            this.currentProductLevels = currentProductLevels;
            this.productAvailability = productAvailability;
            this.productCondition = productCondition;
            this.productSize = productSize;
            this.productScreenSize = productScreenSize;
            this.productProcessor = productProcessor;
            this.productRAM = productRAM;
            this.productHasOS = productHasOS;
            this.productStorage = productStorage;
            this.productIsAccessory = productIsAccessory;
            this.productHasWarranty = productHasWarranty;
    }

    public Product() {}


    public String getProductBrandName() {
            return productBrandName;
    }

    public void setProductBrandName(String productBrandName) {
            this.productBrandName = productBrandName;
    }

    public String getProductModelName() {
            return productModelName;
    }

    public void setProductModelName(String productModelName) {
            this.productModelName = productModelName;
    }

    public String getProductModelYear() {
            return productModelYear;
    }

    public void setProductModelYear(String productModelYear) {
            this.productModelYear = productModelYear;
    }

    public String getProductPrice() {
            return productPrice;
    }

    public void setProductPrice(String productPrice) {
            this.productPrice = productPrice;
    }

    public String getCurrentProductLevels() {
            return currentProductLevels;
    }

    public void setCurrentProductLevels(String currentProductLevels) {
            this.currentProductLevels = currentProductLevels;
    }

    public int isProductAvailability() {
            return productAvailability;
    }

    public void setProductAvailability(int productAvailability) {
            this.productAvailability = productAvailability;
    }

    public String getProductCondition() {
            return productCondition;
    }

    public void setProductCondition(String productCondition) {
            this.productCondition = productCondition;
    }

    public String getProductSize() {
            return productSize;
    }

    public void setProductSize(String productSize) {
            this.productSize = productSize;
    }

    public String getProductScreenSize() {
            return productScreenSize;
    }

    public void setProductScreenSize(String productScreenSize) {
            this.productScreenSize = productScreenSize;
    }

    public String getProductProcessor() {
            return productProcessor;
    }

    public void setProductProcessor(String productProcessor) {
            this.productProcessor = productProcessor;
    }

    public String getProductRAM() {
            return productRAM;
    }

    public void setProductRAM(String productRAM) {
            this.productRAM = productRAM;
    }

    public String getProductHasOS() {
            return productHasOS;
    }

    public void setProductHasOS(String productHasOS) {
            this.productHasOS = productHasOS;
    }

    public String getProductStorage() {
            return productStorage;
    }

    public void setProductStorage(String productStorage) {
            this.productStorage = productStorage;
    }

    public int isProductIsAccessory() {
            return productIsAccessory;
    }

    public void setProductIsAccessory(int productIsAccessory) {
            this.productIsAccessory = productIsAccessory;
    }

    public int isProductHasWarranty() {
            return productHasWarranty;
    }

    public void setProductHasWarranty(int productHasWarranty) {
            this.productHasWarranty = productHasWarranty;
    }

    @Override
    public String toString() {
            return "Product [productBrandName=" + productBrandName + ", productModelName="
                            + productModelName + ", productModelYear=" + productModelYear + ", productPrice=" + productPrice
                            + ", currentProductLevels=" + currentProductLevels + ", productAvailability=" + productAvailability
                            + ", productCondition=" + productCondition + ", productSize=" + productSize + ", productScreenSize="
                            + productScreenSize + ", productProcessor=" + productProcessor + ", productRAM=" + productRAM
                            + ", productHasOS=" + productHasOS + ", productStorage=" + productStorage + ", productIsAccessory="
                            + productIsAccessory + ", productHasWarranty=" + productHasWarranty + "]";
    }

    public String generateInsertIntoStatement() {
        return "INSERT INTO Products "
            + "(productBrandName, productModelName, productModelYear, productPrice, currentProductLevels, productAvailability, productCondition, productSize, productScreenSize, productProcessor, productRAM, productHasOS, productStorage, productisAccessory, productHasWarranty)"
            + "VALUES ('" 
            + getProductBrandName() + "'"
            + ", '" + getProductModelName() + "'"
            + ", '" + getProductModelYear() + "'"
            + ", '" + getProductPrice() + "'"
            + ", '" + getCurrentProductLevels() + "'"
            + ", '" + isProductAvailability() + "'" 
            + ", '" + getProductCondition() + "'"
            + ", '" + getProductSize() + "'"
            + ", '" + getProductScreenSize() + "'"
            + ", '" + getProductProcessor() + "'"
            + ", '" + getProductRAM() + "'"
            + ", '" + getProductHasOS() + "'"              
            + ", '" + getProductStorage() + "'"
            + ", '" + isProductIsAccessory() + "'"
            + ", '" + isProductHasWarranty() + "')";
}

    public String generateEditStatement(int ID){
        return "UPDATE Products SET " 
            + " productBrandName= '"
            + getProductBrandName()

            + "' , productModelName= '"
            + getProductModelName()

            + "' , productModelYear= '"
            + getProductModelYear()

            + "' , productPrice= '"
            + getProductPrice()

            + "' , currentProductLevels= '"
            + getCurrentProductLevels()

            + "' , productAvailability= '"
            + isProductAvailability()

            + "' , productCondition= '"
            + getProductCondition()

            + "' , productSize= '"
            + getProductSize()

            + "' , productScreenSize= '"
            + getProductScreenSize()

            + "' , productProcessor= '"
            + getProductProcessor()

            + "' , productRAM= '"
            + getProductRAM()

            + "' , productHasOS= '"
            + getProductHasOS()

            + "' , productStorage= '"
            + getProductStorage()

            + "' , productIsAccessory= '"
            + isProductIsAccessory()

            + "' , productHasWarranty= '"
            + isProductHasWarranty()

            + "' WHERE productID="
            + ID
            + ";";
    }

}
