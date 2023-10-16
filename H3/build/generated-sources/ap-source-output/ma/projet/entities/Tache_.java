package ma.projet.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tache.class)
public abstract class Tache_ {

	public static volatile ListAttribute<Tache, EmployeTache> employetaches;
	public static volatile SingularAttribute<Tache, Date> dateDebut;
	public static volatile SingularAttribute<Tache, Double> prix;
	public static volatile SingularAttribute<Tache, Projet> projet;
	public static volatile SingularAttribute<Tache, Integer> id;
	public static volatile SingularAttribute<Tache, Date> dateFin;
	public static volatile SingularAttribute<Tache, String> nom;

}

