package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RunningTitle theRunningTitle = (RunningTitle)findAncestorWithClass(this, RunningTitle.class);
			if (!theRunningTitle.commitNeeded) {
				pageContext.getOut().print(theRunningTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			RunningTitle theRunningTitle = (RunningTitle)findAncestorWithClass(this, RunningTitle.class);
			return theRunningTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing RunningTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			RunningTitle theRunningTitle = (RunningTitle)findAncestorWithClass(this, RunningTitle.class);
			theRunningTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for label tag ");
		}
	}
}

