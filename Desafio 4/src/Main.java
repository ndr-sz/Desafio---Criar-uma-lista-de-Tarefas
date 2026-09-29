import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) throws Exception {
          
        ArrayList<Tarefa> tarefa = new ArrayList<>();
        tarefa.add(new Tarefa("Estudar Java"));
        tarefa.add(new Tarefa("Fazer exercícios"));
        tarefa.add(new Tarefa("Organizar arquivos"));
        tarefa.add(new Tarefa("Revisar anotações"));

        
        if (tarefa.get(0).concluir()) {
            System.out.println(tarefa.get(0).getDescricao() + ": Operação realizada."); 
        } else {
            System.out.println(tarefa.get(0).getDescricao() + ": Operação recusada.");
        }
           
        if (tarefa.get(1).concluir()) {
            System.out.println(tarefa.get(1).getDescricao() + ": Operação realizada.");   
        } else {
            System.out.println(tarefa.get(1).getDescricao() + ": Operação recusada.");
        }

        if (tarefa.get(0).concluir()) {
            System.out.println(tarefa.get(0).getDescricao() + ": Operação realizada.");
        } else {
            System.out.println(tarefa.get(0).getDescricao() + ": Operação recusada.");
        }
     
        if (tarefa.get(2).reabrir()) {
            System.out.println(tarefa.get(2).getDescricao() + ": Operação realizada.");
        } else {
            System.out.println(tarefa.get(2).getDescricao() + ": Operação recusada.");
        }

        if (tarefa.get(1).reabrir()) {
            System.out.println(tarefa.get(1).getDescricao() + ": Operação realizada.");      
        } else {
            System.out.println(tarefa.get(1).getDescricao() + ": Operação recusada.");
        }
        
        int contagemC = 0;
        int contagemP = 0;

        for (Tarefa dados : tarefa) {

            if (dados.verificarStatus().equals("Concluída")) {
                contagemC++;
            }else {
                contagemP++;
            }
            dados.exibirDados();
        }

        System.out.println("Tarefas concluídas: " + contagemC);
        System.out.println("Tarefas Pendentes: " + contagemP);
        System.out.println("Tarefa encontrada: " + tarefa.get(3).getDescricao());
        System.out.println("Status: " + tarefa.get(3).verificarStatus());
    }
}
