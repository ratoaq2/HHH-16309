package org.hibernate.envers.bugs;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;

@Embeddable
@MappedSuperclass
public abstract class AbstractEmbeddable {

	@Column(length = 123)
	private String parentEmbeddableProp;
}
