package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasPartIterator theCollectionHasPartIterator = (CollectionHasPartIterator)findAncestorWithClass(this, CollectionHasPartIterator.class);
			pageContext.getOut().print(theCollectionHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

