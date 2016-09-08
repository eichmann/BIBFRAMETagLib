package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			if (!thePrint.commitNeeded) {
				pageContext.getOut().print(thePrint.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Print for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			return thePrint.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Print for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			thePrint.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Print for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for label tag ");
		}
	}
}

