/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author welton
 */
public class exemploFuncao {
    static int somar(int x, int y){
        int soma = x+y;
        return soma;
    }
    
    public static void main(String[] args) {
        int sm = somar(2,5);
        System.out.println("O valor da soma é: "+ sm);
    }
}
