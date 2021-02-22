package lista1poo.ex001;

public class Pessoa 
{
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char Sexo) {
        this.sexo = Sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int Idade) {
        this.idade = Idade;
    }
    
    public String imprimir(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nIdade: " + idade;
    }
    
    
}
