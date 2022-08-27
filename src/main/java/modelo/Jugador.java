/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Jugador {
    
    private String Jugador;
    private int acierto;
    private int NOacierto;
    private int tiempo;

    public Jugador(String Jugador, int acierto, int NOacierto, int tiempo) {
        this.Jugador = Jugador;
        this.acierto = acierto;
        this.NOacierto = NOacierto;
        this.tiempo = tiempo;
    }

    public String getJugador() {
        return Jugador;
    }

    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }

    public int getAcierto() {
        return acierto;
    }

    public void setAcierto(int acierto) {
        this.acierto = acierto;
    }

    public int getNOacierto() {
        return NOacierto;
    }

    public void setNOacierto(int NOacierto) {
        this.NOacierto = NOacierto;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Jugador=" + Jugador + ", acierto=" + acierto + ", NOacierto=" + NOacierto + ", tiempo=" + tiempo + '}';
    }

}