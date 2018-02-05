package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemName currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ItemNameIterator theItem = (ItemNameIterator)findAncestorWithClass(this, ItemNameIterator.class);
			pageContext.getOut().print(theItem.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for name tag ");
		}
		return SKIP_BODY;
	}
}

