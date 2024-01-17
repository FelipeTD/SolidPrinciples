package lsp.badExample;

import java.io.File;

public class MusicPlay {

    public void play(File file) {
        if (file.canExecute()) {
            System.out.println(file.getAbsoluteFile());
        }
    }

}
