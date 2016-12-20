package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemIsPartOfIterator theItemIsPartOfIterator = (ItemIsPartOfIterator)findAncestorWithClass(this, ItemIsPartOfIterator.class);
			pageContext.getOut().print(theItemIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

