

//essa interface é como se fosse um contrato
//a classe que assina esse contrato é obrigada a implementar os metodos dela, no caso o setSenha e autentica
//o comando para isso é o "Implements"

public abstract interface Autenticavel{


    public abstract boolean autentica(int senha);


    public abstract void setSenha(int senha);
}
