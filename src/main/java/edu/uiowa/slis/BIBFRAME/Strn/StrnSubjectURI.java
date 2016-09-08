package edu.uiowa.slis.BIBFRAME.Strn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StrnSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StrnSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StrnSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Strn theStrn = (Strn)findAncestorWithClass(this, Strn.class);
			if (!theStrn.commitNeeded) {
				pageContext.getOut().print(theStrn.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Strn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Strn theStrn = (Strn)findAncestorWithClass(this, Strn.class);
			return theStrn.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Strn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Strn theStrn = (Strn)findAncestorWithClass(this, Strn.class);
			theStrn.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Strn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for subjectURI tag ");
		}
	}
}

