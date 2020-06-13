import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubPage {
    public GithubPage(){
        open("https://github.com/login");
    }
    public void login(String username, String password) throws InterruptedException {
        $(By.name("login")).setValue(username);
        Thread.sleep(2000);
        $(By.name("password")).setValue(password).pressEnter();
        Thread.sleep(2000);
    }

    public String getErrorMessage() {
        return $(By.id("js-flash-container")).text();
    }

    public void forgotPasswordClicked() throws InterruptedException {
        $$("label").findBy(text("Forgot password?")).click();
        Thread.sleep(2000);
    }
    public boolean forgotPasswordPageLoaded(){
        return $(By.id("forgot-password-form"))!= null;
    }
    public void createAccountClicked() throws InterruptedException {
        $$("a").findBy(text("Create an account")).click();
        Thread.sleep(2000);
    }
    public boolean signUpPageLoaded(){
        return $$("h1").findBy(text("Create your account")) != null;
    }
}
