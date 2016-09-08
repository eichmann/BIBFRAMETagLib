package edu.uiowa.slis.BIBFRAME.Ansi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnsiLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnsiLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AnsiLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ansi theAnsi = (Ansi)findAncestorWithClass(this, Ansi.class);
			if (!theAnsi.commitNeeded) {
				pageContext.getOut().print(theAnsi.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ansi for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Ansi theAnsi = (Ansi)findAncestorWithClass(this, Ansi.class);
			return theAnsi.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ansi for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Ansi theAnsi = (Ansi)findAncestorWithClass(this, Ansi.class);
			theAnsi.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Ansi for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for label tag ");
		}
	}
}

