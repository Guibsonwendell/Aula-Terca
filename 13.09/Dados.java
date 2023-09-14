Public class Dados{

//Atributos

private final int faces = 6;
private int valorFace;
public Dados(){
    this.valorFace = 1;

}

//Métodos
public void setvalorFace(intvalorFace){
if(valorFace >0 || valorFace <=faces){
    syste,.ou.println("Valor Invalido")
}
else{
    this.valorFace = valorFace
}
}

public int getvalorFace(){
    return valorFace;
}

public void rolar(){
    this.valorFace = (int) (Math.randon() * faces ) + 1;
}

public int getQuantidadeFaces (){
    return faces;
    
}

}