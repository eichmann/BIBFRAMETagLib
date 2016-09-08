package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Item theItem = (Item)findAncestorWithClass(this, Item.class);
			if (!theItem.commitNeeded) {
				pageContext.getOut().print(theItem.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Item for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Item theItem = (Item)findAncestorWithClass(this, Item.class);
			return theItem.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Item for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Item theItem = (Item)findAncestorWithClass(this, Item.class);
			theItem.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Item for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for label tag ");
		}
	}
}

