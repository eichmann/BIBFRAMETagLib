package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionTranslatesIterator theCollectionTranslatesIterator = (CollectionTranslatesIterator)findAncestorWithClass(this, CollectionTranslatesIterator.class);
			pageContext.getOut().print(theCollectionTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for translates tag ");
		}
		return SKIP_BODY;
	}
}

