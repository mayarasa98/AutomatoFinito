/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atividade_automato_mayara_viniciusgabriel;

import javax.swing.JOptionPane;

/**
 *
 * @author mayar
 */
public class Principal {

    public static void main(String[] args) {

        while (true) {
            String value = JOptionPane.showInputDialog("Digite um CPF ou RG. \nOu digite 'sair' para sair! ");
            String valorFormatado = value.replace(".", "").replace("-", "");

            if (valorFormatado == null || valorFormatado.equalsIgnoreCase("sair")) {
                break;
            }

            switch (valorFormatado.length()) {

                case 11:
                    if (VerificaDigitos.ausenciaDeLetra(valorFormatado)) {
                        JOptionPane.showMessageDialog(null, VerificaCpf.validaCPF(valorFormatado) ? "Este CPF é válido!" : "Este CPF não é válido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                    }

                    break;

                case 9:
                    if (VerificaDigitos.ausenciaDeLetra(valorFormatado)) {
                        JOptionPane.showMessageDialog(null, VerificaRg.validaRg(valorFormatado) ? "Este RG é válido!" : "Este RG não é válido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Informação inválida!");
                    break;
            }
        }
    }
}
