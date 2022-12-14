import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {

        ArrayList<String> tarefasDb = new ArrayList();
        boolean continuar = true;
        String opt, task;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo ao Gerenciador de Tarefas!");

        while (continuar) {
            System.out.println("\n\nEscolha uma opcao.\n1- Adicionar Tarefa | 2- Listar Tarefas | 3- Apagar Tarefa | 4- SAIR");
            opt = sc.nextLine();
            
            switch (opt) {
                case "1" -> {
                    System.out.println("\nDigite a tarefa que sera ADICIONADA:");
                    task = sc.nextLine();
                    tarefasDb.add(task);
                }
                case "2" -> {
                    int i = 1;
                    System.out.println("\n-------------------------------");
                    for (String tarefa : tarefasDb){
                        System.out.println(i+" - "+tarefa);
                        i++;
                    }
                    System.out.println("-------------------------------");
                }
                case "3" -> {
                    System.out.println("\nDigite o numero tarefa que sera REMOVIDA:");
                    task = sc.nextLine();
                    tarefasDb.remove(Integer.parseInt(task) - 1);
                }
                case "4" -> {
                    continuar = false;
                }
                default ->
                    System.out.println("\nOpcao Invalida!");
            }
        }
        sc.close();
    }

}
