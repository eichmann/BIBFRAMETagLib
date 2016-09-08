package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSupersededByIterator theCollectionSupersededByIterator = (CollectionSupersededByIterator)findAncestorWithClass(this, CollectionSupersededByIterator.class);
			pageContext.getOut().print(theCollectionSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

