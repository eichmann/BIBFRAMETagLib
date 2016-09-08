package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dissertation theDissertation = (Dissertation)findAncestorWithClass(this, Dissertation.class);
			if (!theDissertation.commitNeeded) {
				pageContext.getOut().print(theDissertation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Dissertation theDissertation = (Dissertation)findAncestorWithClass(this, Dissertation.class);
			return theDissertation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dissertation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Dissertation theDissertation = (Dissertation)findAncestorWithClass(this, Dissertation.class);
			theDissertation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for label tag ");
		}
	}
}

