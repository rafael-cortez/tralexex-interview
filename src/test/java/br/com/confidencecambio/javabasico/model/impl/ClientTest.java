package br.com.confidencecambio.javabasico.model.impl;

import br.com.confidencecambio.javabasico.models.impl.Client;
import org.junit.Test;

public class ClientTest {

    private final String name = "John Doe Smith Johnson";

    @Test
    public void tryToCreateClassWithEmptyName(){
        try {
            Client client = new Client("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assert(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void tryToCreateClassWithNameHavingExtraSpaces(){
        Client client = new Client("     " + this.name + "     ");
        assert(client.getFullName().equals(this.name));
    }

    @Test
    public void tryToGetFirstName(){
        Client client = new Client(this.name);
        assert(client.getFirstName().equals("John"));
    }

    @Test
    public void tryToGetLastName(){
        Client client = new Client(this.name);
        assert(client.getLastName().equals("Johnson"));
    }

    @Test
    public void tryToGetUpperCaseName(){
        Client client = new Client(this.name);
        assert(client.getUpperCaseName().equals("JOHN DOE SMITH JOHNSON"));
    }

    @Test
    public void tryToGetAbbreviatedName(){
        Client client = new Client(this.name);
        var teste = client.getNameAbbreviated();
        assert(client.getNameAbbreviated().equals("John D. S. Johnson"));
    }

}
