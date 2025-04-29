package exercicios_poo.livraria;

public class Livraria {
    private String title;
    private boolean emprestado;

    public Livraria(String title, boolean emprestado) {
        this.title = title;
        this.emprestado = emprestado;
    }

    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar(String title) {

        if (emprestado == true) {
            this.emprestado = false;
        } else {
            System.out.println("Livro indisponível.");
        }
    }
}
