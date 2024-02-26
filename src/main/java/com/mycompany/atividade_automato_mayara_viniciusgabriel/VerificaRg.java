/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_automato_mayara_viniciusgabriel;

/**
 *
 * @author mayar
 */
public class VerificaRg {

    // Considerando que os RG's de São Paulo tem 9 dígitos
    public static boolean validaRg(String numeroRg) {
        if (numeroRg == null || numeroRg.length() != 9) {
            return false;
        }

        // Calculando o dígito verificador
        int soma = 0;
        int multiplicador[] = {2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 8; i++) {
            int digitoCalculado = Character.getNumericValue(numeroRg.charAt(i));
            soma += digitoCalculado * multiplicador[i];
        }

        int resto = soma % 11;
        int digitoVerificador = (11 - resto);

        if (digitoVerificador == 10) {
            digitoVerificador = 0;
        }

        // Verificação do último dígito
        // Pega o último dígito fornecido pelo usuário e faz a comparação com o dígito calculado
        int digitoUsuario = Character.getNumericValue(numeroRg.charAt(8));
        return digitoVerificador == digitoUsuario;
    }
}
