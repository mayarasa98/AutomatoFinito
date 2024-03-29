/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_automato_mayara_viniciusgabriel;

/**
 *
 * @author mayar
 */
public class VerificaCpf {

    public static boolean validaCPF(String cpf) {

        if ((cpf.length() != 11)
                || cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
                || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
                || cpf.equals("99999999999")) {
            return false;
        }

        try {
            int somaPrimeiro = 0, somaSegundo = 0,
                    sequenciaPrimeiro = 10, sequenciaSegundo = 11;
            int primeiroDig, segundoDig;

            //Validando o primeiro dígito
            for (int i = 0; i <= 9; i++) {
                somaSegundo += (sequenciaSegundo * (Integer.parseInt(String.valueOf(cpf.charAt(i)))));
                if (i < 9) {
                    somaPrimeiro += (sequenciaPrimeiro * (Integer.parseInt(String.valueOf(cpf.charAt(i)))));
                    sequenciaPrimeiro--;
                }
                sequenciaSegundo--;
            }

            int restoPrimeiro = somaPrimeiro % 11;
            primeiroDig = (restoPrimeiro < 2) ? 0 : (11 - restoPrimeiro);

            int restoSegundo = somaSegundo % 11;
            segundoDig = (restoSegundo < 2) ? 0 : (11 - restoSegundo);

            return (primeiroDig == (Integer.parseInt(String.valueOf(cpf.charAt(9)))) && segundoDig == (Integer.parseInt(String.valueOf(cpf.charAt(10)))));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
