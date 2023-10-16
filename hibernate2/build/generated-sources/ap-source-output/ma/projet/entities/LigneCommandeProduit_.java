package ma.projet.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LigneCommandeProduit.class)
public abstract class LigneCommandeProduit_ {

	public static volatile SingularAttribute<LigneCommandeProduit, Produit> produit;
	public static volatile SingularAttribute<LigneCommandeProduit, LigneCommandeProduitPK> id;
	public static volatile SingularAttribute<LigneCommandeProduit, Commande> commande;
	public static volatile SingularAttribute<LigneCommandeProduit, Integer> quantite;

}

