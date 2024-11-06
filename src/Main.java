/**
 * Description
 * test sur javadoc
 * pour voir que tout va bien
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void afficherHello(String name){
        /**
         * permet d'afficher un message Hello
         * @param name le nom qu'on veut afficher
         */

        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        Main.afficherHello("Frank");

    }
}