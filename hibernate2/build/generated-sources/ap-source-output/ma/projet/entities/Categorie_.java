package ma.projet.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categorie.class)
public abstract class Categorie_ {

	public static volatile ListAttribute<Categorie, Produit> produits;
	public static volatile SingularAttribute<Categorie, String> code;
	public static volatile SingularAttribute<Categorie, String> libelle;
	public static volatile SingularAttribute<Categorie, Integer> id;

}

