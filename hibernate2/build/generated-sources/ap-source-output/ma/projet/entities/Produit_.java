package ma.projet.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produit.class)
public abstract class Produit_ {

	public static volatile SingularAttribute<Produit, String> reference;
	public static volatile SingularAttribute<Produit, Categorie> categorie;
	public static volatile SingularAttribute<Produit, Double> prix;
	public static volatile SingularAttribute<Produit, Integer> id;

}

