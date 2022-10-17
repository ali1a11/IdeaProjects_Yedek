package com.cydeo.tests.from_ShortVideos;

// Before locating elements in table check whether table dynamic or static

//https://practice.cydeo.com/tables

// Table at the page dynamic. It is changing. Locating based on row and cell numbers is not a good way in this situation

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tables extends TestBase {

    @Test
    public void webTablesTest(){

        // get https://practice.cydeo.com/tables
        driver.get("https://practice.cydeo.com/tables");

        // print out Jason from row and cell number

        WebElement row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("row3Cell2.getText() = " + row3Cell2.getText());

        // Table at the page dynamic. It is changing. Locating based on row and cell numbers is not a good way in this situation

        // print out Jason using text
        //WebElement jasonCell = driver.findElement(By.xpath("//table[@id='table1']//tbody//td[.='Jason']"));
        // or
        WebElement jasonCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());

        WebElement firstName = driver.findElement(By.xpath("//table[@id='table1']//span[.='First Name']"));
        firstName.click();

        System.out.println("After click");

        row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("row3Cell2.getText() = " + row3Cell2.getText());

        jasonCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());

        // print out row 3
        System.out.println("print out row 3");
        WebElement row3 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]"));
        System.out.println("row3.getText() = " + row3.getText());

        // print out all cell values in row 3
        System.out.println("print out all cell values in row 3");

        List<WebElement> row3Cells = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));

        for (WebElement row3Cell : row3Cells) {
            System.out.println("row3Cell.getText() = " + row3Cell.getText());
        }

        // print out each and every cell values

        System.out.println();
        System.out.println("print out each and every cell values");

        List<WebElement> table1CellValues = driver.findElements(By.xpath("//table[@id='table1']//td"));
        System.out.println("table1CellValues.size() = " + table1CellValues.size());
        for (WebElement table1CellValue : table1CellValues) {
            System.out.println("table1CellValue.getText() = " + table1CellValue.getText());

        }

        // print out each and every column names
        System.out.println();
        System.out.println("print out each and every column names");
        List<WebElement> columnNames = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("columnNames.size() = " + columnNames.size());
        for (WebElement columnName : columnNames) {
            System.out.println("columnName.getText() = " + columnName.getText());
        }

    }

}
