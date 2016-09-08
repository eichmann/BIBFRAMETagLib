package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsFirstOfIterator theCollectionIsFirstOfIterator = (CollectionIsFirstOfIterator)findAncestorWithClass(this, CollectionIsFirstOfIterator.class);
			pageContext.getOut().print(theCollectionIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

