package Ejercicio6;

/**
 *
 * @author Daniel
 */
public class Libro {

    private int ISBN;
    private int numeroPaginas;
    private String titulo;
    private String autor;

    // constructor
    public Libro(int ISBN, int numeroPaginas, String titulo, String autor) {
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    // metodos get
    public int getISBN() {
        return ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // metodos set
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // toString
    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene "
                + numeroPaginas + " paginas.\n";
    }

}
