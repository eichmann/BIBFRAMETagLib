package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemDimensions extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemDimensions currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemDimensions.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ItemDimensionsIterator theItem = (ItemDimensionsIterator)findAncestorWithClass(this, ItemDimensionsIterator.class);
			pageContext.getOut().print(theItem.getDimensions());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for dimensions tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for dimensions tag ");
		}
		return SKIP_BODY;
	}
}

