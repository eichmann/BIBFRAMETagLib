package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemHasCirculationStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemHasCirculationStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemHasCirculationStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ItemHasCirculationStatusIterator theItemHasCirculationStatusIterator = (ItemHasCirculationStatusIterator)findAncestorWithClass(this, ItemHasCirculationStatusIterator.class);
			pageContext.getOut().print(theItemHasCirculationStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Item for hasCirculationStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for hasCirculationStatus tag ");
		}
		return SKIP_BODY;
	}
}

