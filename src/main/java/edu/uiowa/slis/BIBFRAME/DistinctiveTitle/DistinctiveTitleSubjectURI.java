package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitle theDistinctiveTitle = (DistinctiveTitle)findAncestorWithClass(this, DistinctiveTitle.class);
			if (!theDistinctiveTitle.commitNeeded) {
				pageContext.getOut().print(theDistinctiveTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DistinctiveTitle theDistinctiveTitle = (DistinctiveTitle)findAncestorWithClass(this, DistinctiveTitle.class);
			return theDistinctiveTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DistinctiveTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DistinctiveTitle theDistinctiveTitle = (DistinctiveTitle)findAncestorWithClass(this, DistinctiveTitle.class);
			theDistinctiveTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for subjectURI tag ");
		}
	}
}

