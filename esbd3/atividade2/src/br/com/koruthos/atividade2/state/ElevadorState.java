package br.com.koruthos.atividade2.state;

public interface ElevadorState {
    void pressionarBotaoSubir(ElevadorContext context);

    void pressionarBotaoDescer(ElevadorContext context);

    void pressionarBotaoEmergencia(ElevadorContext context);

    void parar(ElevadorContext context);

    void consertar(ElevadorContext context);

}
