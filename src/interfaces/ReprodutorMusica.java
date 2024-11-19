package interfaces;

import models.Musica;

public interface ReprodutorMusica {
     void tocar();
     void pausar();
     void aumentarVolumen();
     void disminuirVolumen();
     String selecionarMusica(Musica musica);
}
