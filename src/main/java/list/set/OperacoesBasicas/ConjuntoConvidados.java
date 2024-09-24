package main.java.list.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarconvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados =new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarconvidados() + " convidado(s) dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidados 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidados 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidados 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidados 4", 1236);


        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarconvidados() + " convidado(s) dentro do set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarconvidados() + " convidado(s) dentro do set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
