package edu.uiowa.slis.BIBFRAME.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionMemberList extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrderedCollectionMemberList currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionMemberList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrderedCollectionMemberListIterator theOrderedCollectionMemberListIterator = (OrderedCollectionMemberListIterator)findAncestorWithClass(this, OrderedCollectionMemberListIterator.class);
			pageContext.getOut().print(theOrderedCollectionMemberListIterator.getMemberList());
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for memberList tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for memberList tag ");
		}
		return SKIP_BODY;
	}
}

