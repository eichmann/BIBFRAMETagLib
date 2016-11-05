package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRelationIterator theCollectionRelationIterator = (CollectionRelationIterator)findAncestorWithClass(this, CollectionRelationIterator.class);
			pageContext.getOut().print(theCollectionRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for relation tag ");
		}
		return SKIP_BODY;
	}
}

