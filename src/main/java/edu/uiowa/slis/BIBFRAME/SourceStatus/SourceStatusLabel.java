package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SourceStatus theSourceStatus = (SourceStatus)findAncestorWithClass(this, SourceStatus.class);
			if (!theSourceStatus.commitNeeded) {
				pageContext.getOut().print(theSourceStatus.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SourceStatus theSourceStatus = (SourceStatus)findAncestorWithClass(this, SourceStatus.class);
			return theSourceStatus.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SourceStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SourceStatus theSourceStatus = (SourceStatus)findAncestorWithClass(this, SourceStatus.class);
			theSourceStatus.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for label tag ");
		}
	}
}

