package edu.uiowa.slis.BIBFRAME.OclcIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OclcIdentifierLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OclcIdentifierLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OclcIdentifierLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OclcIdentifier theOclcIdentifier = (OclcIdentifier)findAncestorWithClass(this, OclcIdentifier.class);
			if (!theOclcIdentifier.commitNeeded) {
				pageContext.getOut().print(theOclcIdentifier.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OclcIdentifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OclcIdentifier theOclcIdentifier = (OclcIdentifier)findAncestorWithClass(this, OclcIdentifier.class);
			return theOclcIdentifier.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OclcIdentifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OclcIdentifier theOclcIdentifier = (OclcIdentifier)findAncestorWithClass(this, OclcIdentifier.class);
			theOclcIdentifier.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OclcIdentifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for label tag ");
		}
	}
}

