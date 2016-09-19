package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemHasTitleIterator theItemHasTitleIterator = (ItemHasTitleIterator)findAncestorWithClass(this, ItemHasTitleIterator.class);
			pageContext.getOut().print(theItemHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

