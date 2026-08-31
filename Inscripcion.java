/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Inscripcion {
    private int inasistencias;
    private final SituacionFinal situacionfinal;
    
    public Inscripcion(){
        this.inasistencias = 0;
        this.situacionfinal = new SituacionFinal();
    }
    public void registrarAsistencia(){
        System.out.println ("Asistencia registrada con éxito");
    }
    public void registrarInasistencia(){
        this.inasistencias++;
    }
    public void cargarSituacionFinal(String estadoElegido){
        this.situacionfinal.setEstado(estadoElegido);
    }
    public boolean estaFinalizada(){
        return this.situacionfinal.getEstado() != null;
    }
}
