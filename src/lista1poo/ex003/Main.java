package lista1poo.ex003;

import javax.swing.JOptionPane;

public class Main 
{
    public static void main(String[] args) {
        
        int opc = 0;
        Funcionario funcionario1 = null;
        
        int cracha;
        String nome;
        char tipoVinculo = 0;
        float valorHora, qtdeHora, salario, valorDesconto;
        
        while(opc != 4)
        {
           opc = Integer.parseInt
                (JOptionPane.showInputDialog("Menu: \n1 - Cadastrar Funcionário\n2 - Consultar Folha de Pagamento\n3 - Alterar Remuneração\n4 - Sair"));
           switch (opc)
           {
               case 1:
                   tipoVinculo = JOptionPane.showInputDialog("Vínculo:").charAt(0);
                   
                   funcionario1 = new Funcionario();
                   funcionario1.setTipoVinculo(tipoVinculo);
                   if(tipoVinculo == 'H')
                   {
                        cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá:"));
                        nome = JOptionPane.showInputDialog("Nome:"); 
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor por Hora: "));
                        qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de horas trabalhadas: "));
                        valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Total de descontos: "));                         
                       
                        funcionario1.setCracha(cracha);
                        funcionario1.setNome(nome);
                        funcionario1.setValorHora(valorHora);
                        funcionario1.setQtdeHora(qtdeHora);
                        funcionario1.setValorDesconto(valorDesconto);
                        
                   }else{
                        cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá:"));
                        nome = JOptionPane.showInputDialog("Nome:"); 
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
                        valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Total de descontos: "));
                        
                        funcionario1.setCracha(cracha);
                        funcionario1.setNome(nome);
                        funcionario1.setSalario(salario);
                        funcionario1.setValorDesconto(valorDesconto);
                   }                                     
                   break;
               case 2:
                   if(funcionario1 == null)
                   {
                     JOptionPane.showMessageDialog(null, "Nenhuma funcionário cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);  
                   }else{
                       
                       if(tipoVinculo == 'H'){
                           JOptionPane.showMessageDialog(null, funcionario1.imprimir());
                       }else{
                           JOptionPane.showMessageDialog(null, funcionario1.imprimir());
                       }
                   }
                   break;
               case 3:
                   if(funcionario1 == null)
                   {
                     JOptionPane.showMessageDialog(null, "Nenhuma funcionário cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);    
                   }else{
                       if(tipoVinculo == 'H')
                       {
                            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor por Hora: "));
                            qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de horas trabalhadas: "));                            
                            
                            funcionario1.setValorHora(valorHora);
                            funcionario1.setQtdeHora(qtdeHora);
                            
                            JOptionPane.showMessageDialog(null, funcionario1.imprimir());
                       }else{
                            salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
                            
                            funcionario1.setSalario(salario);
                            
                            JOptionPane.showMessageDialog(null, funcionario1.imprimir());
                       }
                   }
                   break;
               case 4:
                   break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    break; 
           }
           
        }
        
        
    }
    
}
