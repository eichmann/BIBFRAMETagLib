package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemAgentInverseIterator theItemAgentInverseIterator = (ItemAgentInverseIterator)findAncestorWithClass(this, ItemAgentInverseIterator.class);
			pageContext.getOut().print(theItemAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for agent tag ");
		}
		return SKIP_BODY;
	}
}

