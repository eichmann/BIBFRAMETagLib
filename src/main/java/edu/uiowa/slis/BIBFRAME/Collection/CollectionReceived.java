package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionReceivedIterator theCollectionReceivedIterator = (CollectionReceivedIterator)findAncestorWithClass(this, CollectionReceivedIterator.class);
			pageContext.getOut().print(theCollectionReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for received tag ");
		}
		return SKIP_BODY;
	}
}

