package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			KeyTitle theKeyTitle = (KeyTitle)findAncestorWithClass(this, KeyTitle.class);
			if (!theKeyTitle.commitNeeded) {
				pageContext.getOut().print(theKeyTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			KeyTitle theKeyTitle = (KeyTitle)findAncestorWithClass(this, KeyTitle.class);
			return theKeyTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing KeyTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			KeyTitle theKeyTitle = (KeyTitle)findAncestorWithClass(this, KeyTitle.class);
			theKeyTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for label tag ");
		}
	}
}

