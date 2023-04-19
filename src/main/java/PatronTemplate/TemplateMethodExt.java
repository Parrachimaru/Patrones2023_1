package PatronTemplate;

public class TemplateMethodExt {

    public static void main(String[] args) {
        //referencia de objetos a la clase abstracta
        BasicasIngenieria cursos;

        //instanciar sobre la subclase
        cursos = new Sistemas();
        cursos.mostrarMalla();

        //instanciar sobre subclases
        cursos = new Telecfomunicaciones();
        cursos.mostrarMalla();
    }

}
