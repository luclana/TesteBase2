//1 Caso de teste: Verificar a exibição do nome de usuário logado

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mantis-prova.base2.com.br/my_view_page.php");

        // Realizar o login no sistema
        driver.findElement(By.id("username")).sendKeys("seu_usuario");
        driver.findElement(By.id("password")).sendKeys("sua_senha");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Verificar a exibição do nome de usuário logado
        WebElement usernameElement = driver.findElement(By.className("user-info"));
        String username = usernameElement.getText();

        if (username.equals("seu_usuario")) {
            System.out.println("O nome de usuário está sendo exibido corretamente.");
        } else {
            System.out.println("O nome de usuário não está sendo exibido corretamente.");
        }

        driver.quit();
    }
}



//2 . Caso de teste: Criar uma nova tarefa

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mantis-prova.base2.com.br/my_view_page.php");

        // Realizar o login no sistema
        driver.findElement(By.id("username")).sendKeys("seu_usuario");
        driver.findElement(By.id("password")).sendKeys("sua_senha");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Criar uma nova tarefa
        driver.findElement(By.id("category_id")).click();
        driver.findElement(By.linkText("[Todos os Projetos] categoria teste")).click();
        driver.findElement(By.id("reproducitibility")).click();
        driver.findElement(By.linkText("sempre")).click();
        driver.findElement(By.id("severity")).click();
        driver.findElement(By.linkText("recurso")).click();
        driver.findElement(By.id("priority")).click();
        driver.findElement(By.linkText("normal")).click();
        driver.findElement(By.id("summary")).sendKeys("faça um resumo");
        driver.findElement(By.id("description")).sendKeys("inserir texto");
        driver.findElement(By.cssSelector("input[value='Criar Nova Tarefa']")).click();


        // Verificar se a tarefa foi criada com sucesso
        WebElement projectNameElement = driver.findElement(By.className("skin-3"));
        String projectName = projectNameElement.getText();

        if (projectName.contains("Novo Projeto de Teste")) {
            System.out.println("Operação Realizada com Sucesso.");
        } else {
            System.out.println("O projeto não foi criado corretamente.");
        }

        driver.quit();
    }
}



