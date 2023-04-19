package PatronTemplate;

public class Telecfomunicaciones extends BasicasIngenieria {

    @Override
    public void cursosEspecifico() {

        System.out.println("-----Cursos especificos TELECOMUNICACIONES-----");
        cursoSeñalesCircuitos();
        cursoCircuitosRadioElectricos();
    }

    private void cursoSeñalesCircuitos() {
        System.out.println("Telecomunicaciones: Curso Especifico; Señales de Circuitos");
    }

    private void cursoCircuitosRadioElectricos() {
        System.out.println("Telecomunicaciones: Curso Especifico; Circuitos Radio Electricos");
    }

}
