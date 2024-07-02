import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
    public static void main(String[] args) {
        // Configurar o caminho para o driver do Chrome
        System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver");

        // Inicializar o WebDriver
        WebDriver driver = new ChromeDriver();

        // Abrir o site
        driver.get("http://mantis-prova.base2.com.br");

        // Localizar os elementos de login e preencher com as informações necessárias
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));

        usernameInput.sendKeys("seu_usuario");
        passwordInput.sendKeys("sua_senha");
        loginButton.click();

        // Verificar se o login foi realizado com sucesso
        WebElement loggedInUser = driver.findElement(By.className("login-info-left"));

        if (loggedInUser.getText().contains("seu_usuario")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha ao realizar o login.");
        }

        // Fechar o navegador
        driver.quit();
    }
}