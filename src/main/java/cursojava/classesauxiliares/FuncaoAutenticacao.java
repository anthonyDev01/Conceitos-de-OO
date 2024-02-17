package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
    private PermitirAcesso permitirAcesso;

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }
    public boolean autenticar(){
        return permitirAcesso.autenticar();
    }
}
