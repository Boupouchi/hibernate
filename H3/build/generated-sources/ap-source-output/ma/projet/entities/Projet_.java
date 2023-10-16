package ma.projet.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Projet.class)
public abstract class Projet_ {

	public static volatile SingularAttribute<Projet, Date> dateDebut;
	public static volatile SingularAttribute<Projet, Employe> employe;
	public static volatile ListAttribute<Projet, Tache> taches;
	public static volatile SingularAttribute<Projet, Integer> id;
	public static volatile SingularAttribute<Projet, Date> dateFin;
	public static volatile SingularAttribute<Projet, String> nom;

}

