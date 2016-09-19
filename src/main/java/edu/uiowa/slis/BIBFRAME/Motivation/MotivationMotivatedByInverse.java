package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationMotivatedByInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationMotivatedByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationMotivatedByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationMotivatedByInverseIterator theMotivationMotivatedByInverseIterator = (MotivationMotivatedByInverseIterator)findAncestorWithClass(this, MotivationMotivatedByInverseIterator.class);
			pageContext.getOut().print(theMotivationMotivatedByInverseIterator.getMotivatedByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for motivatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for motivatedBy tag ");
		}
		return SKIP_BODY;
	}
}

