package edu.uiowa.slis.BIBFRAME.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InverseFunctionalPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalPropertyLabelIterator theInverseFunctionalProperty = (InverseFunctionalPropertyLabelIterator)findAncestorWithClass(this, InverseFunctionalPropertyLabelIterator.class);
			pageContext.getOut().print(theInverseFunctionalProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

