package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationIsClassificationForIterator theLccClassificationIsClassificationForIterator = (LccClassificationIsClassificationForIterator)findAncestorWithClass(this, LccClassificationIsClassificationForIterator.class);
			pageContext.getOut().print(theLccClassificationIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

