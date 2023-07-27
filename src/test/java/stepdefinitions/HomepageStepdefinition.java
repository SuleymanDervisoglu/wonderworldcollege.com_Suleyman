package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;


public class HomepageStepdefinition {

    HomePage homepage =new HomePage();

    @Given("kullanici username textBox'ina {string} girer")
    public void kullaniciUsernameTextBoxInaGirer(String isim) {
        homepage.enterUserName(isim);
    }

    @Then("kullanici password textBox'ina {string} girer")
    public void kullaniciPasswordTextBoxInaGirer(String sifre) {
        homepage.enterPassword(sifre);
    }

    @Then("kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        homepage.clickSubmit();
    }

    @Then("kullanici basarili bir sekilde login olunabildigini dogrular.")
    public void kullanici_basarili_bir_sekilde_login_olunabildigini_dogrular() {

    }

}
