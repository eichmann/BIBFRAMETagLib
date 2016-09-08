package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ShelfMark theShelfMark = (ShelfMark)findAncestorWithClass(this, ShelfMark.class);
			if (!theShelfMark.commitNeeded) {
				pageContext.getOut().print(theShelfMark.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ShelfMark theShelfMark = (ShelfMark)findAncestorWithClass(this, ShelfMark.class);
			return theShelfMark.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ShelfMark theShelfMark = (ShelfMark)findAncestorWithClass(this, ShelfMark.class);
			theShelfMark.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for label tag ");
		}
	}
}

