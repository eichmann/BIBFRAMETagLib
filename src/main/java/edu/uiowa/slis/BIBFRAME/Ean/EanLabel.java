package edu.uiowa.slis.BIBFRAME.Ean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EanLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EanLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EanLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ean theEan = (Ean)findAncestorWithClass(this, Ean.class);
			if (!theEan.commitNeeded) {
				pageContext.getOut().print(theEan.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ean for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Ean theEan = (Ean)findAncestorWithClass(this, Ean.class);
			return theEan.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ean for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Ean theEan = (Ean)findAncestorWithClass(this, Ean.class);
			theEan.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Ean for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for label tag ");
		}
	}
}

