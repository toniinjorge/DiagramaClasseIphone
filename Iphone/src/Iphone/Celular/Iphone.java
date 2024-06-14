package Iphone.Celular;

import java.util.Scanner;

import Iphone.Navegador.Navegador;
import Iphone.ReprodutorMusical.ReprodutorMusical;
import Iphone.Telefone.AparelhoTelefonico;

public class Iphone implements Navegador, ReprodutorMusical, AparelhoTelefonico {

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo no Iphone");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando Correio de Voz no Iphone");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Musica selecionada: " + musica);
  }

  @Override
  public void tocar() {
    System.out.println("Tocando no Iphone");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando no Iphone");
  }

  @Override
  public void exibitPagina(String url) {
    System.out.println("Abrindo: " + url);

  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando Nova aba no Iphone");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando Página no Iphone");
  }

}
