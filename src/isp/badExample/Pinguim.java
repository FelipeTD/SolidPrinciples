package isp.badExample;

public class Pinguim implements Aves {


    @Override
    public void setLocalizacao(int longitude, int latitude) {
        // define a localização
    }

    // A Interface Aves força a Classe Pinguim a implementar esse método.
    // Isso viola o príncipio ISP
    @Override
    public void setAltitude(int altitude) {
        // Não faz nada... Pinguins não voam
    }

    @Override
    public void renderizar() {
        // renderiza
    }
}
