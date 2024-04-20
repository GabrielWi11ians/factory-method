/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class Bike implements IFactory { // Implementação da interface IFactory para a classe Bike
    
    @Override
    public void Drive(int miles) {
        System.out.println("Drive the Bike : " + miles + " km"); // Mensagem de condução para a moto
    }
}
