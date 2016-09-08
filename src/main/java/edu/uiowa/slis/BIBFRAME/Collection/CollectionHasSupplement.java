package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasSupplementIterator theCollectionHasSupplementIterator = (CollectionHasSupplementIterator)findAncestorWithClass(this, CollectionHasSupplementIterator.class);
			pageContext.getOut().print(theCollectionHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

