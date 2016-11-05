package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRelationIterator theCollectionRelationIterator = (CollectionRelationIterator)findAncestorWithClass(this, CollectionRelationIterator.class);
			pageContext.getOut().print(theCollectionRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for relation tag ");
		}
		return SKIP_BODY;
	}
}

