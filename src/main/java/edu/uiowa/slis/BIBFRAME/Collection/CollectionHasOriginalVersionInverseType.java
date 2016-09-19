package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasOriginalVersionInverseIterator theCollectionHasOriginalVersionInverseIterator = (CollectionHasOriginalVersionInverseIterator)findAncestorWithClass(this, CollectionHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theCollectionHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

