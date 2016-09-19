package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemHasTitleIterator theItemHasTitleIterator = (ItemHasTitleIterator)findAncestorWithClass(this, ItemHasTitleIterator.class);
			pageContext.getOut().print(theItemHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

