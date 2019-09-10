/**
 * Programa para obtener un libro.
 * @author Andrade Hernández Carlos
 * @date 10/09/2019
 * @version 1.0
**/


public class Libro{
    
        //Atributos
        String autor, titulo;
        int anio;

        //Métodos
        
        /**
         * Constructor por default
        **/
        public Libro(){
            titulo = ""; 
            autor = "";
            anio = 0; 
        }
        
        /**
         *Constructor para asignar los valores
         * @param titulo por default
         * @param autor por default
         * @param año por default
        **/
        public Libro(String titulo, String autor,int anio){
            this.titulo = titulo;
            this.autor = autor;
            this.anio = anio;
        }
        
        /**
         * Método para asignar los titulos
         * @param titulo asignar titulo
        **/
        public void setTitulo(String titulo){
            this.titulo = titulo;   
        }
        
        /**
         * Método para obtener titulo
         * @return Obtener titulo
        **/
        public String getTitulo(){
            return titulo;
        }
    
        /**
         * Método para asignar autor
         * @param autor ASignar autor
        **/
        public void setAutor(String Autor){
            this.autor = autor;
        } 
    
        /**
         * Método para obtener autor
         * @return Obtiene autor
        **/
        public String getAutor(){
            return autor;
        }
    
        /**
         * Método para asignar año
         * @param anio Asigna anio
        **/
        public void setAnio(int anio){
            this.anio = anio;
        }
        
        /**
         * Método para obtener año de publicacion
         * @return Obtener año
        **/
        public int getAnio(){
            return anio;
        }
    } 

