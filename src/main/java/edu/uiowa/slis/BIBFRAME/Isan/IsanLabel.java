package edu.uiowa.slis.BIBFRAME.Isan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsanLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsanLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IsanLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isan theIsan = (Isan)findAncestorWithClass(this, Isan.class);
			if (!theIsan.commitNeeded) {
				pageContext.getOut().print(theIsan.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isan for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Isan theIsan = (Isan)findAncestorWithClass(this, Isan.class);
			return theIsan.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isan for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Isan theIsan = (Isan)findAncestorWithClass(this, Isan.class);
			theIsan.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Isan for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for label tag ");
		}
	}
}

