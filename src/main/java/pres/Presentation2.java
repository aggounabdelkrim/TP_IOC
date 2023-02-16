/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pres;

import dao.IDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import metier.IMetier;

/**
 *
 * @author Karim-PC
 */
public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
        String daoClassName = scanner.nextLine();
        System.out.println("daoClassName---" + daoClassName);
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println("Data---> "+dao.getData());
        
        String metierClassName = scanner.nextLine();
        System.out.println("metierClassName---" + metierClassName);
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier, dao);
                
        System.out.println("Resultat---> "+metier.calcul());
    }
}
