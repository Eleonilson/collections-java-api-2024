package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos

    private Set<PalavrasUnicas> palavrasUnicasset;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasset = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasset.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavrasUnicas removerPalavra = null;
        for(PalavrasUnicas p : palavrasUnicasset) {
            if(p.getPalavra().equals(palavra)) {
                removerPalavra = p;
                break;
            }
        }
        palavrasUnicasset.remove(removerPalavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasset.contains(new PalavrasUnicas(palavra));
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasset);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        System.out.println("Palavras unicas: " + conjuntoPalavrasUnicas.palavrasUnicasset);

        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        conjuntoPalavrasUnicas.adicionarPalavra("Carro");
        conjuntoPalavrasUnicas.adicionarPalavra("Bicicleta");
        conjuntoPalavrasUnicas.adicionarPalavra("Casa");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Carro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra 'Bicicleta' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Bicicleta"));
    }
}
