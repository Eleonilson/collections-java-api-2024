package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adcionarItem(String descricao){
        itemList.add(new Item(descricao));
    }

    public  void removerItem(String descricao) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: itemList) {
            if(i.getDescricao().equalsIgnoreCase(descricao)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public int obterNumeroTotalItens() {
        return itemList.size();
    }

    public void obterDescricoesItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O número total de itens na listra é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.adcionarItem("Item 1");
        carrinhoDeCompras.adcionarItem("Item 1");
        carrinhoDeCompras.adcionarItem("Item 2");

        System.out.println("O número total de itens na listra é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.removerItem("Item 2");

        System.out.println("O número total de itens na listra é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.obterDescricoesItens();
    }
}
