package tests;


import base.BaseTest;
import org.testng.annotations.Test;



public class FirstTests extends BaseTest {



    @Test
    public void firstExampleTest() throws InterruptedException {

        faceBookPage.inputEnterEmail("contact@adress.com");
        faceBookPage.inputEnterPassword("fravega");
        faceBookPage.buttonLogIn();
        Thread.sleep(3000);

    }
    @Test
    public void secondExampleTest() throws InterruptedException {

        faceBookPage.inputEnterEmail("contact@adress.com");
        faceBookPage.inputEnterPassword("fravega");
        faceBookPage.buttonLogIn();
        Thread.sleep(3000);

    }

}
