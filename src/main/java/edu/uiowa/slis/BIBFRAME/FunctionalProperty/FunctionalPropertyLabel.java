package edu.uiowa.slis.BIBFRAME.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FunctionalPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyLabelIterator theFunctionalProperty = (FunctionalPropertyLabelIterator)findAncestorWithClass(this, FunctionalPropertyLabelIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

