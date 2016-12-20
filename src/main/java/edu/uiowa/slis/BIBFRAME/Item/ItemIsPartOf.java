package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemIsPartOfIterator theItemIsPartOfIterator = (ItemIsPartOfIterator)findAncestorWithClass(this, ItemIsPartOfIterator.class);
			pageContext.getOut().print(theItemIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

