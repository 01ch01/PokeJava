/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 25, 2019 at 3:44:56 PM
 * @version 0.1
 */
package model;

public class Charmander extends Pokemon {

    public Charmander() {
        this.id = 004;
        this.nome = "Charmander";
        this.tipo = "Fogo";
    }

    @Override
    public String caracteristicas() {
        return "Desde que nasceu, uma chama queima na ponta de sua cauda. "
                + "Sua vida chega ao fim caso essa chama seja apagada.";
    }

}
