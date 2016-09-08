package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemGovernedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemGovernedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemGovernedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemGovernedByIterator theItemGovernedByIterator = (ItemGovernedByIterator)findAncestorWithClass(this, ItemGovernedByIterator.class);
			pageContext.getOut().print(theItemGovernedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for governedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for governedBy tag ");
		}
		return SKIP_BODY;
	}
}

