package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMarkIsClassificationForIterator theDdcShelfMarkIsClassificationForIterator = (DdcShelfMarkIsClassificationForIterator)findAncestorWithClass(this, DdcShelfMarkIsClassificationForIterator.class);
			pageContext.getOut().print(theDdcShelfMarkIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

