public class LibroNovela extends Libro{
    private String tipo;
    final String[] tiposDeNovela = {"historica", "romantica", "policial", "realista", "ciencia ficcion", "aventura"};

    public LibroNovela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String aux = "";
        for(String t : tiposDeNovela){
            if(t.equals(tipo)){
                this.tipo = t;
                break;
            }
        }
        this.tipo = tipo;
    }
    public void imprimirInfo(){
        System.out.println("*************   LIBRO  *************");
        System.out.println("TITULO:\t" + this.getTipo());
        System.out.println("AUTOR:\t" + this.getAutor());
        System.out.println("TIPO DE NOVELA:\t" + this.getTipo());
        System.out.println("PRECIO:\t" + this.getPrecio());

    }

}
