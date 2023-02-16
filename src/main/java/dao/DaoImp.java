/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Karim-PC
 */
public class DaoImp implements IDao {

    @Override
    public double getData() {
        /**
         * se connecter à la DDB récuper la donnée
         */
        System.out.println("Version base des données ...");
        double temp = Math.random() * 40;
        return temp;
    }

}
