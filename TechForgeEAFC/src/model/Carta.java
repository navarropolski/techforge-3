package model;

import java.util.List;

public class Carta {
    private int id;
    private int ritmo;
    private String jogador;
    private boolean estrela;
    private int finalizacao;
    private int conducao;
    private int passe;
    private int defesa;
    private Posicao posicao;
    private Pais pais;
    private List<Posicao> posicoesSecundarias;
    private int overall;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void calculateOverall() {
        this.overall = (ritmo + finalizacao + conducao + passe + defesa) / 5;
    }

    public int getOverall() {
        return overall;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public boolean isEstrela() {
        return estrela;
    }

    public void setEstrela(boolean estrela) {
        this.estrela = estrela;
    }

    public int getFinalizacao() {
        return finalizacao;
    }

    public void setFinalizacao(int finalizacao) {
        this.finalizacao = finalizacao;
    }

    public int getConducao() {
        return conducao;
    }

    public void setConducao(int conducao) {
        this.conducao = conducao;
    }

    public int getPasse() {
        return passe;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Posicao> getPosicoesSecundarias() {
        return posicoesSecundarias;
    }

    public void setPosicoesSecundarias(List<Posicao> posicoesSecundarias) {
        this.posicoesSecundarias = posicoesSecundarias;
    }
}
