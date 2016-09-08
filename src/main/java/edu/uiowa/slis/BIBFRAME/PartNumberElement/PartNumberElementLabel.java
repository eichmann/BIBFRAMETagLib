package edu.uiowa.slis.BIBFRAME.PartNumberElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNumberElementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNumberElementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNumberElementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PartNumberElement thePartNumberElement = (PartNumberElement)findAncestorWithClass(this, PartNumberElement.class);
			if (!thePartNumberElement.commitNeeded) {
				pageContext.getOut().print(thePartNumberElement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartNumberElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PartNumberElement thePartNumberElement = (PartNumberElement)findAncestorWithClass(this, PartNumberElement.class);
			return thePartNumberElement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PartNumberElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PartNumberElement thePartNumberElement = (PartNumberElement)findAncestorWithClass(this, PartNumberElement.class);
			thePartNumberElement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PartNumberElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for label tag ");
		}
	}
}

