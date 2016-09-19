package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRelationInverseIterator theCollectionRelationInverseIterator = (CollectionRelationInverseIterator)findAncestorWithClass(this, CollectionRelationInverseIterator.class);
			pageContext.getOut().print(theCollectionRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for relation tag ");
		}
		return SKIP_BODY;
	}
}

