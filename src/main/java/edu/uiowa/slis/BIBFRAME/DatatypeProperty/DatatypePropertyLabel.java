package edu.uiowa.slis.BIBFRAME.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypePropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DatatypeProperty theDatatypeProperty = (DatatypeProperty)findAncestorWithClass(this, DatatypeProperty.class);
			if (!theDatatypeProperty.commitNeeded) {
				pageContext.getOut().print(theDatatypeProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DatatypeProperty theDatatypeProperty = (DatatypeProperty)findAncestorWithClass(this, DatatypeProperty.class);
			return theDatatypeProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DatatypeProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DatatypeProperty theDatatypeProperty = (DatatypeProperty)findAncestorWithClass(this, DatatypeProperty.class);
			theDatatypeProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for label tag ");
		}
	}
}

