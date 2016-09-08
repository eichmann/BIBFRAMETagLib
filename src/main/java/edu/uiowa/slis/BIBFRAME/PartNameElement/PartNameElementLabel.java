package edu.uiowa.slis.BIBFRAME.PartNameElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNameElementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNameElementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNameElementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PartNameElement thePartNameElement = (PartNameElement)findAncestorWithClass(this, PartNameElement.class);
			if (!thePartNameElement.commitNeeded) {
				pageContext.getOut().print(thePartNameElement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartNameElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PartNameElement thePartNameElement = (PartNameElement)findAncestorWithClass(this, PartNameElement.class);
			return thePartNameElement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PartNameElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PartNameElement thePartNameElement = (PartNameElement)findAncestorWithClass(this, PartNameElement.class);
			thePartNameElement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PartNameElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for label tag ");
		}
	}
}

