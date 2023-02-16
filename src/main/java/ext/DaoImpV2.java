/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ext;

import dao.IDao;

/**
 *
 * @author Karim-PC
 */
public class DaoImpV2 implements IDao {

    @Override
    public double getData() {
        /**
         * se connecter au capteurs pour récuper la donnée
         */
        System.out.println("Version capteurs ...");
        double data = 77;
        return data;
    }

}
