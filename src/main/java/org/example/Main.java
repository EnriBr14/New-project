package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RegistroD regAutUsu = new RegistroD();

        //Instanciar a los usuarios
        Usuario u1 = new Usuario(1L, "LA Park", "7245469874");
        regAutUsu.agregarUsuario(u1);

        Usuario u2 = new Usuario(2L, "Mistico", "7224873215");
        regAutUsu.agregarUsuario(u2);

        Usuario u3 = new Usuario(3L, "Cibernetico", "7131234569");
        regAutUsu.agregarUsuario(u3);

        //Instanciar autos
        Auto a1 = new Auto(1L, "Cavalier", "Chevrolet", 1L);
        regAutUsu.registrarAuto(a1);

        Auto a2 = new Auto(2L, "Denali", "GM", 2L);
        regAutUsu.registrarAuto(a2);

        Auto a3 = new Auto(3L, "Bocho", "Wolksvagen", 3L);
        regAutUsu.registrarAuto(a3);

        Auto a4 = new Auto(4L, "David", "GM", 1L);
        regAutUsu.registrarAuto(a4);

        Auto a5 = new Auto(5L, "Takoma", "MG", 2L);
        regAutUsu.registrarAuto(a5);

        System.out.println(regAutUsu.listarAutosPU(u2.getId()));


    }
}