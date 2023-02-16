/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import dao.IDao;

/**
 *
 * @author Karim-PC
 */
public class MetierImpl implements IMetier {

    //Couplage Faible
    private IDao dao;

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp * 223 * Math.cos(tmp);
        return res;
    }
    /**
    * Pour injecter dans la varible dao un objet d'une classe qui implémente 
    * l'interface IDao
    * @param dao 
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
