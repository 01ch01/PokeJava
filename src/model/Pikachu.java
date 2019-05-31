/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 25, 2019 at 3:44:25 PM
 * @version 0.1
 */
package model;

public class Pikachu extends Pokemon {

    public Pikachu() {
        this.id = 025;
        this.nome = "Pikachu";
        this.tipo = "Elétrico";
    }

    @Override
    public String caracteristicas() {
        return "Tem pequenas bolsas elétricas em suas bochechas."
                + "Se ameaçado, descarrega eletricidade dessas bolsas";
    }

}
