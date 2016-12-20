package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionAccompaniedByIterator theCollectionAccompaniedByIterator = (CollectionAccompaniedByIterator)findAncestorWithClass(this, CollectionAccompaniedByIterator.class);
			pageContext.getOut().print(theCollectionAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

