package lsp.badExample;

// Retornando valores de tipos diferentes...
// A classe Auth retorna somente um boolean true
// Enquanto isso a classe AuthAPI retorna um objeto JSON
public class AuthAPI extends Auth {

    public String checkCredentials(String login, String password) {

        return "{\"auth\": true, \"status\": 200 }";

    }

}
