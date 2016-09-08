package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationIsClassificationForIterator theNlmClassificationIsClassificationForIterator = (NlmClassificationIsClassificationForIterator)findAncestorWithClass(this, NlmClassificationIsClassificationForIterator.class);
			pageContext.getOut().print(theNlmClassificationIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

