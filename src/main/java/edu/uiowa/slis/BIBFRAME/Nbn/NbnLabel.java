package edu.uiowa.slis.BIBFRAME.Nbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbnLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbnLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NbnLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nbn theNbn = (Nbn)findAncestorWithClass(this, Nbn.class);
			if (!theNbn.commitNeeded) {
				pageContext.getOut().print(theNbn.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nbn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Nbn theNbn = (Nbn)findAncestorWithClass(this, Nbn.class);
			return theNbn.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nbn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Nbn theNbn = (Nbn)findAncestorWithClass(this, Nbn.class);
			theNbn.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Nbn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for label tag ");
		}
	}
}

