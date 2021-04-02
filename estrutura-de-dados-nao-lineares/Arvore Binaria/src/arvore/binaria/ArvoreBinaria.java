/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore.binaria;

/**
 *
 * @author administrador
 */
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NoDaArvore raiz = new NoDaArvore(16);
        NoDaArvore.InserirNo(raiz, null);

        // Inserindo os nós
        NoDaArvore no1 = new NoDaArvore(44);
        NoDaArvore.InserirNo(no1, raiz);

        NoDaArvore no2 = new NoDaArvore(5);
        NoDaArvore.InserirNo(no2, raiz);

        NoDaArvore no3 = new NoDaArvore(70);
        NoDaArvore.InserirNo(no3, raiz);

        NoDaArvore no4 = new NoDaArvore(33);
        NoDaArvore.InserirNo(no4, raiz);

        NoDaArvore no5 = new NoDaArvore(18);
        NoDaArvore.InserirNo(no5, raiz);

        NoDaArvore no6 = new NoDaArvore(58);
        NoDaArvore.InserirNo(no6, raiz);

        NoDaArvore no7 = new NoDaArvore(25);
        NoDaArvore.InserirNo(no7, raiz);

        NoDaArvore no8 = new NoDaArvore(26);
        NoDaArvore.InserirNo(no8, raiz);

        NoDaArvore no9 = new NoDaArvore(23);
        NoDaArvore.InserirNo(no9, raiz);
//        
        NoDaArvore no10 = new NoDaArvore(29);
        NoDaArvore.InserirNo(no10, raiz);

        NoDaArvore no11 = new NoDaArvore(41);
        NoDaArvore.InserirNo(no11, raiz);

        NoDaArvore.armazenaArvore(no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11);

        // Imprimindo valores da arvore
        System.out.println("Ordem");
        NoDaArvore.imprimirOrdem(raiz);
        System.out.println();
        System.out.println();

        System.out.println("Pre-ordem");
        NoDaArvore.imprimirPreOrdem(raiz);
        System.out.println();
        System.out.println();

        System.out.println("Pos-ordem");
        NoDaArvore.imprimirPosOrdem(raiz);
        System.out.println();
        System.out.println();

        System.out.println("Dados do Nó");
        NoDaArvore.imprimirDados(5);
        System.out.println();

        System.out.println("Dados do Nó");
        NoDaArvore.imprimirDados(23);
        System.out.println();

        System.out.println("Dados do Nó");
        NoDaArvore.imprimirDados(69);
        System.out.println();

        System.out.println("Dados do Nó");
        NoDaArvore.imprimirDados(33);
        System.out.println();

        // Buscando um nó EXISTENTE
        // TRUE = Nó EXISTENTE
        // FALSE = Nó INEXISTENTE
        System.out.println("Buscando nó 5... Resultado:");
        System.out.println(NoDaArvore.BuscarNo(raiz, 5));
        System.out.println();

        System.out.println("Buscando nó 33... Resultado:");
        System.out.println(NoDaArvore.BuscarNo(raiz, 33));
        System.out.println();

        // Removendo nós
        NoDaArvore.removerNo(raiz, 5);
        System.out.println();

        NoDaArvore.removerNo(raiz, 23);
        System.out.println();

        NoDaArvore.removerNo(raiz, 69);
        System.out.println();

        NoDaArvore.removerNo(raiz, 33);
        System.out.println();

        // Buscando um nó INEXISTENTE
        // TRUE = Nó EXISTENTE
        // FALSE = Nó INEXISTENTE
        System.out.println("Buscando nó 69... Resultado:");
        System.out.println(NoDaArvore.BuscarNo(raiz, 69));
        System.out.println();

        System.out.println("Buscando nó 23... Resultado:");
        System.out.println(NoDaArvore.BuscarNo(raiz, 23));
        System.out.println();
    }
}
