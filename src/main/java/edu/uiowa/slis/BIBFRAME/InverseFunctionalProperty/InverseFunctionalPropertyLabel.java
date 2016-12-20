package edu.uiowa.slis.BIBFRAME.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InverseFunctionalPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalProperty theInverseFunctionalProperty = (InverseFunctionalProperty)findAncestorWithClass(this, InverseFunctionalProperty.class);
			if (!theInverseFunctionalProperty.commitNeeded) {
				pageContext.getOut().print(theInverseFunctionalProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			InverseFunctionalProperty theInverseFunctionalProperty = (InverseFunctionalProperty)findAncestorWithClass(this, InverseFunctionalProperty.class);
			return theInverseFunctionalProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing InverseFunctionalProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			InverseFunctionalProperty theInverseFunctionalProperty = (InverseFunctionalProperty)findAncestorWithClass(this, InverseFunctionalProperty.class);
			theInverseFunctionalProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for label tag ");
		}
	}
}

