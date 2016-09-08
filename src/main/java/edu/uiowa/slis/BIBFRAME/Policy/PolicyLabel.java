package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Policy thePolicy = (Policy)findAncestorWithClass(this, Policy.class);
			if (!thePolicy.commitNeeded) {
				pageContext.getOut().print(thePolicy.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Policy thePolicy = (Policy)findAncestorWithClass(this, Policy.class);
			return thePolicy.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Policy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Policy thePolicy = (Policy)findAncestorWithClass(this, Policy.class);
			thePolicy.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for label tag ");
		}
	}
}

