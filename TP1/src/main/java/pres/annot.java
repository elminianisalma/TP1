package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class annot {
    public static void main(String[] args) {
        System.out.println("version annotations");
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier= context.getBean(IMetier.class);
        System.out.println(metier.calcul()); // charger class annotes

    }

}
