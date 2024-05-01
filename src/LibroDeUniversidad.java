public class LibroDeUniversidad extends LibroExtendido{
    private String facultadQuePublica;

    public LibroDeUniversidad(String titulo, String autor, String curso, String facultadQuePublica) {
        super(titulo, autor, curso);
        this.facultadQuePublica = facultadQuePublica;
    }

    public LibroDeUniversidad(String titulo, String autor) {
        super(titulo, autor);
    }

    public String getFacultadQuePublica() {
        return facultadQuePublica;
    }

    public void setFacultadQuePublica(String facultadQuePublica) {
        this.facultadQuePublica = facultadQuePublica;
    }

    public void imprimirInfo(){
        System.out.println("*************   LIBRO EXTENDIDO *************");
        System.out.println("TITULO:\t" + this.getTitulo());
        System.out.println("AUTOR:\t" + this.getAutor());
        System.out.println("PRECIO:\t" + this.getPrecio());
        System.out.println("CURSO ASOCIADO:\t" + this.getCurso());
        System.out.println("UNIVERSIDAD: \t" + this.getFacultadQuePublica());
    }

}
