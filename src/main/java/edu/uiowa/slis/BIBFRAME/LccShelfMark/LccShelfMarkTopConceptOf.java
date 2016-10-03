package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkTopConceptOfIterator theLccShelfMarkTopConceptOfIterator = (LccShelfMarkTopConceptOfIterator)findAncestorWithClass(this, LccShelfMarkTopConceptOfIterator.class);
			pageContext.getOut().print(theLccShelfMarkTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

