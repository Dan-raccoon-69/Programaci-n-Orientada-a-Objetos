/**
 * Crear una clase libro que contenga los siguientes atributos:
 * -ISBN
 * -TITULO
 * -AUTOR
 * -NUMERO DE PAGINAS
 * Crear sus respectivos metodos get y set correspondientes para cada atributo.
 * Crear el metodo toString() para mostrar la informacion relativa al
 * kibro con el siguiente formato:
 * "El libro "su titulo" con ISBN "su isbn" creado por el autor "autor" tiene
 * "num paginas" paginas"
 * En el fichero main, crear 2 objetos libro (los valores que se quieran) y mostrarlos
 * por pantalla.
 * Por ultimo, indicar cual de los 2 tiene mas paginas.
 */
package Ejercicio6;

/**
 *
 * @author Daniel
 * @Github: Dan-raccoon-69
 */
public class Principal {

    public static void main(String[] args) {
        Libro libro1 = new Libro(1, 500, "El resplandor", "Stephen King");
        Libro libro2 = new Libro(2, 4000, "El mundo y sus demonios", "Carl Sagan");

        System.out.println(libro1.toString() + libro2.toString());

        String resultado = (libro1.getNumeroPaginas() > libro2.getNumeroPaginas())
                ? "El Libro con el nombre '" + libro1.getTitulo() + "' tiene mas paginas"
                : "El Libro con el nombre '" + libro2.getTitulo() + "' tiene mas paginas";
        System.out.println(resultado);
    }

}
