import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Metodos {
    private int contador = 0;

    @Given("^que tenho (\\d+) reais$")
    public void que_tenho_reais(int arg1) throws Throwable {

        contador = arg1;

        // throw new PendingException();
    }

    @When("^gastar (\\d+) reais$")
    public void gastar_reais(int arg1) throws Throwable {

        contador = contador - arg1;

        //throw new PendingException();
    }

    @When("^achar (\\d+) reais$")
    public void achar_reais(int arg1) throws Throwable {

        contador = contador + arg1;

    }

    @Then("^vou ficar com (\\d+) reais$")
    public void vou_ficar_com_reais(int arg1) throws Throwable {

        Assert.assertEquals(arg1, contador);

    }

    Date entrega = new Date();

    @Given("^que o prazo é (\\d+)/(\\d+)/(\\d+)$")
    public void que_o_prazo_é(int dia, int mes, int ano) throws Throwable {

        Calendar caledario = Calendar.getInstance();
        caledario.set(Calendar.DAY_OF_MONTH, dia);
        caledario.set(Calendar.MONTH, mes - 1);
        caledario.set(Calendar.YEAR, ano);
        entrega = caledario.getTime();
    }

    @When("^a entrega atrasar (\\d+) (dias|dia|meses|mes)$")
    public void a_entrega_atrasar_dias(int diaMesAtraso, String tempo) throws Throwable {
        Calendar caledario = Calendar.getInstance();
        if (tempo.equals("dias")) {
            caledario.setTime(entrega);
            caledario.add(Calendar.DAY_OF_MONTH, diaMesAtraso);

        }
        if (tempo.equals("dia")) {
            caledario.setTime(entrega);
            caledario.add(Calendar.DAY_OF_MONTH, diaMesAtraso);
        }

        if (tempo.equals("meses")) {
            caledario.setTime(entrega);
            caledario.add(Calendar.MONTH, diaMesAtraso);
        }
        if (tempo.equals("mes")) {
            caledario.setTime(entrega);
            caledario.add(Calendar.MONTH, diaMesAtraso);
        }
        entrega = caledario.getTime();

    }

    @Then("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void a_entrega_sera_efetuada_em(String data) throws Throwable {
        DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatar.format(entrega);
        Assert.assertEquals(data, dataFormatada);
    }
    //-----------------------------------------------------------------
    @Given("^que o ticket é AF(\\d+)$")
    public void que_o_ticket_é_AF(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void que_o_valor_da_passagem_é_R$(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o nome do passageiro é \"([^\"]*)\"$")
    public void que_o_nome_do_passageiro_é(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o telefone do passageiro é (\\d+)-(\\d+)$")
    public void que_o_telefone_do_passageiro_é(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^criar os steps$")
    public void criar_os_steps() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^o teste vai funcionar$")
    public void o_teste_vai_funcionar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o ticket é AB(\\d+)$")
    public void que_o_ticket_é_AB(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o ticket especial é AB(\\d+)$")
    public void que_o_ticket_especial_é_AB(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o ticket é CD(\\d+)$")
    public void que_o_ticket_é_CD(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o ticket é AG(\\d+)$")
    public void que_o_ticket_é_AG(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^que o valor da passagem é R\\$ (\\d+)\\.(\\d+),(\\d+)$")
    public void que_o_valor_da_passagem_é_R$(int arg1, int arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
