package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkTopConceptOfIterator theShelfMarkTopConceptOfIterator = (ShelfMarkTopConceptOfIterator)findAncestorWithClass(this, ShelfMarkTopConceptOfIterator.class);
			pageContext.getOut().print(theShelfMarkTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

