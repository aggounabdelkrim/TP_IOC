/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pres;

import dao.DaoImp;
import metier.MetierImpl;

/**
 *
 * @author Karim-PC
 */
public class Presentation1 {

    public static void main(String[] args) {
        /**
         * Injection des dépendances par 
         * instanciation statique => new 
         * en utilisant un setter ou via le constructeur
         */
        
        MetierImpl metier = new MetierImpl();
        DaoImp dao = new DaoImp();
        metier.setDao(dao);
        
        System.out.println("Résultat="+metier.calcul());
    }
}
