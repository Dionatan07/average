package application;

import entities.Average;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
    
        Average[] vect = new Average[3];
        
        double sum = 0.0;
        
        System.out.println("Digite as notas do aluno: ");
        for (int i = 0; i < vect.length; i++) {
            double grade = teclado.nextDouble();
            vect[i] = new Average(grade);
            sum += vect[i].getGrade();
        }
        
        double avg = sum / 3;
        
        System.out.printf("Final average: %.2f%n", avg);
        
        
        
    }
    
}
