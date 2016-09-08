package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasOriginalVersionIterator theCollectionHasOriginalVersionIterator = (CollectionHasOriginalVersionIterator)findAncestorWithClass(this, CollectionHasOriginalVersionIterator.class);
			pageContext.getOut().print(theCollectionHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

