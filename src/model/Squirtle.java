/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 25, 2019 at 3:45:04 PM
 * @version 0.1
 */
package model;

public class Squirtle extends Pokemon {

    public Squirtle() {
        this.id = 007;
        this.nome = "Squirtle";
        this.tipo = "Água";
    }

    @Override
    public String caracteristicas() {
        return "Quando ele se esconde em seu casco, está prestes a esguichar "
                + "água com força";
    }

}
