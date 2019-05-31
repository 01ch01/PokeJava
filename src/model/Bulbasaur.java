/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 25, 2019 at 3:45:24 PM
 * @version 0.1
 */
package model;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        this.id = 001;
        this.nome = "Bulbasaur";
        this.tipo = "Grama";
    }

    @Override
    public String caracteristicas() {
        return "Há uma semente em suas costas desde o nascimento. "
                + "A semente cresce lentamente";
    }

}
