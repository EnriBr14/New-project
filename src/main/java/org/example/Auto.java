package org.example;

public class Auto {
    private Long id;
    private String Modelo;
    private String Color;
    private Long usuarioId;


    //Constructor method
    public Auto(Long id, String Modelo, String Color, Long usuarioId) {
        this.id = id;
        this.Modelo = Modelo;
        this.Color = Color;
        this.usuarioId = usuarioId;
    }

    //Getters and Setter
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getModelo() {return Modelo;}
    public void setModelo(String modelo) {Modelo = modelo;}

    public String getColor() {return Color;}
    public void setColor(String color) {Color = color;}

    public Long getUsuarioId() {return usuarioId;}
    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}

    public String toString() {
        return "Id del auto" + id + "Modelo: " + Modelo + "Color: " + Color + "Usuario: " + usuarioId;
    }


}
