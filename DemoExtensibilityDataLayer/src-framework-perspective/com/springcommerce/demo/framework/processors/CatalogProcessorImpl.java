package com.springcommerce.demo.framework.processors;

import com.springcommerce.demo.framework.domain.AbstractCatalog;

public class CatalogProcessorImpl implements CatalogProcessor {

	/* (non-Javadoc)
	 * @see com.springcommerce.demo.framework.processors.PersonProcessor#alterPerson(com.springcommerce.demo.framework.domain.Person)
	 */
	public void alterCatalog(AbstractCatalog catalog) {
		String color = catalog.getColor();
		if (color.equals("green")) {
			catalog.setStyle("stylish");
		}
	}
	
}