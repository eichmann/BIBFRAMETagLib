package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsLastOfIterator theCollectionIsLastOfIterator = (CollectionIsLastOfIterator)findAncestorWithClass(this, CollectionIsLastOfIterator.class);
			pageContext.getOut().print(theCollectionIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}
