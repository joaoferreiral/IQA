 public class IndiceQualidadeAr{
    double indice;
    String classificacao;
    String efeitos;

    public void defineClassificacao() {
        if(this.indice >= 0 && this.indice <= 50) {
            this.classificacao = "Boa";
        } else if(this.indice >= 51 && this.indice <=100) {
            this.classificacao = "Regular";
        } else if(this.indice >= 101 && this.indice <= 199) {
            this.classificacao = "Inadequada";
        } else if(this.indice >= 200 && this.indice <= 299) {
            this.classificacao = "Má";
        } else if(this.indice >= 300 && this.indice <= 399) {
            this.classificacao = "Péssima";
        } else {
            this.classificacao = "Critica";
        }

    }

    public void defineEfeitos() {
        if(this.indice >= 0 && this.indice <=100) {
            this.efeitos = "Ausência de sintomas";
        } else if(this.indice >= 101 && this.indice <= 199) {
            this.efeitos = "Leve agravamento dos sintomas de pessoas susceptíveis";
        } else if(this.indice >= 200 && this.indice <= 299) {
            this.efeitos = "Decréscimo da resistência física e significativo agravamento";
        } else if(this.indice >= 300 && this.indice <= 399) {
            this.efeitos = "Aparecimento prematuro de doenças";
        } else {
            this.efeitos = "Morte prematura de pessoas doentes e idosas";
        }
    }

    public double compararIndice(double indiceAnterior) {
        return this.indice - indiceAnterior;
    }
}