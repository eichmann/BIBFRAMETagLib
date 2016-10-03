package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMarkTopConceptOfIterator theDdcShelfMarkTopConceptOfIterator = (DdcShelfMarkTopConceptOfIterator)findAncestorWithClass(this, DdcShelfMarkTopConceptOfIterator.class);
			pageContext.getOut().print(theDdcShelfMarkTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

