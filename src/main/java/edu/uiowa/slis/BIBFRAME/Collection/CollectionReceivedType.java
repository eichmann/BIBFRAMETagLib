package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionReceivedIterator theCollectionReceivedIterator = (CollectionReceivedIterator)findAncestorWithClass(this, CollectionReceivedIterator.class);
			pageContext.getOut().print(theCollectionReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for received tag ");
		}
		return SKIP_BODY;
	}
}

