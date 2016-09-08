package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsPartOfIterator theCollectionIsPartOfIterator = (CollectionIsPartOfIterator)findAncestorWithClass(this, CollectionIsPartOfIterator.class);
			pageContext.getOut().print(theCollectionIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

