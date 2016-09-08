package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIdentifiedByIterator theCollectionIdentifiedByIterator = (CollectionIdentifiedByIterator)findAncestorWithClass(this, CollectionIdentifiedByIterator.class);
			pageContext.getOut().print(theCollectionIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

