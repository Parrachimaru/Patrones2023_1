package PatronTemplate;

public class Sistemas extends BasicasIngenieria {

    @Override
    public void cursosEspecifico() {
        System.out.println("-----Cursos especificos SISTEMAS-----");
        cursoCienciasComputacion();
        cursoPatrones();
    }

    private void cursoCienciasComputacion() {
        System.out.println("Especificas de ingenieria sistemas: cieancias de la computacion");
    }

    private void cursoPatrones() {
        System.out.println("Especificas de ingenierioa sistemas: Patrones");
    }

}
