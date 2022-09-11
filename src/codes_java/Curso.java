package depressao;


import java.util.Date;
import java.util.List;

public class Curso {
	

    private String nome_curso;
    private int carga_horaria;
    private String modalidade;
    private String nivel;
    private Date data_de_inic;
    private Date data_de_fim;
    private Boolean gratuito;
    private Professor professor;
    public List<Aluno> alunos;
}

    public Curso(String nome_curso, int carga_horaria, String modalidade, String nivel, Boolean gratuito, Professor professor) {
    this.nome_curso = nome_curso;
    this.carga_horaria = carga_horaria;
    this.modalidade = modalidade; 
    this.nivel = nivel;
    this.gratuito = gratuito;
    this.professor = professor;
    this.alunos = new ArrayList<>();
}

     public Curso(Date data_de_inic, Date data_de_fim ){
        this.data_de_inic = data_de_inic;
        this.data_de_fim = data_de_fim;

    }

   public String getNome_curso() {
        return nome_curso;
    }
    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }
    public int getCarga_horaria() {
        return carga_horaria;
    }
    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
   
    public boolean isGratuito() {
        return gratuito;
    }
    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    
    }
