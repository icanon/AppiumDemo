package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class CalcTest extends AndroidSetup{



    @Test
    public void sum() {


        // Click on DELETE/CLR button to clear result text box before running test.
        driver.findElement(By.xpath("//android.widget.Button[@text='C']")).click();

        // Click on number 2 button.
        driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();

        // Click on + button.
        driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
//        driver.findElement(By.name("+")).click();

        // Click on number 5 button.
        driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
//        driver.findElement(By.name("5")).click();

        // Click on = button.
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
//        driver.findElement(By.name("=")).click();

        // Get result from result text box.
        String result = driver.findElement(By.className("android.widget.EditText")).getText();
        System.out.println("Number sum result is : " + result);

        driver.findElement(By.xpath("//android.widget.Button[@text='C']")).click();
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
