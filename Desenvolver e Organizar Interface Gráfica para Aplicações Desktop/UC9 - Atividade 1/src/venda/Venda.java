/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package venda;

/**
 *
 * @author FRANCISCO
 */

   import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Venda extends JFrame {
    
    private JTextField txtValor;
    private JButton btnCalcular;
    
    public Venda() {
        // Configurações da janela principal
        super("Venda");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Criação dos componentes
        txtValor = new JTextField(10);
        btnCalcular = new JButton("Calcular");
        
        // Adiciona os componentes à janela
        add(new JLabel("Valor da venda:"));
        add(txtValor);
        add(btnCalcular);
        
        // Configuração do evento de clique do botão
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica se o valor informado é válido
                try {
                    double valor = Double.parseDouble(txtValor.getText());
                    if (valor > 500) {
                        // Pede o percentual de desconto e calcula o valor final
                        String input = JOptionPane.showInputDialog(Venda.this, "Informe o percentual de desconto:");
                        double desconto = Double.parseDouble(input);
                        double valorFinal = valor - (valor * desconto / 100);

                        // Exibe o valor final em uma janela de diálogo
                        JOptionPane.showMessageDialog(Venda.this, "Valor final: " + valorFinal);
                    } else {
                        // Exibe o valor sem desconto em uma janela de diálogo
                        JOptionPane.showMessageDialog(Venda.this, "Valor: " + valor);
                    }
                } catch (NumberFormatException ex) {
                    // Exibe uma mensagem de erro se o valor informado não é válido
                    JOptionPane.showMessageDialog(Venda.this, "Valor inválido.");
                }
            }
        });

        // Configurações finais da janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new Venda();
    }
}