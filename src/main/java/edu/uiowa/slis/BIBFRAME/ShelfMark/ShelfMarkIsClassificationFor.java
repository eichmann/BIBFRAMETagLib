package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkIsClassificationForIterator theShelfMarkIsClassificationForIterator = (ShelfMarkIsClassificationForIterator)findAncestorWithClass(this, ShelfMarkIsClassificationForIterator.class);
			pageContext.getOut().print(theShelfMarkIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

