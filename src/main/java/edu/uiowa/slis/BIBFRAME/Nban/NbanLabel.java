package edu.uiowa.slis.BIBFRAME.Nban;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbanLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbanLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NbanLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nban theNban = (Nban)findAncestorWithClass(this, Nban.class);
			if (!theNban.commitNeeded) {
				pageContext.getOut().print(theNban.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nban for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Nban theNban = (Nban)findAncestorWithClass(this, Nban.class);
			return theNban.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nban for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Nban theNban = (Nban)findAncestorWithClass(this, Nban.class);
			theNban.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Nban for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for label tag ");
		}
	}
}

