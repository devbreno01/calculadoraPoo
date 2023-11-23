/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Calcular implements Icalcular{
    
    private float num1;
    private float num2;
    
    public float getnum1(){
        return num1;
    }
    public void setnum1(float num1){
        this.num1 = num1;
    }
    
    public float getnum2(){
        return num2;
    }
    public void setnum2(float num2){
        this.num2 = num2;
    }

    @Override
    public float somar(float num1, float num2) {
        
        float resultado = num1 + num2;
        return resultado;
    }

    @Override
    public float subtrair(float num1, float num2) {
       
        float resultado = num1 - num2;
        return resultado;
    }

    @Override
    public float multiplicar(float num1, float num2) {
         
         
         float resultado = num1 * num2;
         return resultado;
    }

    @Override
    public float dividir(float num1, float num2) {
         
         
         float resultado = num1 / num2;
         return resultado;
        
    }
    
    public float resto(float num1, float num2){
        float resultado = num1 % num2;
        return resultado;
    }
}
