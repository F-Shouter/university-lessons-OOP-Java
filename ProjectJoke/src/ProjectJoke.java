/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Fujoshi Shouter
 */
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ProjectJoke {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SubClass tu = new SubClass();
        
        String gatoOlhosAbertos = 
                      "──────▄▀▄─────▄▀▄ \n" +
                      "─────▄█░░▀▀▀▀▀░░█▄ \n" +
                      "─▄▄──█░░░░░░░░░░░█──▄▄ \n" +
                      "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█ \n";
                      
        String gatoOlhosFechados = 
                      "──────▄▀▄─────▄▀▄ \n" +
                      "─────▄█░░▀▀▀▀▀░░█▄ \n" +
                      "─▄▄──█░░░X▀▀▀X░░█──▄▄ \n" +
                      "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█ \n";
        
        System.out.println("Qual é o teu nome, meu jovem?");
        String nome = entrada.nextLine();
        tu.setNome(nome);
        System.out.println("\n");
        System.out.println("Gosta de anime, " + tu.getNome() + " ?");
        String resposta1 = entrada.nextLine();
        resposta1 = resposta1.toLowerCase();
        boolean resposta = resposta1.equals("sim") || resposta1.equals("s");
        tu.setResposta1(resposta);
        tu.SeuFinal();
        System.out.println("ah, " + tu.getResposta2());
        
        String[] linhasAbertas = gatoOlhosAbertos.split("\n");
        String[] linhasFechadas = gatoOlhosFechados.split("\n");
        
        int delay = 1; // Delay de 1 segundo

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        for (int i = 0; i < linhasAbertas.length; i++) {
            final int index = i;
            // Usamos o índice do loop para determinar se devemos imprimir os olhos abertos ou fechados
            executor.schedule(() -> {
                if (index % 2 == 0) {
                    System.out.println(linhasAbertas[index / 2]);
                } else {
                    System.out.println(linhasFechadas[index / 2]);
                }
            }, delay * i, TimeUnit.SECONDS);
        }

        executor.shutdown();
        entrada.close();
    }
}
