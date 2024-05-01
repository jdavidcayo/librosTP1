public class LibroExtendido extends Libro{
    private String curso;
    public LibroExtendido(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }
    public LibroExtendido(String titulo, String autor) {
        super(titulo, autor);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void imprimirInfo(){
        System.out.println("*************   LIBRO EXTENDIDO *************");
        System.out.println("TITULO:\t" + this.getTitulo());
        System.out.println("AUTOR:\t" + this.getAutor());
        System.out.println("PRECIO:\t" + this.getPrecio());
        System.out.println("CURSO ASOCIADO:\t" + this.curso);
    }
}
