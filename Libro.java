class Libro{
    String titulo, autor;
    int paginas, ISBN;

    Libro(){}

    public void mostrarISBN(){
        System.out.println("EL ISBN ES: " + this.ISBN);
    } 
    public void mostrarTitulo(){
        System.out.println("EL TITULO ES: " + this.titulo);
    }

    public void mostrarAutor(){
        System.out.println("El AUTOR ES: " + this.autor);
    }
    public void mostrarPaginas(){
        System.out.println("TIENE " + this.paginas + " PAGINAS");
    }
}