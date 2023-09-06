public class App {
    public static void main(String[] args) {

        IndiceQualidadeAr IndiceAr; //Declarando
        IndiceAr = new IndiceQualidadeAr(); // instanciando

        IndiceAr.indice = 399;
        IndiceAr.defineClassificacao();
        IndiceAr.defineEfeitos();

        System.out.println("Classificação do Ar: " + IndiceAr.classificacao);
        System.out.println("Efeitos: " + IndiceAr.efeitos);

        if(IndiceAr.compararIndice(10) == 0) {
            System.out.println("A qualidade do ar se mantém estável!");
        } else if(IndiceAr.compararIndice(10) > 0) {
            System.out.println("A qualidade do ar piorou!");
        } else {
            System.out.println("A qualidade do ar melhorou!");
        }
    }
}
