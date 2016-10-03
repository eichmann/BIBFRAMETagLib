package edu.uiowa.slis.BIBFRAME.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionMemberType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrderedCollectionMemberType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionMemberType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrderedCollectionMemberIterator theOrderedCollectionMemberIterator = (OrderedCollectionMemberIterator)findAncestorWithClass(this, OrderedCollectionMemberIterator.class);
			pageContext.getOut().print(theOrderedCollectionMemberIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for member tag ");
		}
		return SKIP_BODY;
	}
}

