/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author FATEC ZONA LESTE
 */
// Implementação concreta da fábrica de veículos
public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    
    public IFactory GetVehicle(String vehicle) { // Lógica para retornar instâncias de Bike ou Scooter com base no tipo especificado
        switch (vehicle) {
            case "Scooter":
                return new Scooter(); // Retorna uma instância de Scooter
            case "Bike":
                return new Bike(); // Retorna uma instância de Bike
            default:
                throw new RuntimeException("Vehicle " + vehicle + " cannot be created"); // Lança uma exceção se o tipo especificado não for reconhecido
        }
    }
}