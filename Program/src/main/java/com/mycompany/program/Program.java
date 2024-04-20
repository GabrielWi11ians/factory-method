/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

// Classe principal que contém o método main
public class Program {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory(); //Cria uma fábrica de veículos concreta

        // Obtém um veículo do tipo Scooter da fábrica e o dirige
        IFactory scooter = factory.GetVehicle("Scooter");
        scooter.Drive(10);
        
        // Obtém um veículo do tipo Bike da fábrica e o dirige
        IFactory bike = factory.GetVehicle("Bike");
        bike.Drive(20);
    }
}
