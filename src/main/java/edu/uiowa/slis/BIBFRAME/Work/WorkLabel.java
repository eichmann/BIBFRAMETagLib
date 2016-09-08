package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Work theWork = (Work)findAncestorWithClass(this, Work.class);
			if (!theWork.commitNeeded) {
				pageContext.getOut().print(theWork.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Work for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Work theWork = (Work)findAncestorWithClass(this, Work.class);
			return theWork.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Work for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Work theWork = (Work)findAncestorWithClass(this, Work.class);
			theWork.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Work for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for label tag ");
		}
	}
}

