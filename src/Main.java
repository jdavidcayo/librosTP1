public class Main {
    public static void main(String[] args) {
        LibroExtendido lExt = new LibroExtendido("Clean code", "Robert C. Martin", "Programacion 2");
        lExt.setPrecio(10000.0);
        LibroDeUniversidad lExtUniversidad = new LibroDeUniversidad("Marcando el paso", "David Cayo", "Programacion 2", "UTN FRM");
        lExtUniversidad.setPrecio(250.0);
        LibroNovela lNovela = new LibroNovela("El Silmarillion", "J.R.R. Tolkien", "aventura");
        lNovela.setPrecio(400.0);

        System.out.println(" ------------------------------- ");
        lExt.imprimirInfo();
        System.out.println(" ------------------------------- ");
        lExtUniversidad.imprimirInfo();
        System.out.println(" ------------------------------- ");
        lNovela.imprimirInfo();

    }
}