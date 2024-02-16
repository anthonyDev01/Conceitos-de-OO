package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClasseFilhas {
    public static void  main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setNome("Anthony");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("192933010");
        diretor.setIdade(33);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setIdade(23);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());



    }
}
