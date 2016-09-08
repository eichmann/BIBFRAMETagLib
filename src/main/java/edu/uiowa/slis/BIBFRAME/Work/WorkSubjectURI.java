package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Work theWork = (Work)findAncestorWithClass(this, Work.class);
			if (!theWork.commitNeeded) {
				pageContext.getOut().print(theWork.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Work for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Work theWork = (Work)findAncestorWithClass(this, Work.class);
			return theWork.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Work for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Work theWork = (Work)findAncestorWithClass(this, Work.class);
			theWork.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Work for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for subjectURI tag ");
		}
	}
}

