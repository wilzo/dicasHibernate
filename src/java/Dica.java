import javax.persistence.*;
import java.util.Date;

@Entity
public class Dica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String autor;
    @Temporal(TemporalType.DATE)
    private Date dataPublicacao;

    public Dica() {}

    public Dica(String titulo, String descricao, String autor, Date dataPublicacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}