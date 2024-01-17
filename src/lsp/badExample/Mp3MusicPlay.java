package lsp.badExample;

import java.io.File;

// Lança uma exceção inesperada que não existe na classe MusicPlay
public class Mp3MusicPlay extends MusicPlay {

    public void play(File file) {

        if (!file.getAbsoluteFile().toString().contains("MP3")) {
            try {
                System.out.println(file.getAbsoluteFile());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (file.canExecute()) {
            System.out.println(file.getAbsoluteFile());
        }

    }

}
