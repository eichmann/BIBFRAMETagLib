package edu.uiowa.slis.BIBFRAME.IssnL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnLLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnLLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnLLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IssnL theIssnL = (IssnL)findAncestorWithClass(this, IssnL.class);
			if (!theIssnL.commitNeeded) {
				pageContext.getOut().print(theIssnL.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IssnL for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			IssnL theIssnL = (IssnL)findAncestorWithClass(this, IssnL.class);
			return theIssnL.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing IssnL for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			IssnL theIssnL = (IssnL)findAncestorWithClass(this, IssnL.class);
			theIssnL.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing IssnL for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for label tag ");
		}
	}
}

