/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author FATEC ZONA LESTE
 */
public abstract class VehicleFactory { // Classe abstrata que define o contrato para a fábrica de veículos

    public abstract IFactory GetVehicle(String vehicle); // Método abstrato para obter um veículo
}
