package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkIsClassificationForIterator theLccShelfMarkIsClassificationForIterator = (LccShelfMarkIsClassificationForIterator)findAncestorWithClass(this, LccShelfMarkIsClassificationForIterator.class);
			pageContext.getOut().print(theLccShelfMarkIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

