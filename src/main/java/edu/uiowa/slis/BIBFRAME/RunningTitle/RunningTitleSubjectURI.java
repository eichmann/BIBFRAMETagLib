package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RunningTitle theRunningTitle = (RunningTitle)findAncestorWithClass(this, RunningTitle.class);
			if (!theRunningTitle.commitNeeded) {
				pageContext.getOut().print(theRunningTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			RunningTitle theRunningTitle = (RunningTitle)findAncestorWithClass(this, RunningTitle.class);
			return theRunningTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing RunningTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			RunningTitle theRunningTitle = (RunningTitle)findAncestorWithClass(this, RunningTitle.class);
			theRunningTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for subjectURI tag ");
		}
	}
}

