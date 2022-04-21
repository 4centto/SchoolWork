package clases;

public class Libro {
    private String isbn;
    private String titulo;
    private String nombreAutor;
    private String paternoAutor;
    private String maternoAutor;
    private String editorial;
    private String annioEdicion;
    private String paginas;
    private String prologo;
    private String genero;
    private String sintesis;
    private String numeroEdicion;
    private String numVolumen;
    private String numCapitulos;
    private String nombreAutorDos;
    private String paternoAutorDos;
    private String maternoAutorDos;

    public Libro(String isbn, String titulo, String nombreAutor, String paternoAutor, String maternoAutor, String editorial, String annioEdicion, String paginas, String prologo, String genero, String sintesis, String numeroEdicion, String numVolumen, String numCapitulos, String nombreAutorDos, String paternoAutorDos, String maternoAutorDos) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.paternoAutor = paternoAutor;
        this.maternoAutor = maternoAutor;
        this.editorial = editorial;
        this.annioEdicion = annioEdicion;
        this.paginas = paginas;
        this.prologo = prologo;
        this.genero = genero;
        this.sintesis = sintesis;
        this.numeroEdicion = numeroEdicion;
        this.numVolumen = numVolumen;
        this.numCapitulos = numCapitulos;
        this.nombreAutorDos = nombreAutorDos;
        this.paternoAutorDos = paternoAutorDos;
        this.maternoAutorDos = maternoAutorDos;
    }
    
    public Libro(){
        
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String aux = isbn;
        for(int i = 0; i < 30-isbn.length(); i++){
            aux += " ";
        }
        this.isbn = aux;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        String aux = titulo;
        for(int i = 0; i < 100-titulo.length(); i++){
            aux += " ";
        }
        this.titulo = aux;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        String aux = nombreAutor;
        for(int i = 0; i < 30-nombreAutor.length(); i++){
            aux += " ";
        }
        this.nombreAutor = aux;
    }

    public String getPaternoAutor() {
        return paternoAutor;
    }

    public void setPaternoAutor(String paternoAutor) {
        String aux = paternoAutor;
        for(int i = 0; i < 20-paternoAutor.length(); i++){
            aux += " ";
        }
        this.paternoAutor = aux;
    }

    public String getMaternoAutor() {
        return maternoAutor;
    }

    public void setMaternoAutor(String maternoAutor) {
        String aux = maternoAutor;
        for(int i = 0; i < 20-maternoAutor.length(); i++){
            aux += " ";
        }
        this.maternoAutor = aux;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        String aux = editorial;
        for(int i = 0; i < 20-editorial.length(); i++){
            aux += " ";
        }
        this.editorial = aux;
    }

    public String getAnnioEdicion() {
        return annioEdicion;
    }

    public void setAnnioEdicion(String annioEdicion) {
        String aux = annioEdicion;
        for(int i = 0; i < 4-annioEdicion.length(); i++){
            aux += " ";
        }
        this.annioEdicion = aux;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        String aux = paginas;
        for(int i = 0; i < 4-paginas.length(); i++){
            aux += " ";
        }
        this.paginas = aux;
    }

    public String getPrologo() {
        return prologo;
    }

    public void setPrologo(String prologo) {
        String aux = prologo;
        for(int i = 0; i < 60-prologo.length(); i++){
            aux += " ";
        }
        this.prologo = aux;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        String aux = genero;
        for(int i = 0; i < 10-genero.length(); i++){
            aux += " ";
        }
        this.genero = aux;
    }

    public String getSintesis() {
        return sintesis;
    }

    public void setSintesis(String sintesis) {
        String aux = sintesis;
        for(int i = 0; i < 200-sintesis.length(); i++){
            aux += " ";
        }
        this.sintesis = aux;
    }

    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(String numeroEdicion) {
        String aux = numeroEdicion;
        for(int i = 0; i < 3-numeroEdicion.length(); i++){
            aux += " ";
        }
        this.numeroEdicion = aux;
    }

    public String getNumVolumen() {
        return numVolumen;
    }

    public void setNumVolumen(String numVolumen) {
        String aux = numVolumen;
        for(int i = 0; i < 2-numVolumen.length(); i++){
            aux += " ";
        }
        this.numVolumen = aux;
    }

    public String getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(String numCapitulos) {
        String aux = numCapitulos;
        for(int i = 0; i < 2-numCapitulos.length(); i++){
            aux += " ";
        }
        this.numCapitulos = aux;
    }

    public String getNombreAutorDos() {
        return nombreAutorDos;
    }

    public void setNombreAutorDos(String nombreAutorDos) {
        String aux = nombreAutorDos;
        for(int i = 0; i < 30-nombreAutorDos.length(); i++){
            aux += " ";
        }
        this.nombreAutorDos = aux;
    }

    public String getPaternoAutorDos() {
        return paternoAutorDos;
    }

    public void setPaternoAutorDos(String paternoAutorDos) {
        String aux = paternoAutorDos;
        for(int i = 0; i < 20-paternoAutorDos.length(); i++){
            aux += " ";
        }
        this.paternoAutorDos = aux;
    }

    public String getMaternoAutorDos() {
        return maternoAutorDos;
    }

    public void setMaternoAutorDos(String maternoAutorDos) {
        String aux = maternoAutorDos;
        for(int i = 0; i < 20-maternoAutorDos.length(); i++){
            aux += " ";
        }
        this.maternoAutorDos = aux;
    }

    @Override
    public String toString() {
        return isbn + titulo + nombreAutor + paternoAutor + maternoAutor + editorial + annioEdicion + paginas + prologo + 
               genero + sintesis + numeroEdicion + numVolumen + numCapitulos + nombreAutorDos + paternoAutorDos + 
               maternoAutorDos;
    }
    
}
