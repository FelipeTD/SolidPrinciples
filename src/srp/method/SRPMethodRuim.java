package srp.method;

import java.util.List;

public class SRPMethodRuim {

    // Ruim
    // Busca os clientes e envia um e-mail se o cliente for encontrado
    public void emailClients(List<String> clients) {

        clients.forEach(client -> {
            String clientRecord = findClient(client);
            if (clientRecord != null) {
                sendEmail(client);
            }
        });

    }

    public String findClient(String client) {
        return client;
    }

    public void sendEmail(String client) {
        System.out.println("Email enviado para " + client);
    }

}
