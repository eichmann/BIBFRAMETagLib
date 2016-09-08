package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemIsHoldingFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemIsHoldingFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemIsHoldingFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemIsHoldingForIterator theItemIsHoldingForIterator = (ItemIsHoldingForIterator)findAncestorWithClass(this, ItemIsHoldingForIterator.class);
			pageContext.getOut().print(theItemIsHoldingForIterator.getIsHoldingFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for isHoldingFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for isHoldingFor tag ");
		}
		return SKIP_BODY;
	}
}

