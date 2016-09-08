package edu.uiowa.slis.BIBFRAME.Ismn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsmnLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsmnLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IsmnLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ismn theIsmn = (Ismn)findAncestorWithClass(this, Ismn.class);
			if (!theIsmn.commitNeeded) {
				pageContext.getOut().print(theIsmn.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ismn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Ismn theIsmn = (Ismn)findAncestorWithClass(this, Ismn.class);
			return theIsmn.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ismn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Ismn theIsmn = (Ismn)findAncestorWithClass(this, Ismn.class);
			theIsmn.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Ismn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for label tag ");
		}
	}
}

