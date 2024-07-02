import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Dica.class)
public abstract class Dica_ {

	public static volatile SingularAttribute<Dica, String> titulo;
	public static volatile SingularAttribute<Dica, Date> dataPublicacao;
	public static volatile SingularAttribute<Dica, Long> id;
	public static volatile SingularAttribute<Dica, String> autor;
	public static volatile SingularAttribute<Dica, String> descricao;

	public static final String TITULO = "titulo";
	public static final String DATA_PUBLICACAO = "dataPublicacao";
	public static final String ID = "id";
	public static final String AUTOR = "autor";
	public static final String DESCRICAO = "descricao";

}

