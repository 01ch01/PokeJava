/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 25, 2019 at 3:01:36 PM
 * @version 0.1
 */
package model;

import java.util.Scanner;

public class Pokemon {

    Scanner input = new Scanner(System.in);

    protected int id;
    protected String nome;
    protected char genero;
    protected String tipo;
    protected String[] ataques;

    public Pokemon() {
        this.id = -1;
        this.nome = "";
        this.genero = 'X';
        this.tipo = "desconhecido";
        this.ataques = new String[4];
    }

    public String caracteristicas() {
        return "Exibindo características genéricas de um pokémon";
    }

    public String mostrar(Pokemon a, Pokemon b, Pokemon c, Pokemon d) {
        String infoA = "\n" + a.nome + "\n" + a.caracteristicas() + "\n";
        String infoB = "\n" + b.nome + "\n" + b.caracteristicas() + "\n";
        String infoC = "\n" + c.nome + "\n" + c.caracteristicas() + "\n";
        String infoD = "\n" + d.nome + "\n" + d.caracteristicas() + "\n";
        return infoA + infoB + infoC + infoD;
    }
}
