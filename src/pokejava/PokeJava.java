/**
 * Utilizando polimorfismo com Pokémons.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 25, 2019 at 3:01:22 PM
 * @version 0.1
 */
package pokejava;

import model.*;

public class PokeJava {

    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();
        Pokemon p = new Pikachu();
        Pokemon b = new Bulbasaur();
        Pokemon c = new Charmander();
        Pokemon s = new Squirtle();

        System.out.println(pokemon.mostrar(p, c, b, s));
    }

}
