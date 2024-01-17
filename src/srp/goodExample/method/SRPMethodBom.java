package srp.goodExample.method;

import java.util.List;

public class SRPMethodBom {

    // Bom
    // Responsabilidades divididas e de fácil compreensão
    public void emailClients(List<String> clients) {

        List<String> activeClients = getActiveClients(clients);
        sendEmails(activeClients);

    }

    public List<String> getActiveClients(List<String> clients) {
        return clients
                .stream()
                .filter(this::findAtivo)
                .toList();
    }

    public boolean findAtivo(String value) {
        return value.contains("ativo");
    }

    public void sendEmails(List<String> clients) {
        clients.forEach(client -> {
            System.out.println("Email enviado para " + client);
        });
    }

}
