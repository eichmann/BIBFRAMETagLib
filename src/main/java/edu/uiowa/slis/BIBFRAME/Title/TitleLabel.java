package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Title theTitle = (Title)findAncestorWithClass(this, Title.class);
			if (!theTitle.commitNeeded) {
				pageContext.getOut().print(theTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Title for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Title theTitle = (Title)findAncestorWithClass(this, Title.class);
			return theTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Title for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Title theTitle = (Title)findAncestorWithClass(this, Title.class);
			theTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Title for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for label tag ");
		}
	}
}

