package org.hibernate.envers.bugs;

import org.hibernate.envers.Audited;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Audited
@Entity
@Table(name = "MY_TABLE")
public class MyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Embedded
	@AttributeOverride(name = "parentEmbeddableProp", column = @Column(name = "PARENT_EMBEDDABLE_COLUMN"))
	@AttributeOverride(name = "myEmbeddableProp", column = @Column(name = "MY_EMBEDDABLE_COLUMN"))
	private MyEmbeddable myEmbeddable = new MyEmbeddable();

}