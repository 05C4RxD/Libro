import java.util.Scanner;
class MainLibro{
    public static void main(String[]args){
        Scanner op = new Scanner(System.in);

        int isbn, paginas;

        System.out.print("INGRESA EL ISBN: ");
        isbn = op.nextInt();
        System.out.print("INGRESA EL TITULO: ");
        String titulo = op.next();
        System.out.print("INGRESA EL AUTOR: ");
        String autor = op.next();
        System.out.print("INGRESA EL NÙMERO DE PAGINAS: ");
        paginas = op.nextInt();

        Libro libro1 = new Libro();
        
        libro1.ISBN = isbn;
        libro1.titulo = titulo;
        libro1.autor = autor;
        libro1.paginas = paginas;

        libro1.mostrarISBN();
        libro1.mostrarTitulo();
        libro1.mostrarAutor();
        libro1.mostrarPaginas();
    }
}