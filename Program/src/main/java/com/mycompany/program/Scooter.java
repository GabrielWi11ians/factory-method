
package com.mycompany.program;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Scooter implements IFactory { // Implementação da interface IFactory para a classe Scooter
    @Override
    public void Drive(int miles) {
        System.out.println("Drive the Scooter : " + miles + " km"); // Mensagem de condução para a Scooter
    }
}
