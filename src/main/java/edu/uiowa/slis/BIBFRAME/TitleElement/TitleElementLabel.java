package edu.uiowa.slis.BIBFRAME.TitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleElementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleElementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleElementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TitleElement theTitleElement = (TitleElement)findAncestorWithClass(this, TitleElement.class);
			if (!theTitleElement.commitNeeded) {
				pageContext.getOut().print(theTitleElement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TitleElement theTitleElement = (TitleElement)findAncestorWithClass(this, TitleElement.class);
			return theTitleElement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TitleElement theTitleElement = (TitleElement)findAncestorWithClass(this, TitleElement.class);
			theTitleElement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for label tag ");
		}
	}
}

