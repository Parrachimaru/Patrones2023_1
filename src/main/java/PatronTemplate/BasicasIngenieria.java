package PatronTemplate;

public abstract class BasicasIngenieria {

    //declarar metodo con algoritmo principal para mostrar las asignaturas basicas
    public void mostrarMalla() {
        //Asignaturas comunes
        cursoMatematicas();
        cursoFisica();
        cursoCalculo();
        //Asignaturas Especificas
        cursosEspecifico();
        

    }

    //Metodos
    private void cursoMatematicas() {
        System.out.println("Basica ingenieria, Curso de matematicas");
    }

    private void cursoFisica() {
        System.out.println("Basica ingenieria, Curso de Fisica");

    }

    private void cursoCalculo() {
        System.out.println("Basica ingenieria, Curso de Calculo");

    }

    public abstract void cursosEspecifico();

}
