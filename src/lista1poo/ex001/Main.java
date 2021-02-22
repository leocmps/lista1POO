package lista1poo.ex001;

import javax.swing.JOptionPane;

public class Main 
{
    public static void main(String[] args) 
    {
        int opc = 0;
        Pessoa pessoa1 = null;
        String cpf,nome;
        char sexo;
        int idade;
        while (opc != 3)
        {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("Menu:\n1 - Criar Pessoa\n2 - Mostrar Pessoa\n3 - Sair"));
            switch(opc)
            {
                case 1:
                    nome =  JOptionPane.showInputDialog("Nome:");
                    cpf =   JOptionPane.showInputDialog("CPF:");
                    sexo =  JOptionPane.showInputDialog("Sexo:").charAt(0);
                    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:")); 
                    pessoa1 = new Pessoa();
                    pessoa1.setNome(nome);
                    pessoa1.setCPF(cpf);
                    pessoa1.setSexo(sexo);
                    pessoa1.setIdade(idade);
                    break;
                case 2:
                    if(pessoa1 == null)
                    {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, pessoa1.imprimir());
                        
                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    break;
        }
        
    }
    
        
}
}