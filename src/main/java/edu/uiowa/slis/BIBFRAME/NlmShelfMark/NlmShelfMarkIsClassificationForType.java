package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkIsClassificationForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkIsClassificationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkIsClassificationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkIsClassificationForIterator theNlmShelfMarkIsClassificationForIterator = (NlmShelfMarkIsClassificationForIterator)findAncestorWithClass(this, NlmShelfMarkIsClassificationForIterator.class);
			pageContext.getOut().print(theNlmShelfMarkIsClassificationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

