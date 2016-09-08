package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasInstanceIterator theCollectionHasInstanceIterator = (CollectionHasInstanceIterator)findAncestorWithClass(this, CollectionHasInstanceIterator.class);
			pageContext.getOut().print(theCollectionHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

