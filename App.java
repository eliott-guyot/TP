package fr.univ_orleans.iut45.mud;

/**
 * app
 *
 */
public class App{
    public static void main( String[] args ){
        Box b = new Box();
        Thing truc = new Thing("truc");
        Thing machin = new Thing("machin");
        b.add(truc);
        b.add(machin);
        b.actionLook();
    }
}