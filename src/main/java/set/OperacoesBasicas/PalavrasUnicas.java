package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class PalavrasUnicas {
    //atributos

    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PalavrasUnicas that = (PalavrasUnicas) o;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavra());
    }

    @Override
    public String toString() {
        return palavra;
    }
}
