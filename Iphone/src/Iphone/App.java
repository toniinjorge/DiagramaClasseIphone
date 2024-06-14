package Iphone;
import java.util.Scanner;

import Iphone.Celular.Iphone;

public class App {
    public static void main(String[] args) {   
        
        Iphone ip = new Iphone();
        Scanner s = new Scanner(System.in);
        
        // Testando ReprodutorMusical
        ip.tocar();
        ip.pausar();

 
        System.out.println("Digite uma música: ");
        String musica_lida = s.nextLine();
        ip.selecionarMusica(musica_lida);
        ip.tocar();
        ip.pausar();
        
        System.out.println("________________________________________________________________________");

        // Testando AparelhoTelefonico
        System.out.println("Digite seu número: ");
        String numero_discado = s.nextLine();
        ip.ligar(numero_discado);
        ip.atender();
        ip.iniciarCorreioVoz();

        System.out.println("________________________________________________________________________");
        
        // Testando NavegadorNaInternet
        System.out.println("Digite o site: ");
        String url_digitada = s.nextLine();
        ip.exibitPagina(url_digitada);

        ip.adicionarNovaAba();
        ip.atualizarPagina();

        s.close();
        
    }
}
