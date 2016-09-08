package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsUnionOfIterator theCollectionIsUnionOfIterator = (CollectionIsUnionOfIterator)findAncestorWithClass(this, CollectionIsUnionOfIterator.class);
			pageContext.getOut().print(theCollectionIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

