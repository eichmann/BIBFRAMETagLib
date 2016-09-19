package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPrecedesIterator theCollectionPrecedesIterator = (CollectionPrecedesIterator)findAncestorWithClass(this, CollectionPrecedesIterator.class);
			pageContext.getOut().print(theCollectionPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for precedes tag ");
		}
		return SKIP_BODY;
	}
}

