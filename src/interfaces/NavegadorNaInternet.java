package interfaces;

public interface NavegadorNaInternet {
    void navegarParaPagina(String url);
    void voltarPagina();
    void avancarPagina();
    void fecharNavegador();
    void actualizarPagina();
}
