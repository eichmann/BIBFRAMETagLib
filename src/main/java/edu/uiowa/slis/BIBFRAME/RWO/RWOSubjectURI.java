package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RWO theRWO = (RWO)findAncestorWithClass(this, RWO.class);
			if (!theRWO.commitNeeded) {
				pageContext.getOut().print(theRWO.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			RWO theRWO = (RWO)findAncestorWithClass(this, RWO.class);
			return theRWO.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing RWO for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			RWO theRWO = (RWO)findAncestorWithClass(this, RWO.class);
			theRWO.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for subjectURI tag ");
		}
	}
}

