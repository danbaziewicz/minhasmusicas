package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " também é uma boa escolha!");
        }

    }
}
