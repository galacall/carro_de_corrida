/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleprojectbeta;

public class App {
    public static  void main(String[] args){
        App aplicacao = new App();
        Pessoa p1 = new Pessoa("Bill Gates");
        Piloto pil1 = new Piloto("Ayrton Ayton Ayrrton Senna do Brasil");
        System.out.println(p1.mostrarNome());
        System.out.println(pil1.mostrarNome());
        
        veiculo v1 = new veiculo("Mercedes");
        carro crr1 = new carro("Camaro Amarelo 13");
        System.out.println(v1.mostrarVeiculo());
        System.out.println(crr1.mostrarVeiculo());
    }
}
