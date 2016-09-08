package edu.uiowa.slis.BIBFRAME.MainTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MainTitleElementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MainTitleElementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MainTitleElementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MainTitleElement theMainTitleElement = (MainTitleElement)findAncestorWithClass(this, MainTitleElement.class);
			if (!theMainTitleElement.commitNeeded) {
				pageContext.getOut().print(theMainTitleElement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MainTitleElement theMainTitleElement = (MainTitleElement)findAncestorWithClass(this, MainTitleElement.class);
			return theMainTitleElement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MainTitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MainTitleElement theMainTitleElement = (MainTitleElement)findAncestorWithClass(this, MainTitleElement.class);
			theMainTitleElement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for label tag ");
		}
	}
}

