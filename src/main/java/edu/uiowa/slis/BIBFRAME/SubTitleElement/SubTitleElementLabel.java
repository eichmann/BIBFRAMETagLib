package edu.uiowa.slis.BIBFRAME.SubTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubTitleElementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SubTitleElementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SubTitleElementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SubTitleElement theSubTitleElement = (SubTitleElement)findAncestorWithClass(this, SubTitleElement.class);
			if (!theSubTitleElement.commitNeeded) {
				pageContext.getOut().print(theSubTitleElement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SubTitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SubTitleElement theSubTitleElement = (SubTitleElement)findAncestorWithClass(this, SubTitleElement.class);
			return theSubTitleElement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SubTitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SubTitleElement theSubTitleElement = (SubTitleElement)findAncestorWithClass(this, SubTitleElement.class);
			theSubTitleElement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SubTitleElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for label tag ");
		}
	}
}

