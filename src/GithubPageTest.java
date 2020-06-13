import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GithubPageTest {
    @Test
    public void loginWithIncorrectPassword() throws InterruptedException {

       GithubPage loginPage=new GithubPage();
       loginPage.login("nikolovasara","Selenide20");
       String expectedError="Incorrect username or password.";
       assertEquals(expectedError,loginPage.getErrorMessage());
    }
    @Test
    public void loginWithIncorrectUsername() throws InterruptedException {
        GithubPage loginPage=new GithubPage();
        loginPage.login("nikolovssara","Selenide20");
        String expectedError="Incorrect username or password.";
        assertEquals(expectedError,loginPage.getErrorMessage());
    }
    @Test
    public void forgottenPassword() throws InterruptedException {
        GithubPage loginPage=new GithubPage();
        loginPage.forgotPasswordClicked();
        assertTrue(loginPage.forgotPasswordPageLoaded());
    }
    @Test
    public void creatingAccount() throws InterruptedException {
        GithubPage loginPage=new GithubPage();
        loginPage.createAccountClicked();
        assertTrue(loginPage.signUpPageLoaded());
    }
}
