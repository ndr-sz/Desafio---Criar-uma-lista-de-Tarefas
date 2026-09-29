public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        concluida = false;
    }
    public String getDescricao(){
        return descricao;
    };
    // public boolean getC(){
    //     return concluida;
    // };
    public boolean concluir() {
        if (concluida == false) {
            concluida = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean reabrir() {
        if (concluida == true) {
            concluida = false; 
            return true;
        } else {
            
            return false;
        }
    }

    public String verificarStatus() {
        if (this.concluida) {
            // System.out.println("Concluída");
            return "Concluída";
        } else {
            // System.out.println("Pendente");
            return "Pendente";
        }
    }

    public void exibirDados() {
        
        System.out.println("Tarefa: " + getDescricao() + " | Status: " + verificarStatus());
    }

}
