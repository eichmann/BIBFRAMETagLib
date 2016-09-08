package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionContinuesUnderNewTitleIterator theCollectionContinuesUnderNewTitleIterator = (CollectionContinuesUnderNewTitleIterator)findAncestorWithClass(this, CollectionContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theCollectionContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

