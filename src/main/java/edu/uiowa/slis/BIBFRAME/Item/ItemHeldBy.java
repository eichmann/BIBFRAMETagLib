package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemHeldBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemHeldBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemHeldBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemHeldByIterator theItemHeldByIterator = (ItemHeldByIterator)findAncestorWithClass(this, ItemHeldByIterator.class);
			pageContext.getOut().print(theItemHeldByIterator.getHeldBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

