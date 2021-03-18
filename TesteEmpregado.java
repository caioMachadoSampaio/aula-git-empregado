public class TesteEmpregado{
public static void main (String [] args){
Empregado e1 = new Empregado ();
Empregado e2 = new Empregado();
Empregado e3 = new Empregado ();
//e agora, como configurar o tipo deles?
//comentario a mais
//adicionar à classe Empregado.java
public void setSalario (double salario){
this.salario = salario;
}
public double getSalario (){
return this.salario;
}
public void setComissao (double comissao){
this.comissao = comissao;
}
public double getComissao (){
return this.comissao;
}
public void setBonus (double bonus){
this.bonus = bonus;
}
public double getBonus (){
return this.bonus;
}

}
}

