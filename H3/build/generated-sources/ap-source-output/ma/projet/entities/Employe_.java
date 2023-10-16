package ma.projet.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employe.class)
public abstract class Employe_ {

	public static volatile ListAttribute<Employe, EmployeTache> employetaches;
	public static volatile ListAttribute<Employe, Projet> projets;
	public static volatile SingularAttribute<Employe, Integer> telephone;
	public static volatile SingularAttribute<Employe, Integer> id;
	public static volatile SingularAttribute<Employe, String> nom;
	public static volatile SingularAttribute<Employe, String> prenom;

}

