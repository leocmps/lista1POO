package lista1poo.ex002;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) 
    {
        int opc = 0;
        Aluno aluno1 = null;
        
        String ra, nome;
        float ac1, ac2, ag, af;
        
        while(opc != 3)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1 - Criar Aluno\n2 - Mostrar Aluno\n3 - Sair"));
            switch (opc)
            {
                case 1:
                    ra =  JOptionPane.showInputDialog("RA:");
                    nome =  JOptionPane.showInputDialog("Nome:");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog(null, "AC1:"));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog(null, "AC2:"));
                    ag = Float.parseFloat(JOptionPane.showInputDialog(null, "AG:"));
                    af = Float.parseFloat(JOptionPane.showInputDialog(null, "AF:"));
                    aluno1 = new Aluno();
                    aluno1.setRa(ra);
                    aluno1.setNome(nome);
                    aluno1.setAc1(ac1);
                    aluno1.setAc2(ac2);
                    aluno1.setAg(ag);
                    aluno1.setAf(af);                                       
                    break;
                case 2:
                    if(aluno1 == null)
                    {
                        JOptionPane.showMessageDialog(null, "Nenhuma aluno cadastradol!", "Atenção", JOptionPane.WARNING_MESSAGE);                        
                    }else{
                        JOptionPane.showMessageDialog(null, aluno1.imprimir());
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
