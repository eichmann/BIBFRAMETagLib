package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSeparatedIntoIterator theCollectionSeparatedIntoIterator = (CollectionSeparatedIntoIterator)findAncestorWithClass(this, CollectionSeparatedIntoIterator.class);
			pageContext.getOut().print(theCollectionSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

