package org.hibernate.envers.bugs;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MyEmbeddable extends AbstractEmbeddable {
	@Column(length = 456)
	private String myEmbeddableProp;
}
