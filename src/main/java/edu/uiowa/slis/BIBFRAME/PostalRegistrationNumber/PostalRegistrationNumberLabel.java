package edu.uiowa.slis.BIBFRAME.PostalRegistrationNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostalRegistrationNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PostalRegistrationNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PostalRegistrationNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostalRegistrationNumber thePostalRegistrationNumber = (PostalRegistrationNumber)findAncestorWithClass(this, PostalRegistrationNumber.class);
			if (!thePostalRegistrationNumber.commitNeeded) {
				pageContext.getOut().print(thePostalRegistrationNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostalRegistrationNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PostalRegistrationNumber thePostalRegistrationNumber = (PostalRegistrationNumber)findAncestorWithClass(this, PostalRegistrationNumber.class);
			return thePostalRegistrationNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostalRegistrationNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PostalRegistrationNumber thePostalRegistrationNumber = (PostalRegistrationNumber)findAncestorWithClass(this, PostalRegistrationNumber.class);
			thePostalRegistrationNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PostalRegistrationNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for label tag ");
		}
	}
}

