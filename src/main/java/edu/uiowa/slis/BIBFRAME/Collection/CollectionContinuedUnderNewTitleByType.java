package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionContinuedUnderNewTitleByIterator theCollectionContinuedUnderNewTitleByIterator = (CollectionContinuedUnderNewTitleByIterator)findAncestorWithClass(this, CollectionContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theCollectionContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

