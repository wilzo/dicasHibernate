import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;


public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebApplication1PU");
        EntityManager em = factory.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        persistirDica(em, "Priorize suas tarefas", "Uma das primeiras etapas para ser mais produtivo é aprender a priorizar suas tarefas...", "Autor 1", new Date());
        persistirDica(em, "Automatize tarefas rotineiras", "A tecnologia avançada, como a inteligência artificial, pode ser uma grande aliada na redução do esforço necessário para realizar tarefas rotineiras...", "Autor 2", new Date());
        // Adicione os outros itens conforme necessário

        tx.commit();

        em.close();
        factory.close();
    }

    private static void persistirDica(EntityManager em, String titulo, String descricao, String autor, Date dataPublicacao) {
        Dica dica = new Dica(titulo, descricao, autor, dataPublicacao);
        em.persist(dica);
    }
}