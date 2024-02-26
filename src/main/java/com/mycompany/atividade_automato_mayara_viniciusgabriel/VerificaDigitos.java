/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_automato_mayara_viniciusgabriel;

/**
 *
 * @author mayar
 */
public class VerificaDigitos {

    // Verifica se tem apenas números no valor fornecido pelo usuário
    public static boolean ausenciaDeLetra(String semLetras) {
        for (char digito : semLetras.toCharArray()) {
            if (!Character.isDigit(digito)) {
                return false;
            }
        }
        return true;
    }
}
