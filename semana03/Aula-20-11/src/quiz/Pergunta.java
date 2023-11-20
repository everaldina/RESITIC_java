package quiz;

public class Pergunta {
    private String enunciado;
    private String[] alternativas;
    private int resposta;

    public Pergunta(String enunciado, String[] alternativas, int resposta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.resposta = resposta;
    }

    public String getEnunciado() {
        return this.enunciado;
    }
    public String[] getAlternativas() {
        return this.alternativas;
    }
    public int getResposta() {
        return this.resposta;
    }

    public void printQuestao(){
        System.out.println(this.enunciado);
        for(int i = 0; i < this.alternativas.length; i++){
            System.out.println((i+1) + ") " + this.alternativas[i]);
        }
    }


}
