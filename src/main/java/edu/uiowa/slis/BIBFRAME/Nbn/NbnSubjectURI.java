package edu.uiowa.slis.BIBFRAME.Nbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbnSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbnSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NbnSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nbn theNbn = (Nbn)findAncestorWithClass(this, Nbn.class);
			if (!theNbn.commitNeeded) {
				pageContext.getOut().print(theNbn.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nbn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Nbn theNbn = (Nbn)findAncestorWithClass(this, Nbn.class);
			return theNbn.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nbn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Nbn theNbn = (Nbn)findAncestorWithClass(this, Nbn.class);
			theNbn.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Nbn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for subjectURI tag ");
		}
	}
}

