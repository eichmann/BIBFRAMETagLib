package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSeparatedFromIterator theCollectionSeparatedFromIterator = (CollectionSeparatedFromIterator)findAncestorWithClass(this, CollectionSeparatedFromIterator.class);
			pageContext.getOut().print(theCollectionSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

