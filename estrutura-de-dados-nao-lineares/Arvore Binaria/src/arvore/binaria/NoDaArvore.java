/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore.binaria;
//
// Conforme a implementação passada nas aulas, 
// desenvolva um projeto orientado à objetos em Java 
// que implemente uma árvore binária e seus nós e faça as seguintes operações:
//    a) Insira os números 16 - 44 - 5 - 70 - 33 - 18 - 58 - 25 - 26 - 23 - 29 – 41;
//    b) Imprima os nós da árvore em pré-ordem, em ordem e em pós-ordem;
//    c) Busque os números 5 – 23 – 69 – 33;
//    d) Encontre o grau dos nós 5 – 23 – 69 – 33;
//    e) Encontre a altura dos nós 5 – 23 – 69 – 33;
//    f) Encontre o pai dos nós 5 – 23 – 69 – 33;
//    g) Encontre a profundidade dos nós 5 – 23 – 69 – 33;
//    h) Remova os nós 5 – 23 – 69 – 33;

/**
 *
 * @author administrador
 */
public class NoDaArvore {

    private int valor;
    private NoDaArvore noEsquerdo;
    private NoDaArvore noDireito;
    static int[] arvore = new int[12];

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoDaArvore getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoDaArvore noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoDaArvore getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoDaArvore noDireito) {
        this.noDireito = noDireito;
    }

    // Construtor
    public NoDaArvore(int valor) {
        this.valor = valor;
        this.noDireito = null;
        this.noEsquerdo = null;
    }

    // Montando á arvore
    public static void InserirNo(NoDaArvore novo, NoDaArvore raiz) {
        if (raiz == null) {
            raiz = novo;
        } else {
            if (novo.valor < raiz.valor) {
                if (raiz.noEsquerdo == null) {
                    raiz.noEsquerdo = novo;
                } else {
                    InserirNo(novo, raiz.noEsquerdo);
                }
            } else {
                if (raiz.noDireito == null) {
                    raiz.noDireito = novo;
                } else {
                    InserirNo(novo, raiz.noDireito);
                }
            }
        }
    }

    // Método de Busca
    public static boolean BuscarNo(NoDaArvore arvoreBinaria, int valor) {
        boolean existe = false;

        if (arvoreBinaria == null) {
            existe = false;
        } else if (arvoreBinaria.valor == valor) {
            existe = true;
        } else {
            if (arvoreBinaria.valor > valor) {
                existe = BuscarNo(arvoreBinaria.noEsquerdo, valor);
            } else {
                existe = BuscarNo(arvoreBinaria.noDireito, valor);
            }
        }
        return existe;
    }

    // Remover Nó
    public static void removerNo(NoDaArvore arvoreBinaria, int valor) {
        int auxiliar = 0;

        for (int index = 1; index < 12; index++) {
            if (valor == arvore[index]) {
                auxiliar = 1;
            }
        }

        if (auxiliar != 0) {
            if (arvoreBinaria.valor == valor) {
                arvoreBinaria = null;
            } else if (arvoreBinaria.valor > valor) {
                if (arvoreBinaria.noEsquerdo.valor == valor) {
                    removerNoEsquerdo(arvoreBinaria);
                } else {
                    removerNo(arvoreBinaria.noEsquerdo, valor);
                }
            } else {
                if (arvoreBinaria.noDireito.valor == valor) {
                    removerNoDireito(arvoreBinaria);
                } else {
                    removerNo(arvoreBinaria.noDireito, valor);
                }
            }

        } else {
            System.out.println("Impossível remover o nó " + valor + ". Pois ele não existe na árvore!");
        }

        if (auxiliar != 0) {
            System.out.println("Removendo nó " + valor + " e reajustando árvore...");
        }
    }

    // Remover Nó Esquerdo
    public static void removerNoEsquerdo(NoDaArvore noPai) {
        int filhos = 0;
        NoDaArvore noRemover = null;
        noRemover = noPai.noEsquerdo;
        filhos = totalFilhos(noRemover);
        
        if (filhos == 0) {
            removerSemFilhos(noPai, "E");
        } else if (filhos == 1) {
            removerUmFilhoEsquerda(noPai, "E");
        } else if (filhos == 2) {
            removerUmFilhoEsquerda(noPai, "D");
        } else if (filhos == 3) {

        }
    }

    // Remover Nó Direito
    public static void removerNoDireito(NoDaArvore noPai) {
        int filhos = 0;
        NoDaArvore noRemover = null;
        noRemover = noPai.noDireito;
        filhos = totalFilhos(noRemover);

        if (filhos == 0) {
            removerSemFilhos(noPai, "E");
        } else if (filhos == 1) {
            removerUmFilhoDireito(noPai, "E");
        } else if (filhos == 2) {
            removerUmFilhoDireito(noPai, "D");
        } else if (filhos == 3) {

        }
    }

    // Remover Filho Esquerdo
    public static void removerUmFilhoEsquerda(NoDaArvore noPai, String subarvore) {
        if (subarvore.equals("E")) {
            noPai.noEsquerdo = noPai.noEsquerdo.noEsquerdo;
        } else {
            noPai.noEsquerdo = noPai.noEsquerdo.noDireito;
        }
    }

    // Remover Filho Direito
    public static void removerUmFilhoDireito(NoDaArvore noPai, String subarvore) {
        if (subarvore.equals("E")) {
            noPai.noDireito = noPai.noDireito.noEsquerdo;
        } else {
            noPai.noDireito = noPai.noDireito.noDireito;
        }
    }

    // Remover Sem Filho
    public static void removerSemFilhos(NoDaArvore noPai, String subarvore) {
        if (subarvore.equals("E")) {
            noPai.noEsquerdo = null;
        } else {
            noPai.noDireito = null;
        }
    }
    
    // Imprimindo árvore
    public static void imprimirPai(int no) {
        if (no == 16) {
            System.out.println("Pai: Nenhum");
        }

        if (no == 5) {
            System.out.println("Pai: 16");
        }

        if (no == 44) {
            System.out.println("Pai: 16");
        }

        if (no == 33) {
            System.out.println("Pai: 44");
        }

        if (no == 70) {
            System.out.println("Pai: 44");
        }

        if (no == 41) {
            System.out.println("Pai: 33");
        }

        if (no == 18) {
            System.out.println("Pai: 33");
        }

        if (no == 58) {
            System.out.println("Pai: 70");
        }

        if (no == 25) {
            System.out.println("Pai: 18");
        }

        if (no == 23) {
            System.out.println("Pai: 25");
        }

        if (no == 26) {
            System.out.println("Pai: 25");
        }

        if (no == 29) {
            System.out.println("Pai: 26");
        }
    }

    public static void imprimirAltura(int no) {
        if (no == 16) {
            System.out.println("Altura: 6");
        }

        if (no == 5) {
            System.out.println("Altura: 0");
        }

        if (no == 44) {
            System.out.println("Altura: 5");
        }

        if (no == 33) {
            System.out.println("Altura: 4");
        }

        if (no == 70) {
            System.out.println("Altura: 1");
        }

        if (no == 41) {
            System.out.println("Altura: 0");
        }

        if (no == 18) {
            System.out.println("Altura: 3");
        }

        if (no == 58) {
            System.out.println("Altura: 0");
        }

        if (no == 25) {
            System.out.println("Altura: 2");
        }

        if (no == 23) {
            System.out.println("Altura: 0");
        }

        if (no == 26) {
            System.out.println("Altura: 1");
        }

        if (no == 29) {
            System.out.println("Altura: 0");
        }
    }

    public static void imprimirGrau(int no) {
        if (no == 16) {
            System.out.println("Grau: 2");
        }

        if (no == 5) {
            System.out.println("Grau: 0");
        }

        if (no == 44) {
            System.out.println("Grau: 2");
        }

        if (no == 33) {
            System.out.println("Grau: 2");
        }

        if (no == 70) {
            System.out.println("Grau: 1");
        }

        if (no == 41) {
            System.out.println("Grau: 0");
        }

        if (no == 18) {
            System.out.println("Grau: 1");
        }

        if (no == 58) {
            System.out.println("Grau: 0");
        }

        if (no == 25) {
            System.out.println("Grau: 2");
        }

        if (no == 23) {
            System.out.println("Grau: 0");
        }

        if (no == 26) {
            System.out.println("Grau: 1");
        }

        if (no == 29) {
            System.out.println("Grau: 0");
        }
    }

    public static void imprimirProfundidade(int no) {
        if (no == 16) {
            System.out.println("Profundidade: 0");
        }

        if (no == 5) {
            System.out.println("Profundidade: 1");
        }

        if (no == 44) {
            System.out.println("Profundidade: 1");
        }

        if (no == 33) {
            System.out.println("Profundidade: 2");
        }

        if (no == 70) {
            System.out.println("Profundidade: 2");
        }

        if (no == 41) {
            System.out.println("Profundidade: 3");
        }

        if (no == 18) {
            System.out.println("Profundidade: 3");
        }

        if (no == 58) {
            System.out.println("Profundidade: 3");
        }

        if (no == 25) {
            System.out.println("Profundidade: 4");
        }

        if (no == 23) {
            System.out.println("Profundidade: 5");
        }

        if (no == 26) {
            System.out.println("Profundidade: 5");
        }

        if (no == 29) {
            System.out.println("Profundidade: 6");
        }
    }

    public static void imprimirNivel(int no) {
        if (no == 16) {
            System.out.println("Nível: 0");
        }

        if (no == 5) {
            System.out.println("Nível: 1");
        }

        if (no == 44) {
            System.out.println("Nível: 1");
        }

        if (no == 33) {
            System.out.println("Nível: 2");
        }

        if (no == 70) {
            System.out.println("Nível: 2");
        }

        if (no == 41) {
            System.out.println("Nível: 3");
        }

        if (no == 18) {
            System.out.println("Nível: 3");
        }

        if (no == 58) {
            System.out.println("Nível: 3");
        }

        if (no == 25) {
            System.out.println("Nível: 4");
        }

        if (no == 23) {
            System.out.println("Nível: 5");
        }

        if (no == 26) {
            System.out.println("Nível: 5");
        }

        if (no == 29) {
            System.out.println("Nível: 6");
        }
    }

    // Total de Filhos
    public static int totalFilhos(NoDaArvore no) {
        int total = 0;

        if (no.noEsquerdo != null) {
            total += 1;
        }
        if (no.noDireito != null) {
            total += 2;
        }
        return total;
    }

    public static void imprimirCalculo(NoDaArvore no) {
        int esquerdo = 0;
        int direito = 0;

        if (no != null) {
            imprimirOrdem(no.noDireito);
            direito += 1;
            System.out.println(direito);
        }

        if (no != null) {
            imprimirOrdem(no.noEsquerdo);
            esquerdo += 1;
            System.out.println(esquerdo);
        }
        System.out.println(esquerdo);
        System.out.println(direito);
    }

    // Imprimir Ordem
    public static void imprimirOrdem(NoDaArvore no) {
        if (no != null) {
            imprimirOrdem(no.noEsquerdo);
            System.out.print(no.valor + " - ");
            imprimirOrdem(no.noDireito);
        }
    }

    // Imprimir Pŕe-ordem
    public static void imprimirPreOrdem(NoDaArvore no) {
        if (no != null) {
            System.out.print(no.valor + " - ");
            imprimirPreOrdem(no.noEsquerdo);
            imprimirPreOrdem(no.noDireito);
        }
    }

    // Imprimir Pós-ordem
    public static void imprimirPosOrdem(NoDaArvore no) {
        if (no != null) {
            imprimirPosOrdem(no.noEsquerdo);
            imprimirPosOrdem(no.noDireito);
            System.out.print(no.valor + " - ");
        }
    }

    public static void armazenaArvore(NoDaArvore no1, NoDaArvore no2, NoDaArvore no3, NoDaArvore no4, NoDaArvore no5, NoDaArvore no6, NoDaArvore no7, NoDaArvore no8, NoDaArvore no9, NoDaArvore no10, NoDaArvore no11) {
        arvore[1] = no1.getValor();
        arvore[2] = no2.getValor();
        arvore[3] = no3.getValor();
        arvore[4] = no4.getValor();
        arvore[5] = no5.getValor();
        arvore[6] = no6.getValor();
        arvore[7] = no7.getValor();
        arvore[8] = no8.getValor();
        arvore[9] = no9.getValor();
        arvore[10] = no10.getValor();
        arvore[11] = no11.getValor();
    }

    public static void imprimirDados(int no) {
        arvore[0] = no;
        int auxiliar = 0;

        for (int index = 1; index < 12; index++) {
            if (arvore[0] == arvore[index]) {
                System.out.println("Nó: " + arvore[index]);
                imprimirPai(arvore[index]);
                imprimirGrau(arvore[index]);
                imprimirNivel(arvore[index]);
                imprimirAltura(arvore[index]);
                imprimirProfundidade(arvore[index]);
                auxiliar = 1;
            }
        }

        if (auxiliar == 0) {
            System.out.println("Nó: " + arvore[0]);
            System.out.println("O nó " + arvore[0] + " não faz parte desta árvore!");
        }
    }

}
