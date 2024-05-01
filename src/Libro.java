public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimirInfo(){
        System.out.println("*************   LIBRO  *************");
        System.out.println("TITULO:\t" + this.titulo);
        System.out.println("AUTOR:\t" + this.autor);
        System.out.println("PRECIO:\t" + this.precio);
    }
}
