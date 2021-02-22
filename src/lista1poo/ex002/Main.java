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
                    aluno1 = new Aluno();
                    ra =  JOptionPane.showInputDialog("RA:");
                    nome =  JOptionPane.showInputDialog("Nome:");
                    aluno1.setRa(ra);
                    aluno1.setNome(nome);
                    
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog(null, "AC1:"));
                    aluno1.setAc1(ac1);
                    if (ac1 <= 10 && ac1 >= 0)
                    {                        
                        ac2 = Float.parseFloat(JOptionPane.showInputDialog(null, "AC2:"));
                        aluno1.setAc2(ac2);
                        
                        if(ac2 <= 10 && ac2 >= 0)
                        {
                            ag = Float.parseFloat(JOptionPane.showInputDialog(null, "AG:"));
                            aluno1.setAg(ag);
                            
                            if(ag <= 10 && ag >= 0)
                            {
                                af = Float.parseFloat(JOptionPane.showInputDialog(null, "AF:"));
                                aluno1.setAf(af);
                                
                                if(af <= 10 && af >= 0)
                                {
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null, "Insira um valor de 0 á 10!", "Atenção", JOptionPane.WARNING_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Insira um valor de 0 á 10!", "Atenção", JOptionPane.WARNING_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Insira um valor de 0 á 10!", "Atenção", JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                      JOptionPane.showMessageDialog(null, "Insira um valor de 0 á 10!", "Atenção", JOptionPane.WARNING_MESSAGE);  
                    }
                    
                        
                        
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

                        
                                               

            
                    
                                                         
                    
