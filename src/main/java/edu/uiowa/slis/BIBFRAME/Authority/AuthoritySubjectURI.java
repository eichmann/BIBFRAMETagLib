package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthoritySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthoritySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthoritySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authority theAuthority = (Authority)findAncestorWithClass(this, Authority.class);
			if (!theAuthority.commitNeeded) {
				pageContext.getOut().print(theAuthority.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Authority theAuthority = (Authority)findAncestorWithClass(this, Authority.class);
			return theAuthority.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authority for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Authority theAuthority = (Authority)findAncestorWithClass(this, Authority.class);
			theAuthority.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for subjectURI tag ");
		}
	}
}

