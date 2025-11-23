package web.step;

import Util.Util;
import web.page.LoginPage;
import Util.VaultClient;

public class MiwebSteps {
    LoginPage page = new LoginPage();

    public void abrirLogin() {
        page.abrir();
    }

    public void ingresarCredencialesDesdeVault() throws Exception {
        String user = VaultClient.getSecret("user");
        String pass = VaultClient.getSecret("pass");

        Util.esperarPorSegundos(10);

        System.out.println("Vault user: " + user);
        System.out.println("Vault pass: " + pass);

        page.ingresar(user, pass);
    }

    public void verificarAcceso() {
        page.verificarLoginExitoso();
    }
}