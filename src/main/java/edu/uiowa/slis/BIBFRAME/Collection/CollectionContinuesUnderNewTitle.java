package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionContinuesUnderNewTitleIterator theCollectionContinuesUnderNewTitleIterator = (CollectionContinuesUnderNewTitleIterator)findAncestorWithClass(this, CollectionContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theCollectionContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

