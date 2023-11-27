package POO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;


public class HorarioAula {
    private String diaSemana;
    private Date horaInicio;
    private Date horaFim;
    private String materia;

    public HorarioAula(String diaSemana, String horaInicio, String horaFim, String materia) {
        this.diaSemana = diaSemana;
        this.horaInicio = parseHora(horaInicio);
        this.horaFim = parseHora(horaFim);
        this.materia = materia;
    }

    private Date parseHora(String hora) {
        try {
            SimpleDateFormat formatadorHora = new SimpleDateFormat("HH:mm");
            return formatadorHora.parse(hora);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void imprimirInformacoes() {
        DateFormat formatadorHora = new SimpleDateFormat("hh:mm a");

        System.out.println("Dia da semana: " + diaSemana);
        System.out.println("Horário de início: " + formatadorHora.format(horaInicio));
        System.out.println("Horário de fim: " + formatadorHora.format(horaFim));
        System.out.println("Matéria: " + materia);
    }

    public String getMateria() {
        return materia;
    }
}






