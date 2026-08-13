/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package to.pkgdo.list;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
                
        String[] Tarefas = new String[10];
        
        boolean[] concluidas = new boolean[10];
        
        int opcao = 0;
        
        while (opcao != 5) {
            
            System.out.println("\n====== LISTA DE TAREFAS ======");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefa");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - EXcluir Tarefa");
            System.out.println("5 - Sair");
            
            System.out.println("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.hasNextLine();
            
            switch (opcao) {
                
                case 1: 
                    
                    int posicaoLivre = -1;
                    
                    for (int i = 0; i < tarefas.length; i++) {
                }
            }
        }
    }
           
