package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TextLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Text theText = (Text)findAncestorWithClass(this, Text.class);
			if (!theText.commitNeeded) {
				pageContext.getOut().print(theText.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Text for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Text theText = (Text)findAncestorWithClass(this, Text.class);
			return theText.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Text for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Text theText = (Text)findAncestorWithClass(this, Text.class);
			theText.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Text for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for label tag ");
		}
	}
}

